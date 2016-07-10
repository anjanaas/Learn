package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.ProjectManager;

import com.google.gson.Gson;

import dto.FeedObjects;
import dto.JsonObject;

@Path("/WebService")
public class FeedService {
	
	@GET
	@Path("/GetFeeds")
	@Produces("application/json")
	public String feed()
	{
		String feeds  = null;
		try 
		{
			//ArrayList<FeedObjects> feedData = null;
			JsonObject feed=new JsonObject();
			ProjectManager projectManager= new ProjectManager();
			//feedData = projectManager.getDaoFeed();
			Gson gson = new Gson();
			feed.setJson(projectManager.getDaoFeed());
			feeds = gson.toJson(feed);
			System.out.println(gson.toJson(feed));
		} catch (Exception e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
		return feeds;
	}

}
