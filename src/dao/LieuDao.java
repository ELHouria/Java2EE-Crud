package dao;

import org.hibernate.Session;
import model.Lieu;
import util.HibernateUtil;

public class LieuDao {
	
	
	
	  // inserer lieu 
		static void insertLieu(Lieu L) {
	
			Session s = HibernateUtil.getSessionFactory().openSession();//getCurrentSession();
			s.beginTransaction();
			s.save(L);
			s.getTransaction().commit();
	
		}
		
		// selectioner lieu
	 
		static Lieu selectLieu(int idLieu) {
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Lieu l = (Lieu) s.get(Lieu.class, idLieu);
			s.getTransaction().commit();
			return l;
			
		}
		
		
		// update lieu 
		
		static void updateLieu(int idLieu) {
		
				Session s = HibernateUtil.getSessionFactory().getCurrentSession();
				s.beginTransaction();
				Lieu l = (Lieu) s.get(Lieu.class, idLieu);
				l.setVille("rihab");
				s.update(l);
				s.getTransaction().commit();
		
			}
		
		// delete lieu 
		
		static void deleteLieu(int idLieu) {
			Session s = HibernateUtil.getSessionFactory().getCurrentSession();
			s.beginTransaction();
			Lieu l = (Lieu) s.get(Lieu.class, idLieu);
            s.delete(l);
            s.getTransaction().commit();			
			
		}
		
	
	 

}
