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
 * Servlet implementation class PageConnexionServlet
 */
@WebServlet(description = "PageConnexion", urlPatterns = { "/PageConnexion" })
public class PageConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Connexion.jsp").forward(request, response);
		
		
		
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pseudo = request.getParameter("pseudo");
		String motDePasse = request.getParameter("motDePasse");
		String verif = null;
		Boolean mdpValide = true;
		Utilisateur leProfil;
		String leMdp = null;
		
		try {
			leProfil = UtilisateurManager.getInstance().afficherProfil(pseudo);
			if (leProfil != null) {
				leMdp = UtilisateurManager.getInstance().afficherProfil(pseudo).getMotDePasse();
			}
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (motDePasse.equals(leMdp)) {
			mdpValide = true;
			
			verif = "/WEB-INF/jsp/Principale.jsp";
		} else {
			mdpValide = false;
			verif = "/WEB-INF/jsp/Connexion.jsp";

		}
		HttpSession session = request.getSession();
		session.setAttribute("pseudo", pseudo);
		request.setAttribute("mdpValide", mdpValide);
		RequestDispatcher aiguilleur = getServletContext().getRequestDispatcher(verif);
		aiguilleur.forward(request, response);
		
		
	}
		//response.sendRedirect("./PagePrincipale");
		
	


}
