package com.simplilearn.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.simplilearn.entity.EProduct;
import com.simplilearn.util.HibernateUtil;
/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/list-product")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: collect records from DB.

		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();

		List<EProduct> products = session.createQuery("from EProduct").list();

		out.println("<h1> Product List:- </h1>");
		out.println("<style>table,td,th {border:2px solid red; padding:10px}</style>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th> Product Id</th>");
		out.println("<th> Product Name</th>");
		out.println("<th> Product Price</th>");
		out.println("</tr>");

		for (EProduct p : products) {
			out.print("<tr>");
			out.println("<td>" + p.getId() + "</td>");
			out.println("<td>" + p.getName() + "</td>");
			out.println("<td>" + p.getPrice() + "</td>");
			out.print("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
		session.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
