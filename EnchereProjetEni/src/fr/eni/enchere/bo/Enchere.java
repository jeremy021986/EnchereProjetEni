package fr.eni.enchere.bo;

import java.time.LocalDateTime;

public class Enchere {

		private int idEnchere;
	
		private int idArticle;
		
		private int idUtilisateur;
		
		private LocalDateTime dateEnchere;
		
		private int montantEnchere;
		
		
		public Enchere() {}
		
		public Enchere(int montantEnchere) {
			this.montantEnchere = montantEnchere;
		}
	
		public Enchere(LocalDateTime dateEnchere, int montantEnchere, int idArticle, int idUtilisateur) {
			this.dateEnchere = dateEnchere;
			this.montantEnchere = montantEnchere;
			this.idArticle = idArticle;
			this.idUtilisateur = idUtilisateur;
		}
		
		public Enchere(int idEnchere, LocalDateTime dateEnchere, int montantEnchere, int idArticle, int idUtilisateur) {
			this.idEnchere = idEnchere;
			this.dateEnchere = dateEnchere;
			this.montantEnchere = montantEnchere;
			this.idArticle = idArticle;
			this.idUtilisateur = idUtilisateur;
		}

		public int getIdEnchere() {
			return idEnchere;
		}

		public void setIdEnchere(int idEnchere) {
			this.idEnchere = idEnchere;
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
	
		
		public int getIdArticle() {
			return idArticle;
		}

		
		public void setIdArticle(int idArticle) {
			this.idArticle = idArticle;
		}

		
		public int getIdUtilisateur() {
			return idUtilisateur;
		}

		
		public void setIdUtilisateur(int idUtilisateur) {
			this.idUtilisateur = idUtilisateur;
		}


		@Override
		public String toString() {
			return "Enchere [enchere= " + idEnchere + " article=" + idArticle + ", utilisateur=" + idUtilisateur + ", dateEnchere=" + dateEnchere
					+ ", montantEnchere=" + montantEnchere + "]";
		}

	}
	
