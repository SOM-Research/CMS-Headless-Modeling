package edu.uoc.som.cmsdiscover.generator



class DriverInterface {
	
	def generate(String packageName) '''
	package generated.middleware.«packageName».drivers;
	

	import com.google.gson.JsonElement;
	import java.util.List;
	
	public interface DriverInterface {

	public JsonElement resourceRequest(String resource, String method, SearchQuery searchQuery);
	public List<GenericResource> getCollection(String resourceRoute, SearchQuery searchQuery);
	public GenericResource getSingle(String resourceRoute, String Id);
	public SearchQuery getSearchQuery();

}

	'''
}