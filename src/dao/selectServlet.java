package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Lieu;

/**
 * Servlet implementation class selectServlet
 */
@WebServlet("/selectServlet")
public class selectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 String id =   request.getParameter("id");
	 
	 Lieu l= LieuDao.selectLieu(Integer.valueOf(id));
	 
	request.setAttribute("id", l.getIdLieu());
	request.setAttribute("city", l.getVille());
	request.setAttribute("adresse", l.getAdresse());
	System.out.println(l.getVille());
	
	this.getServletContext().getRequestDispatcher("/select.jsp").forward(request, response);
	 
	 
	
	
	
	}



}
