package simplilearn.com;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import javax.servlet.*;

public class Logout extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		 PrintWriter out = response.getWriter();      
		out.print("ThankYou For Visiting");
	}}
