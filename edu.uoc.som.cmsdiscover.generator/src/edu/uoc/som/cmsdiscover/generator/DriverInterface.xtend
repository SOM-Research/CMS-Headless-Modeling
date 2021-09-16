package edu.uoc.som.cmsdiscover.generator



class DriverInterface {
	
	def generate(String packageName) '''
	package generated.middleware.«packageName».drivers;
	
	import com.google.gson.JsonElement;
	import java.util.List;
	
	public interface DriverInterface {
		
		public void addFilter(String fieldName, String value);
		public void addSorter(String fieldName, String sortType);
		public void addPagination(int pageOffset, int pageLimit);
		public void addEmbedReference(String referenceName);
		public void manageConsumer(String user, String password);
		public JsonElement resourceRequest(String resource, String method);
		public List<GenericEntity> getCollection(String resourceRoute);
		public GenericEntity getSingle(String resourceRoute, String Id);
	
	}
	'''
}