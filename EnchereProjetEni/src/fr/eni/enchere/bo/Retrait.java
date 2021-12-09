package fr.eni.enchere.bo;

public class Retrait {
		
		private int idRetrait;
		private ArticleVendu article;
		private String rue;
		private String codePostal;
		private String ville;
		
		public int getIdRetrait() {
			return idRetrait;
		}

		public void setIdRetrait(int idRetrait) {
			this.idRetrait = idRetrait;
		}

		public ArticleVendu getArticle() {
			return article;
		}
		
		public void setArticle(ArticleVendu article) {
			this.article = article;
		}
		
		public String getRue() {
			return rue;
		}
		
		public void setRue(String rue) {
			this.rue = rue;
		}
		
		public String getCodePostal() {
			return codePostal;
		}
		
		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}
		
		public String getVille() {
			return ville;
		}
		
		public void setVille(String ville) {
			this.ville = ville;
		}
		


	}
	

