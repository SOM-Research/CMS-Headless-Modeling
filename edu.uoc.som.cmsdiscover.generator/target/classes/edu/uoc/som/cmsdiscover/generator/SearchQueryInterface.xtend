package edu.uoc.som.cmsdiscover.generator

class SearchQueryInterface {
		def generate(String packageName) '''
		package generated.middleware.«packageName».drivers;
		import java.util.HashMap;
		
		
		public interface SearchQueryInterface {
			public SearchQueryBuilder addFilter(String fieldName, String value);
			public SearchQueryBuilder addSorter(String fieldName, String sortType);
			public SearchQueryBuilder addPagination(int pageOffset, int pageLimit);
			public SearchQueryBuilder addEmbedReference(String referenceName);
			public SearchQueryBuilder manageConsumer(String user, String password);
			
			public static class SearchQuery {
				HashMap<String, String> filterQuery;
				HashMap<String, String> sorterQuery;
				HashMap<String, String> embedQuery;
				HashMap<Integer, Integer> pagination;
				SearchQuery(HashMap<String, String> filters, HashMap<String, String> sorters, HashMap<String, String> embeds, HashMap<Integer, Integer> pagination) {
					this.filterQuery = filters;
					this.sorterQuery = sorters;
					this.embedQuery = embeds;
					this.pagination = pagination;
				}
			}
		}
	'''
}