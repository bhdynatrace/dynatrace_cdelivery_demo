package cdelivery_demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demoManager
 */

public class demoManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demoManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set the response message's MIME type.
	      response.setContentType("text/html;charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket.
	      PrintWriter out = response.getWriter();
	 
	      // Use a ResourceBundle for localized string in "LocalStrings_xx.properties" for i18n.
	      // The request.getLocale() sets the locale based on the "Accept-Language" request header.
	      ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", request.getLocale());
	      // To test other locales.
	      //ResourceBundle rb = ResourceBundle.getBundle("LocalStrings", new Locale("fr"));
	 
	      // Write the response message, in an HTML document.
	      try {
	         out.println("<!DOCTYPE html>");  // HTML 5
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         String title = rb.getString("demomanager.title");
	         out.println("<title>" + title + "</title></head>");
	         out.println("<body>");
	         out.println("<h1>" + title + "</h1>");  // Prints "Hello, world!"
	         // Set a hyperlink image to refresh this page
	         out.println("<a href='" + request.getRequestURI() + "'><img src='images/vmware_logo.jpeg' height='150px' width='300px' ></a>");	
	         out.println("<a href='" + request.getRequestURI() + "'><img src='images/Dynatrace_logo.png' height='150px' width='275px' ></a>");
	         out.println("<table><tr><td>Status</td><td>Column 2</td><td>Column 3</td></tr>");
	         out.println("</body></html>");
	      } finally {
	         out.close();  // Always close the output writer
	      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	// 
	protected void reportAccounts(PrintWriter out)
	{
		
		
	}

}
