package com.zensar.webservice.hello;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Helloservice {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		return "welcome to ZensarHelloService";
	}
	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String htmlHello() {
		return "<h1>welcome to zensar</h1>";
	}
	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return"<?xml version='1.0'?><hello>welcome to zensar</hello>";
	}
	@GET
	@Path("/{nm}")
	@Produces("text/plain")
	public String sayHelloUser(@PathParam("nm")String name) {
		return "Dear" +name+ "welcome to zensar Service";
	}
	@GET
	@Path("/res/{nm}")
	@Produces("text/plain")
	public Response sayHelloResponse(@PathParam("nm")String name) {
		Response res= Response.status(200).entity( "Dear" +name+ "welcome to zensar Service").build();
		return res;
}
	@GET
	@Path("/res/{nm}/{dd}/{mm}/{yy}")
	@Produces("text/plain")
	public Response sayHappyBirthday(@PathParam("nm")String name,@PathParam("dd")int day,@PathParam("mm")int month,@PathParam("yy")int year) {
		LocalDate date = LocalDate.of(year, month, day);
		Response res= Response.status(200).entity( "Dear" +name+ " happy birthday" + date+ "welcome to zensar Service").build();
		return res;
}
}
