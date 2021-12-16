package fr.eni.enchere.servlet;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bll.CategorieManager;
import fr.eni.enchere.bll.RetraitManager;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
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
		// TODO Auto-generated method stub

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vente.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.err.println(request.getParameter("prixInitial"));

		HttpSession session = request.getSession();
		Retrait retrait = new Retrait();
		ArticleVendu articleAjoute = new ArticleVendu();

		try {
			String nom = request.getParameter("article");
			String description = request.getParameter("description");
			LocalDate dateDebutEncheres = LocalDate.parse(request.getParameter("debutEnchere"));
			LocalDate dateFinEncheres = LocalDate.parse(request.getParameter("finEnchere"));
			int prixInitial = Integer.parseInt(request.getParameter("prixInitial"));
			int categorie = Integer.parseInt(request.getParameter("categorie"));
			String rue = request.getParameter("rue");
			String codePostal = request.getParameter("codepostal");
			String ville = request.getParameter("ville");

			Categorie categorieId = CategorieManager.getInstance().selectionnerCategorieById(categorie);
		//	Utilisateur utilisateur = (Utilisateur) session.getAttribute("pseudo");

			
			
			retrait.setRue(rue);
			retrait.setCodePostal(codePostal);
			retrait.setVille(ville);

			//articleAjoute.setNomArticle(request.getParameter("article"));
			
			articleAjoute.setNomArticle(nom);
			articleAjoute.setDescription(description);
			articleAjoute.setDateDebutEnchere(dateDebutEncheres);
			articleAjoute.setDateFinEnchere(dateFinEncheres);
			articleAjoute.setPrixInitial(prixInitial);
			articleAjoute.setCategorie(categorieId);
			articleAjoute.setLieuRetrait(retrait);
	//		articleAjoute.setVendeur(utilisateur);

			
			System.out.println(retrait);
			String pseudo = (String) session.getAttribute("pseudo");
			Utilisateur utilisateur = UtilisateurManager.getInstance().affichageProfil(pseudo);
			String rueinitiale = utilisateur.getRue();
			request.setAttribute("rue",rueinitiale);
			String codePostalinitial = utilisateur.getCodePostal();
			request.setAttribute("codepostal",codePostalinitial);
			String villeinitiale = utilisateur.getVille();
			request.setAttribute("ville",villeinitiale);
			
			RetraitManager.getInstance().ajouterLieuRetrait(retrait);
			ArticleVenduManager.getInstance().insertArticle(articleAjoute);
			request.setAttribute("ArticleAffiche", articleAjoute);
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Principale.jsp").forward(request, response);
		}
		
	}
}

//				ArticleVenduManager.getInstance().insertArticle(articleAjoute);
//				
//				 request.setAttribute("Article", article);
//		            this.getServletContext().getRequestDispatcher("/accueil").forward(request, response);
//			} catch (Exception e) {
//				
//				e.printStackTrace();
//			}
//			
//			response.sendRedirect("./PagePrincipale");

// }
// }
//	}

// articleAjouter.setNomArticle(request.getParameter("article"));
// articleAjouter.setDescription(request.getParameter("description"));

// articleAjouter.setPrixInitial(Integer.parseInt(request.getParameter("miseAPrix")));
// articleAjouter.setDateDebutEnchere(LocalDateTime.parse(request.getParameter("debutEnchere")));
// articleAjouter.setDateFinEnchere(LocalDateTime.parse(request.getParameter("finEnchere")));
// TODO a terminer vérifier l'objet RETRAIT
// articleAjouter.setLieuRetrait(request.getParameter("rue,codepostal,ville"));
// chaque categorie indépendante ou categorie generale ??
// String categorie = request.getParameter("categorie");
// String informatique = request.getParameter("informatique");
// String ameublement = request.getParameter("ameublement");
// String vetement = request.getParameter("vetement");
// String sportETloisirs = request.getParameter("sportETloisirs");
// String description = request.getParameter("description");
// String miseAprix = request.getParameter("miseAprix");
// String dateDebutEnchere = request.getParameter("dateDebutEnchere");
// String dateFinEnchere = request.getParameter("dateFinEnchere");
// String rue = request.getParameter("rue");
// String codepostal = request.getParameter("codepostal");
// String ville = request.getParameter("ville");
// utilisation singleton pour recuperer les methodes(insert)
