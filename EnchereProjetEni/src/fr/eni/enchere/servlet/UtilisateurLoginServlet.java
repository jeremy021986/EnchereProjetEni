package fr.eni.enchere.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.UserLogin;

/**
 * Servlet implementation class UtilisateurLoginServlet
 */
@WebServlet(description = "Connexion", urlPatterns = { "/Connexion" })
public class UtilisateurLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public UtilisateurLoginServlet() {
        super();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String mot_de_passe = request.getParameter("mot_de_passe");
         
        UserLogin userLogin = new UserLogin();
         
        try {
            Utilisateur utilisateur = userLogin.checkLogin(email, mot_de_passe);
            String destinationPage = "Connexion.jsp";
             
            if (utilisateur != null) {
                HttpSession session = request.getSession();
                session.setAttribute("utilisateur", utilisateur);
                destinationPage = "Accueil.jsp";
            } else {
                String message = "email ou mot de passe incorrect(s)";
                request.setAttribute("message", message);
            }
             
            RequestDispatcher dispatcher = request.getRequestDispatcher(destinationPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}
