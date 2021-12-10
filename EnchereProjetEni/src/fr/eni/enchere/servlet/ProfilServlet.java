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

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class ProfilServlet
 */
@WebServlet(description = "Profil", urlPatterns = { "/Profil" })
public class ProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
			
				
				
				
				
			} catch (BLLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/ProfilUtilisateur.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

}