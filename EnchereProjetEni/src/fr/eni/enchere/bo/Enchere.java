package fr.eni.enchere.bo;

import java.time.LocalDateTime;

public class Enchere {

	
		private ArticleVendu article;
		
		private Utilisateur utilisateur;
		
		private LocalDateTime dateEnchere;
		
		private int montantEnchere;
		
		public ArticleVendu getArticle() {
			return article;
		}

		
		public void setArticle(ArticleVendu article) {
			this.article = article;
		}

		
		public LocalDateTime getDateEnchere() {
			return dateEnchere;
		}

		
		public void setDateEnchere(LocalDateTime dateEnchere) {
			this.dateEnchere = dateEnchere;
		}

		
		public int getMontantEnchere() {
			return montantEnchere;
		}

		public void setMontantEnchere(int montantEnchere) {
			this.montantEnchere = montantEnchere;
		}

		
		
		

		public Utilisateur getUtilisateur() {
			return utilisateur;
		}

		public void setUtilisateur(Utilisateur utilisateur) {
			this.utilisateur = utilisateur;
		}


		@Override
		public String toString() {
			return "Enchere [article=" + article + ", utilisateur=" + utilisateur + ", dateEnchere=" + dateEnchere
					+ ", montantEnchere=" + montantEnchere + "]";
		}

	
	

		
	}
	
