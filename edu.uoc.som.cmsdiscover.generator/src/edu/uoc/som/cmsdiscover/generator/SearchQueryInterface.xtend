package edu.uoc.som.cmsdiscover.generator

class SearchQueryInterface {
		def generate(String packageName) '''
		package generated.middleware.«packageName».drivers;
		
		
		public interface SearchQueryInterface {
			public SearchQuery addFilter(String fieldName, String value);
			public SearchQuery addSorter(String fieldName, String sortType);
			public SearchQuery addPagination(int pageOffset, int pageLimit);
			public SearchQuery addEmbedReference(String referenceName);
			public SearchQuery manageConsumer(String user, String password);
		}
	'''
}