package edu.uoc.som.cmsdiscover.generator



class DriverInterface {
	
	def generate(String packageName) '''
	package generated.middleware.«packageName».drivers;
	
	import generated.middleware.«packageName».drivers.SearchQueryInterface.ImmutableSearchQuery;
	import com.google.gson.JsonElement;
	import java.util.List;
	
	public interface DriverInterface {

	public JsonElement resourceRequest(String resource, String method, ImmutableSearchQuery searchQuery);
	public List<GenericResource> getCollection(String resourceRoute, ImmutableSearchQuery searchQuery);
	public GenericResource getSingle(String resourceRoute, String Id);
	public SearchQuery getSearchQuery();

}

	'''
}