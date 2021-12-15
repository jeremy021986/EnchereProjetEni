package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.UtilisateurDAO;

/**
 * Servlet implementation class PageInscriptionServlet
 */
@WebServlet(description = "PageInscriptionServlet", urlPatterns = { "/PageInscription" })
public class PageInscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur();
		boolean testP, testM;

		testP = UtilisateurDAO.verifPseudo(request.getParameter("creaPseudo"));
		testM = UtilisateurDAO.verifMail(request.getParameter("creaEmail"));
		
	
		if (testP == false) {
			request.setAttribute("erreurPseudo", "Ce pseudo est déjà utilisé, veuillez en saisir un autre.");
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp").forward(request, response);	
			} else if(testM == false) {
				request.setAttribute("erreurMail", "Ce mail est déjà utilisé, veuillez en saisir un autre.");
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp").forward(request, response);
				} 
		
		utilisateur.setPseudo(request.getParameter("creaPseudo"));
		utilisateur.setNom(request.getParameter("creaNom"));
		utilisateur.setPrenom(request.getParameter("creaPrenom"));
		utilisateur.setEmail(request.getParameter("creaEmail"));
		utilisateur.setTelephone(request.getParameter("creaTel"));
		utilisateur.setCodePostal(request.getParameter("creaCP"));
		utilisateur.setRue(request.getParameter("creaRue"));
		utilisateur.setVille(request.getParameter("creaVille"));
		utilisateur.setMotDePasse(request.getParameter("creaMdp"));
		utilisateur.setCredit(100);
		utilisateur.setAdministrateur(false);

		List<String> allPseudos;

		try {
			allPseudos = UtilisateurManager.selectAllPseudos();
			if (allPseudos.contains(request.getParameter("creaPseudo"))) {
				request.setAttribute("erreur", "Ce pseudo est déjà utilisé, veuillez en saisir un autre.");
				RequestDispatcher aiguilleur = getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp");
				aiguilleur.forward(request, response);
			}
			else if  (request.getParameter("creaMdp").equals(request.getParameter("confirmMdp"))) {

				UtilisateurManager.getInstance().insert(utilisateur);
				HttpSession session = request.getSession();
				session.setAttribute("pseudo", request.getParameter("creaPseudo"));
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Principale.jsp").forward(request, response);
			}
			
		} catch (DALException e) {
			 e.printStackTrace();
		
		}
	}
}