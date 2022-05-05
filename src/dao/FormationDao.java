package dao;

import org.hibernate.Session;
import model.Formation;
import util.HibernateUtil;

public class FormationDao {
	

	
	
	
	// inserer formation 
	
	 static void insertFormation(Formation f) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		s.save(f);
		s.getTransaction().commit();
	}
	 
	 
	 // modifier formation ( implicitement on fait une selection ou la modification(set one of the fieldes) va agir) 
	
	 static void updateFormation(int idFor) {

			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Formation f = (Formation) s.get(Formation.class, idFor);
			f.setTheme("ART"); // the modification 
			s.update(f);
			s.getTransaction().commit();

		}
	
	
	// Delete formation (implique la selection !)
	
	static void deleteFormation(int idFor) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Formation c= s.get(Formation.class, idFor);
		s.delete(c);
		s.getTransaction().commit();

	}
	
	
	// selection 
	 
	static void selectFormations(int[] t) {
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();

		  
		  for(int i=0; i<t.length; i++) {
				Formation f= s.get(Formation.class, t[i]);
				System.out.println(f.getTheme());


			  
			  
		  }
		  
			s.getTransaction().commit();

		  
	  }
	  
	   // select one formation 
	  
	
	static Formation selectFormation(int idFor) {
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Formation f =s.get(Formation.class, idFor);
			s.getTransaction().commit();
			return f;
		}


}
