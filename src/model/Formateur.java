package model;

import java.util.HashSet;
import java.util.Set;

public class Formateur {
	
	private int cin  ;
	private String nom ; 
	private int age ; 
	private Set<Formation>listFormation=new HashSet<Formation>() ;
	
	
	
	
	
	
	
	public Formateur(int cin, String nom, int age) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.age = age;
	}
	
	
	public Formateur() {
		super();
	}


	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Formation> getListFormation() {
		return listFormation;
	}
	public void setListFormation(Set<Formation> listFormation) {
		this.listFormation = listFormation;
	}


}
