package fr.eni.enchere.servlet;

import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bll.BLLException;

import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.ArticleVendu;

import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class PublicationVenteServlet
 */
@WebServlet(description = "PublicationVente", urlPatterns = { "/PublicationVente" })
public class PublicationVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String pseudo = (String) session.getAttribute("pseudo");
		try {
			Utilisateur utilisateur = UtilisateurManager.getInstance().affichageProfil(pseudo);
			String rue = utilisateur.getRue();
			request.setAttribute("rue", rue);
			String cp = utilisateur.getCodePostal();
			request.setAttribute("cp", cp);
			String ville = utilisateur.getVille();
			request.setAttribute("ville", ville);
		} catch (BLLException e) {
			e.printStackTrace();
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vente.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.err.println(request.getParameter("prixInitial"));
		
		HttpSession session = request.getSession();
		String pseudo = (String) session.getAttribute("pseudo");
		ArticleVendu articleAjoute = new ArticleVendu();
		// Utilisateur utilisateur = (Utilisateur) session.getAttribute("pseudo");

		try {
			// int categorieId =
			// Integer.parseInt(CategorieManager.getInstance().selectionnerCategorieById(categorieId));
			String nom = request.getParameter("article");
			String description = request.getParameter("description");
			// LocalDate dateDebutEncheres =
			// LocalDate.parse(request.getParameter("debutEnchere"));
			// LocalDate dateFinEncheres =
			// LocalDate.parse(request.getParameter("finEnchere"));
			int prixInitial = Integer.parseInt(request.getParameter("prixInitial"));
			int categorie = Integer.parseInt(request.getParameter("categorie"));

			String debutEnchere = request.getParameter("debutEnchere");
			String finEnchere = request.getParameter("finEnchere");

			articleAjoute.setNomArticle(request.getParameter("article"));

			articleAjoute.setNomArticle(nom);
			articleAjoute.setDescription(description);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			// convert String to LocalDate
			LocalDateTime startEnchere = LocalDateTime.parse(debutEnchere, formatter);
			LocalDateTime endEnchere = LocalDateTime.parse(finEnchere, formatter);

			articleAjoute.setDateDebutEnchere(startEnchere);
			articleAjoute.setDateFinEnchere(endEnchere);
			articleAjoute.setPrixInitial(prixInitial);
			articleAjoute.setIdCategorie(categorie);
			// articleAjoute.setLieuRetrait(retrait);
			// articleAjoute.setVendeur(utilisateur);
			// RetraitManager.getInstance().ajouterLieuRetrait(retrait);
			ArticleVenduManager.getInstance().insertArticle(articleAjoute);
			// request.setAttribute("ArticleAffiche", articleAjoute);

		} catch (Exception e) {
		e.printStackTrace();

		}
	}
}
