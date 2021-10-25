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
			
			public static class ImmutableSearchQuery {
				String filterQuery;
				String sorterQuery;
				String embedQuery;
				String paginationQuery;
				ImmutableSearchQuery(String filterQuery, String sorterQuery, String embedQuery, String paginationQuery) {
					this.filterQuery = filterQuery;
					this.sorterQuery = sorterQuery;
					this.embedQuery = embedQuery;
					this.paginationQuery = paginationQuery;
				}
			}
		}
	'''
}