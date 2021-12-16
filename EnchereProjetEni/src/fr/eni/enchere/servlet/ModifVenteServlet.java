package fr.eni.enchere.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class ModifVenteServlet
 */
@WebServlet("/modificationvente")
public class ModifVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String nomArticle = (String) session.getAttribute("nomArticle");
		nomArticle = "Gameboy";
		
		try {
			ArticleVendu articleVendu = ArticleVenduManager.getInstance().afficherArticle(nomArticle);
			// Pour récupérer le nom de l'article par rapport à son id
			//String article = articleVendu.getNomArticle();
			System.out.println(nomArticle);
			request.setAttribute("article", nomArticle);
			
			String description = articleVendu.getDescription();
			System.out.println("description ca passe " + description);
			request.setAttribute("description", description);
			
			int initialPrice = articleVendu.getPrixInitial();
			System.out.println("initialPrice ca passe " + initialPrice);
			request.setAttribute("initialPrice", initialPrice);
			
			
			int misePrix = articleVendu.getPrixVente();
			System.out.println("prix ca passe " + misePrix);
			request.setAttribute("misePrix", misePrix);
			
			LocalDateTime debutEnchere = articleVendu.getDateDebutEnchere();
			System.out.println("debutEnchere ca passe " + debutEnchere);
			request.setAttribute("debutEnchere", debutEnchere);
			
			LocalDateTime finEnchere = articleVendu.getDateFinEnchere();
			System.out.println("finEnchere ca passe " + finEnchere);
			request.setAttribute("finEnchere", finEnchere);
			
//			String street = articleVendu.getLieuRetrait().getRue();
//			System.out.println("street ca passe " + street);
//			request.setAttribute("street", street);
//			
//			String zip = articleVendu.getLieuRetrait().getCodePostal();
//			request.setAttribute("zip", zip);
//			
//			String city = articleVendu.getLieuRetrait().getVille();
//			request.setAttribute("city", city);

		} catch (BLLException e) {

			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/ModifVente.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String article = request.getParameter("modifArticle");
        System.out.println(article);
        String categorie = request.getParameter("modifCategorie");
        String description = request.getParameter("modifDescription");
        int miseAPrix = Integer.parseInt(request.getParameter("modifMiseAPrix"));
        String debutEnchere = request.getParameter("modifDebutEnchere");
        String finEnchere = request.getParameter("modifFinEnchere");
        String rue = request.getParameter("modifRue");
        String cp = request.getParameter("modifCP");
        String ville = request.getParameter("modifVille");
     
        Retrait retrait = new Retrait(rue, cp, ville);
        retrait.setRue(rue);
        retrait.setCodePostal(cp);
        retrait.setVille(ville);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        //convert String to LocalDate
        LocalDateTime startEnchere = LocalDateTime.parse(debutEnchere, formatter);
        LocalDateTime  endEnchere = LocalDateTime.parse(finEnchere, formatter);
        
        
        try {
        	HttpSession session = request.getSession();
        	String oldArticle = (String)session.getAttribute("nomArticle");
        	int idArticle = ArticleVenduManager.getInstance().afficherArticle(oldArticle).getIdArticle();	   
        	ArticleVenduManager.getInstance().updateArticle(idArticle, article, categorie, description, miseAPrix, startEnchere, endEnchere, retrait);
        	
        
        } catch (BLLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RequestDispatcher aiguilleur = getServletContext().getRequestDispatcher("/WEB-INF/jsp/Principale.jsp");
        aiguilleur.forward(request, response);

    
	//response.sendRedirect("./PagePrincipale");
}

}
