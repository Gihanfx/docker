package com.gim.restapi.RestBackend;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	System.out.println("Test console");
        return "Hi from backend from Docker V5";
    }
}
