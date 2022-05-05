package model;


public class Lieu {
	 private int idLieu ;
	 private String   adresse ;
	 private String   ville;
	
	
	 
	
	 
	public Lieu(int idLieu, String adresse, String ville) {
		super();
		this.idLieu = idLieu;
		this.adresse = adresse;
		this.ville = ville;
		
	}



	public Lieu() {
		
	}
	
	
	 
	
	




	public int getIdLieu() {
		return idLieu;
	}





	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}





	public String getAdresse() {
		return adresse;
	}





	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	public String getVille() {
		return ville;
	}





	public void setVille(String ville) {
		this.ville = ville;
	}





	





	
	
	
	
	
	
	
	
	
}