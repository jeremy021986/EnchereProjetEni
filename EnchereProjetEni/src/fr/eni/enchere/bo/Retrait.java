package fr.eni.enchere.bo;

public class Retrait {
		
		private int idArticle;
		private int idRetrait;
		private ArticleVendu article;
		private String rue;
		private String codePostal;
		private String ville;
		
		public Retrait(int idArticle, int idRetrait, ArticleVendu article, String rue, String codePostal,
				String ville) {
			super();
			this.idArticle = idArticle;
			this.idRetrait = idRetrait;
			this.article = article;
			this.rue = rue;
			this.codePostal = codePostal;
			this.ville = ville;
		}

		public Retrait(String rue, String codePostal, String ville) {
			this.rue = rue;
			this.codePostal = codePostal;
			this.ville = ville;
		}

		public Retrait() {
			// TODO Auto-generated constructor stub
		}

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

		public int getIdArticle() {
			return idArticle;
		}

		public void setIdArticle(int idArticle) {
			this.idArticle = idArticle;
		}
		


	}
	

