package com.zensar.webservice.user;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserProfileService {
	@POST
	@Path("/add")
	@Produces
	public Response addUser(@FormParam("clientName")String name,@FormParam("clientGender")String gender,@FormParam("clientAge")int Age) {
			return Response.status(200).entity("<p> user record is added<br>Name:" +name+ "<br>gender" +gender+ "<br>Age" +Age+"</p>").build();
	

}
}
