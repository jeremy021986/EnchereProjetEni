package fr.eni.enchere.bo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArticleVendu {
	
	
		private int idArticle;
		private String nomArticle;
		private String description;
		private LocalDate dateDebutEnchere;
		private LocalDate dateFinEnchere;
		private int prixInitial;
		private int prixVente;
		private boolean etatVente;
		private Categorie categorie;
		private Utilisateur utilisateur;
		private Enchere enchere;
		private Retrait LieuRetrait;


		public ArticleVendu(int idArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
				LocalDate dateFinEnchere, int prixInitial, int prixVente, boolean etatVente, Categorie categorie,
				Utilisateur utilisateur, Enchere enchere) {
			super();
			this.idArticle = idArticle;
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEnchere = dateDebutEnchere;
			this.dateFinEnchere = dateFinEnchere;
			this.prixInitial = prixInitial;
			this.prixVente = prixVente;
			this.etatVente = etatVente;
			this.categorie = categorie;
			this.utilisateur = utilisateur;
			this.enchere = enchere;
		}
// constructeur dans date a suprimé
		public ArticleVendu(int i, String string, String string2, int j, int k, String string3, String string4,
				String string5, String string6) {
			// TODO Auto-generated constructor stub
		}

		public ArticleVendu() {
			// TODO Auto-generated constructor stub
		}
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

		public LocalDate getDateDebutEnchere() {
			return dateDebutEnchere;
		}

		
		public void setDateDebutEnchere(LocalDate dateDebutEnchere) {
			this.dateDebutEnchere = dateDebutEnchere;
		}

	
		public LocalDate getDateFinEnchere() {
			return dateFinEnchere;
		}

		
		public void setDateFinEnchere(LocalDate dateFinEnchere) {
			this.dateFinEnchere = dateFinEnchere;
		}

		
		public int getPrixInitial() {
			return prixInitial;
		}

		public void setPrixInitial(int prixInitial) {
			this.prixInitial = prixInitial;
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

		public Retrait getLieuRetrait() {
			return LieuRetrait;
		}

		public void setLieuRetrait(Retrait lieuRetrait) {
			LieuRetrait = lieuRetrait;
		}

		@Override
		public String toString() {
			return "Article{" +
					"idArticle=" + idArticle +
					", nomArticle='" + nomArticle + '\'' +
					", description='" + description + '\'' +
					", dateDebutEnchere=" + dateDebutEnchere +
					", dateFinEnchere=" + dateFinEnchere +
					", prixInitial=" + prixInitial +
					", prixVente=" + prixVente +
					", etatVente=" + etatVente +
					'}';
		}
	}