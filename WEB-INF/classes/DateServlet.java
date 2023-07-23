//DateServlet.java
package com.nt.servlet;

import  jakarta.servlet.*;  // for servlet api
import  java.io.*;    // for IO streams
import  java.util.*;   // for Utility api

  //we must take servlet comp class as the public class
 public class DateServlet extends GenericServlet
{
     /*public  DateServlet(int x){
         System.out.println("DateServlet: 1-arg constructor");
     }*/

	public   void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		  System.out.println("DateServlet: service(-,-) method");
             //get PrintWriter stream from the response obj
			 PrintWriter pw=res.getWriter();

			 // set the response content type
			 res.setContentType("text/html");


			 // write b.logic
			 Date d=new Date();
             //write  the generated output/message  to  response obj using the PrintWriter stream
			 pw.println("<h1 style='color:red'><center><b><i> date and time is "+d+"</i></b></center></h1>");

			 pw.println("<br> our servlet class code hashCode::"+this.hashCode());
             pw.println("<br> req object hashCode::"+req.hashCode());
             pw.println("<br> res object hashCode::"+res.hashCode());
             pw.println("<br> current request related thread  hashCode::"+Thread.currentThread().hashCode());

			 pw.println("<br><br><br>  req obj class name ::"+req.getClass());
             pw.println("<br>  res obj class name ::"+res.getClass());





			 //close the steam
			 pw.close();
	}//service(-,-)

}//class



