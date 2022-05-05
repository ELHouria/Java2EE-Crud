package model;

import java.util.HashSet;
import java.util.Set;

public class Formation {
	private int idForm ;
	private String theme ;
	 private Lieu lieu; // needed for mapping and also in database as a field
	public Formation(int idForm, String theme, Lieu lieu, Set<Formateur> listFormateurs) {
	
		this.idForm = idForm;
		this.theme = theme;
		this.lieu = lieu;
		this.listFormateurs = listFormateurs;
	}
	private Set<Formateur>listFormateurs=new HashSet<Formateur>() ; // needed only for mapping in database will be field of a new table 

	 
	 
	 
	 
	public Set<Formateur> getlistFormateurs() {
		return listFormateurs;
	}




	public void setlistFormateurs(Set<Formateur> listFormateurs) {
		this.listFormateurs = listFormateurs;
	}




	public Formation(int idForm, String theme, Lieu lieu) {
		super();
		this.idForm = idForm;
		this.theme = theme;
		this.lieu = lieu;
	}
	
	
	
	
	public Formation() {
		super();
	}




	public int getIdForm() {
		return idForm;
	}
	public void setIdForm(int idForm) {
		this.idForm = idForm;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
	
	

}
