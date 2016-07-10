package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;


public class Project {
	
	
	public ArrayList<FeedObjects> getFeeds(Connection connection) throws Exception
	{
		ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
		try
		{

			PreparedStatement ps = connection.prepareStatement("SELECT eventname,servicename,category,url,contenttime FROM Data");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				FeedObjects feedObject = new FeedObjects();
				feedObject.setEventName(rs.getString("eventname"));
				feedObject.setServiceName(rs.getString("servicename"));
				feedObject.setCategory(rs.getString("category"));
				feedObject.setUrl(rs.getString("url"));
				feedObject.setContentTime(rs.getString("contenttime"));
				feedData.add(feedObject);
			}
			return feedData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
