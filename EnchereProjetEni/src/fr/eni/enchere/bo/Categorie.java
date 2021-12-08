package fr.eni.enchere.bo;

import java.util.List;

public class Categorie {

		private int idCategorie;
		private String libelle;
		private List<ArticleVendu> articles;



		public int getIdCategorie() {
			return idCategorie;
		}

		
		public void setIdCategorie(int idCategorie) {
			this.idCategorie = idCategorie;
		}

		
		public String getLibelle() {
			return libelle;
		}

		
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

	
		@Override
		public String toString() {
			return "Categorie [idCategorie=" + idCategorie + ", libelle=" + libelle + "]";
		}


		public List<ArticleVendu> getArticles() {
			return articles;
		}


		public void setArticles(List<ArticleVendu> articles) {
			this.articles = articles;
		}


	}
	
	

