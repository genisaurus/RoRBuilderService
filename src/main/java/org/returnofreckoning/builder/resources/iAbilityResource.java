package org.returnofreckoning.builder.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.returnofreckoning.builder.model.Ability;
import org.returnofreckoning.builder.model.Class;

@Path("/abilities")
public interface iAbilityResource {

	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Ability getAbility(@PathParam("id") int abilityID);
	
	@GET
	@Path("class/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Class getAbilitiesForClass(@PathParam("id") int classID, @DefaultValue("all") @QueryParam("type") String type);

	
}
