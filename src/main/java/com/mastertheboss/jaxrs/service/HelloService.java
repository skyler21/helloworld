package com.mastertheboss.jaxrs.service;
 
import com.mastertheboss.jaxrs.model.SimpleProperty;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/* URL's for testing 
   curl http://localhost:8080/helloworld/rest/hello/text
   curl http://localhost:8080/helloworld/rest/hello/json
   curl http://localhost:8080/helloworld/rest/hello/xml

   Project website 
      http://www.mastertheboss.com/jboss-frameworks/resteasy/wildfly-hello-world 
*/

 
@Path("/hello")
public class HelloService {
    @GET
    @Path("/text")
    public String getHello () 
    {
        return "hello world!";
    } 
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleProperty getPropertyJSON ()
    {
        SimpleProperty p = new SimpleProperty("key","value");
        return p;
    }
    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public SimpleProperty getPropertyXML () 
    {
        SimpleProperty p = new SimpleProperty("key","value");
        return p;
    }
}