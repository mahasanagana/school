package com.SMS.login;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class StudentDetails extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("sms/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("Student name");  
    String p=request.getParameter("password");  
          
    if(LoginDao.validate(n, p)){  
        RequestDispatcher rd=request.getRequestDispatcher("servlet");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("Sorry Studentname or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("sms.html");  
        rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  
