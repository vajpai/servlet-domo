import javax.servlet.ServletConfig;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Servlet;


public class MyServlet implements Servlet{
	
	private ServletConfig servletConfig;
	
	public ServletConfig getServletConfig(){
		return this.servletConfig;
	}
	
	public void init(ServletConfig config)
          throws ServletException{
			  this.servletConfig = config;
		System.out.println("------init()-------");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
			System.out.println("-----service------");

	}
	
	public void destroy(){
		System.out.println("-----destroy------");
	}
	
	
	public String getServletInfo(){
		
		return "This is MyServlet";
		
	}
	
	
	
}