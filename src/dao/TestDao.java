package dao;



import java.util.HashSet;
import java.util.Set;

import model.Formateur;
import model.Formation;
import model.Lieu;


public class TestDao {
	
	static int [] tab= {1,2};

	public static void main(String[] args) {
		
		//*****formation 

		// insertion
     	Lieu l =LieuDao.selectLieu(1) ;
    
     	Formateur  For1 = new Formateur(3, "blbala" , 22);
     	Formateur  For2 = new Formateur(2, "ratatouille" , 23);
    	 Set<Formateur>listFormateurs=new HashSet<Formateur>() ;
    	 Formation  F1 = new Formation(3, "ITTT" , l,listFormateurs);
    	 
    	 listFormateurs.add(For1);
    	 listFormateurs.add(For2);
		FormationDao.insertFormation(F1);
//		System.out.println("hi");
//	   
		// modification 
		 
		  // FormationDao.updateFormation(2);
		
		// suppression
		
		//FormationDao.deleteFormation(3);
		
		// selection 
     	
//		Formation f=FormationDao.selectFormation(1);
//		System.out.println(f.getLieu().getIdLieu());
		
		
		
		// *****lieu
		
		// inserer lieu 
		
		
//		Lieu l1= new Lieu(6,"tkharbi9a morocco" , "tokyo2" ); // i can also insert a list of formation 
//		LieuDao.insertLieu(l1);
		
		// selectioner leiu 
		
//		Lieu liu=LieuDao.selectLieu(6);
//		System.out.println("ville = "+liu.getVille()+"Adresse"+ liu.getAdresse());
//		
		// update lieu 
		
     	
		// LieuDao.updateLieu(6);
		
		// delete lieu 
		
		//LieuDao.deleteLieu(4);
		
		
		//**** formateur 
     	
     	// inserer formateur
		
		
     	
     	
		
		
		
		// pour remplir l table de l'aassociation many to many : on utilise le constructeur avec les listes set
		
//		Set<Formation>listFormations=new HashSet<Formation>() ; // needed only for mapping in database will be field of a new table 
//	    
//	    Formation ff= FormationDao.selectFormation(2);
//		listFormations.add(f);
//		listFormations.add(ff);
//		
//		FormationDao.insertFormation(9,"l3asab",l1,listFormations);
		
		// ***** Categorie
		
		/*Categorie c1=new Categorie(1, "electronique");
		Categorie c2=new Categorie(2, "alimentaire");
		Categorie c3=new Categorie(3, "divers");
		cd.insertCategorie(c3);
		cd.insertCategorie(c1);
		cd.insertCategorie(c2);
		*/
		// ***** Produit
		/*Categorie c1=cd.selectCategorie(1);
		Produit p1=new Produit("C01", 4500, "PC", 4,c1);
		pd.insertProduit(p1);
		Categorie c2=cd.selectCategorie(2);
		Produit p2=new Produit("C02", 200, "USB", 10,c2);
		Produit p3=new Produit("C03", 40, "Souris",2,c2);
		pd.insertProduit(p2);
		pd.insertProduit(p3);*/
		
		
		//selection
		/*Produit p4=pd.selectProduit("C01");
		System.out.println(p4);
		
		//modification
		p4.setDesig("PC Portable");
		pd.updateProduit("C01");
		System.out.println(p4);*/
		
		//suppression 
		//pd.deleteProduit("C03");
		
		/*
		Categorie c=cd.selectCategorie(2);
		System.out.println(c);
		Produit pnv=new Produit("cacke", 100, 20, c, "c04");
		pd.insertProduit(pnv);
		*/
		//modifier les produits en ajoutant les categories
		
//		Formateur form1 = new Formateur(11, "houria", 22);
//		FormateurDao.insererFormateur(form1);
//		System.out.println("formateur inserted");
//		
		

	}

}
