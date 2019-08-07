package controllers;

import models.PlayerCareerStats;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/")
public class Controller {


    @GET
    @Path("/home")
    @Produces("application/json")
    public Response get(){
        try{

            PlayerCareerStats.fetchData("Totals",1628728);
            return Response.status(200).build();
        }catch(Exception e){
            return Response.status(400).build();
        }
    }
    @GET
    @Path("/homePlayerId")
    @Produces("application/json")
    public Response geta(){
        try{
            List<Integer> integerList = PlayerCareerStats.getPlayersIdFromApi();
            return Response.status(200).entity(integerList).build();
        }catch(Exception e){
            return Response.status(400).build();
        }
    }

    @GET
    @Path("/playercareerstats/{playerId}")
    @Produces({"application/json"})
    public Response getTeachers(@PathParam("playerId") Integer playerId) {
        try {
            List<PlayerCareerStats> playerCareerStatsList= PlayerCareerStats.getPlayerCareerStats(playerId);
            return Response.status(200).entity(playerCareerStatsList).build();
        } catch (ClassNotFoundException | SQLException e) {
            return Response.status(500).build();
        }
    }


}
