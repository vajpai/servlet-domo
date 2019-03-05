1. create a servlet  
   > javac MyServlet.java 
    NOTE : Before compiling the Servlet class set the classpath with "servlet-api.jar".
    This jar is located in tomcat servlet lib directory
   
2. Create a folder for "myservlet" web applicatin.
3. Under myservlet create folder as WEB-INF
4. Under WEB-INF , create a web.xml ( deployment descriptor) -- servlet configuration
5. Under WEB-INF crate a "classes" folder then copy xxxservlcet.class 

Creating war 

> under myservlet application execute below command to create war

>javac -cfv myapp.war *