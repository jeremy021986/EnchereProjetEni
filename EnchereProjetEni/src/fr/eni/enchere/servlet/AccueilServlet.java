package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet(name = "accueil", urlPatterns = { "/accueil" } )
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("AccueilServlet - doGet");
		
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/PageAccueil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nomArticle = request.getParameter("nomArticle");
		ArticleVendu laRecherche;
		String verifChampRempli = null;
		
		try {
			laRecherche = ArticleVenduManager.getInstance().rechercher(nomArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.setAttribute("nomArticle", nomArticle);
		
		RequestDispatcher aiguilleur = getServletContext().getRequestDispatcher(verifChampRempli);
		aiguilleur.forward(request, response);
	}
		

}
