package fr.eni.enchere.bo;

import java.time.LocalDateTime;

public class Article {

	
		private int idArticle;

		private String nomArticle;

		
		private String description;

		
		private LocalDateTime dateDebutEnchere;

	
		private LocalDateTime dateFinEnchere;

		
		private int miseAPrix;

		
		private int prixVente;

		
		private boolean etatVente;


		private Categorie categorie;

		private Utilisateur utilisateur;

		private Enchere enchere;


		public int getIdArticle() {
			return idArticle;
		}

		
		public void setIdArticle(int idArticle) {
			this.idArticle = idArticle;
		}

		
		public String getNomArticle() {
			return nomArticle;
		}

		
		public void setNomArticle(String nomArticle) {
			this.nomArticle = nomArticle;
		}

		
		public String getDescription() {
			return description;
		}

		
		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDateTime getDateDebutEnchere() {
			return dateDebutEnchere;
		}

		
		public void setDateDebutEnchere(LocalDateTime dateDebutEnchere) {
			this.dateDebutEnchere = dateDebutEnchere;
		}

	
		public LocalDateTime getDateFinEnchere() {
			return dateFinEnchere;
		}

		
		public void setDateFinEnchere(LocalDateTime dateFinEnchere) {
			this.dateFinEnchere = dateFinEnchere;
		}

		
		public int getMiseAprix() {
			return miseAPrix;
		}

		public void setPrixInitial(int miseAPrix) {
			this.miseAPrix = miseAPrix;
		}

		
		public int getPrixVente() {
			return prixVente;
		}

		
		public void setPrixVente(int prixVente) {
			this.prixVente = prixVente;
		}

		
		public boolean isEtatVente() {
			return etatVente;
		}

		
		public void setEtatVente(boolean etatVente) {
			this.etatVente = etatVente;
		}

		public Categorie getCategorie() {
			return categorie;
		}

		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}

		public Utilisateur getUtilisateur() {
			return utilisateur;
		}

		public void setUtilisateur(Utilisateur utilisateur) {
			this.utilisateur = utilisateur;
		}

		public Enchere getEnchere() {
			return enchere;
		}

		public void setEnchere(Enchere enchere) {
			this.enchere = enchere;
		}

		@Override
		public String toString() {
			return "Article{" +
					"idArticle=" + idArticle +
					", nomArticle='" + nomArticle + '\'' +
					", description='" + description + '\'' +
					", dateDebutEnchere=" + dateDebutEnchere +
					", dateFinEnchere=" + dateFinEnchere +
					", prixInitial=" + miseAPrix +
					", prixVente=" + prixVente +
					", etatVente=" + etatVente +
					'}';
		}
	}
	


