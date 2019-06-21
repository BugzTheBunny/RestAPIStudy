package com.slava.RestStudy;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	AliensRepository ap = new AliensRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		return ap.getAliens();
	}

	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien(@PathParam("id") int id) {
		System.out.println("--++--" + ap.getAlien(id));
		return ap.getAlien(id);
	}

	@POST
	@Path("alien")
	public Alien createAlien(Alien alien) {
		System.out.println(alien.toString());
		ap.create(alien);
		return alien;
	}

}
