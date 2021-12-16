package fr.eni.enchere.servlet;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.EnchereManager;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class EnchereEnCoursServlet
 */
@WebServlet(name = "EnchereEnCours", urlPatterns = { "/EnchereEnCours" })
public class EnchereEnCoursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EnchereEnCoursServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		
		String nomArticle = (String) session.getAttribute("nomArticle");
		nomArticle = "Gameboy";
		
		try {
			ArticleVendu articleVendu = ArticleVenduManager.getInstance().afficherArticle(nomArticle);
			System.out.println(nomArticle);
			request.setAttribute("article", nomArticle);
	
			String description = articleVendu.getDescription();
			System.out.println("description ca passe " + description);
			request.setAttribute("description", description);
			
			//On verra si on en a besoin 
//			int categorie = articleVendu.getIdCategorie();
//			System.out.println("categorie ca passe " + categorie);
//			request.setAttribute("categorie", categorie);
			
//			int montantEnchere = articleVendu.getEnchere().getMontantEnchere();
//			System.out.println("montantEnchere ca passe " + montantEnchere);
//			request.setAttribute("montantEnchere", montantEnchere);
			
			int prixInitial = articleVendu.getPrixInitial();
			System.out.println("prixInitial ca passe " + prixInitial);
			request.setAttribute("prixInitial", prixInitial);
			
			LocalDateTime dateFinEnchere = articleVendu.getDateFinEnchere();
			System.out.println("dateFinEnchere ca passe " + dateFinEnchere);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.FRENCH);
			String formatDateTime = dateFinEnchere.format(formatter);
			request.setAttribute("dateFinEnchere", formatDateTime);
			
//			//Enchere enchere = null;
//			Enchere enchereEnCours = EnchereManager.getInstance().selectByIdArticle(idArticle);
//			int montantEnchere = Enchere.
//			System.out.println(enchere.getMontantEnchere());
//			request.setAttribute("meilleureOffre", enchere.getMontantEnchere());
//		
//			ArticleVendu articleVenduByPseudo = ArticleVenduManager.getInstance().selectByUser(id)
//			
//			if(articleVendu.getUtilisateur().getPseudo() != null) {
//				articleVenduByPseudo = " no data found";
//				request.setAttribute("pseudo", articleVendu.getUtilisateur().getPseudo());
//			} else {
//				
//				articleVenduByPseudo = articleVendu.getUtilisateur().getPseudo();
//			}
			
//			String pseudo = articleVendu.getUtilisateur().getPseudo();
//			System.out.println("pseudo ca passe " + pseudo);
			


		} catch (BLLException e) {

			e.printStackTrace();
		}
	

		getServletContext().getRequestDispatcher("/WEB-INF/jsp/EnchereEnCour.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
