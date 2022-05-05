package dao;

import org.hibernate.Session;

import model.Formateur;
import util.HibernateUtil;

public class FormateurDao {
	
	static void insererFormateur(Formateur f) {
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		s.save(f);
		s.getTransaction().commit();
		
	}
	
	
	
	
	

}
