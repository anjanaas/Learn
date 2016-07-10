package dto;

import java.util.ArrayList;



public class JsonObject extends FeedObjects {

ArrayList<FeedObjects> json = new ArrayList<FeedObjects>();

public ArrayList<FeedObjects> getJson() {
	return json;
}

public void setJson(ArrayList<FeedObjects> json) {
	this.json = json;
}

	
}
