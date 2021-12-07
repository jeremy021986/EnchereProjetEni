package fr.eni.enchere.bo;

public class Categorie {

		private int idCategorie;
		private String libelle;



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


	}
	
	

