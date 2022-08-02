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



public class Login extends HttpServlet{

		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			 response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String user=request.getParameter("user");  
			    String pass=request.getParameter("pass");  
			    
			          
			    if(validate(user, pass)){  
			        out.print("Welcome "+ user); 
			        RequestDispatcher rd=request.getRequestDispatcher("LogoutUser.html");  
			        rd.include(request,response);  
		
			    }  
			    else{  
			        out.print("Sorry username or password error");  
			        RequestDispatcher rd=request.getRequestDispatcher("LoginUser.html");  
			        rd.include(request,response);  
			    }  
			          
			    out.close();  
			    }

		private boolean validate(String n, String p) {
			String user="arvind";
			String pass="123456";
			if (user.equals(n) && pass.equals(p) )
				return true;
			return false;
		}  
		}
