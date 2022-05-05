package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Lieu;


@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =request.getParameter("id");
		String city =request.getParameter("city");
		String adresse =request.getParameter("adresse");
		
		Lieu l = new Lieu();
		
		l.setIdLieu(Integer.valueOf(id)); // convert 
		l.setVille(city);
		l.setAdresse(adresse);
		
		LieuDao.insertLieu(l);
		System.out.println("lieu added succesfully");
		
	
	}
	

	
}
