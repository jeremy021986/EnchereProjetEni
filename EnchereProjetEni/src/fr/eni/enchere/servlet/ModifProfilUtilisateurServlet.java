package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class ModifProfilUtilisateurServlet
 */
@WebServlet(description = "ModifProfilUtilisateur", urlPatterns = { "/ModifProfilUtilisateur" })
public class ModifProfilUtilisateurServlet extends HttpServlet {
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
			request.setAttribute("pseudo", pseudo);
			String nom = utilisateur.getNom();
			request.setAttribute("nom", nom);
			String prenom = utilisateur.getPrenom();
			request.setAttribute("prenom", prenom);
			String email = utilisateur.getEmail();
			request.setAttribute("email", email);
			String tel = utilisateur.getTelephone();
			request.setAttribute("tel", tel);
			String rue = utilisateur.getRue();
			request.setAttribute("rue", rue);
			String cp = utilisateur.getCodePostal();
			request.setAttribute("cp", cp);
			String ville = utilisateur.getVille();
			request.setAttribute("ville", ville);
			String mdp = utilisateur.getMotDePasse();
			request.setAttribute("mdp", mdp);
			int credit = utilisateur.getCredit();
			request.setAttribute("credit", credit);

		} catch (BLLException e) {

			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/ModifProfilUtilisateur.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pseudo = request.getParameter("modifPseudo");
		System.out.println(pseudo);
		String nom = request.getParameter("modifNom");
		String prenom = request.getParameter("modifPrenom");
		String email = request.getParameter("modifEmail");
		String tel = request.getParameter("modifTel");
		String rue = request.getParameter("modifRue");
		String cp = request.getParameter("modifCp");
		String ville = request.getParameter("modifVille");
		String mdp = request.getParameter("mdp");

		try {
			HttpSession session = request.getSession();
			String ancienPseudo = (String) session.getAttribute("pseudo");

			int idUtilisateur = UtilisateurManager.getInstance().affichageProfil(ancienPseudo).getIdUtilisateur();
			UtilisateurManager.getInstance().update(idUtilisateur, pseudo, nom, prenom, email, tel, rue, cp, ville,
					mdp);
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher aiguilleur = getServletContext().getRequestDispatcher("/WEB-INF/jsp/Principale.jsp");
		aiguilleur.forward(request, response);
		// response.sendRedirect("./PagePrincipale");
	}

}
