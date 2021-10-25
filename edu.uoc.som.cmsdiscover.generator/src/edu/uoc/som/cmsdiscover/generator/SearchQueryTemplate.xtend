package edu.uoc.som.cmsdiscover.generator

class SearchQueryTemplate {
	def generate(String packageName) '''
		package generated.middleware.«packageName».drivers;
		
		
		import java.io.UnsupportedEncodingException;
		import java.net.URLEncoder;
		import java.nio.charset.StandardCharsets;
		
		public class SearchQuery implements SearchQueryInterface {
			
			
			// FilterRequest
			String filterQuery = "";
			// SortingRequest
			String sorterQuery = "";
			// EmbeddingRequest
			String embedQuery = "";
			// Pagination
			String paginationQuery = "";
			
			public SearchQuery addFilter(String fieldName, String value) {
				String filter;
				try {
					filter = URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
					this.filterQuery = this.filterQuery + "&filter["+fieldName+"]="+filter;
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				return this;
			}
			
			
			public SearchQuery addSorter(String fieldName, String sortType) {
				if(sortType.contains("ASC")) {
					this.sorterQuery = "&sort="+fieldName;
				}
				else {
					this.sorterQuery = "&sort=-"+fieldName;
				}
				
				return this;
			}
			
			public SearchQuery addEmbedReference(String referenceName) {
				this.embedQuery = "&include="+referenceName;
				return this;
			}
			
			public SearchQuery addPagination(int pageOffset, int pageLimit) {
				if ((pageOffset != 0) && (pageLimit != 0)) this.paginationQuery = "&page[offset]="+pageOffset+"&page[limit]="+pageLimit;
				if (pageOffset != 0) this.paginationQuery = "&page[offset]="+pageOffset;
				if (pageLimit != 0) this.paginationQuery = "&page[limit]="+pageLimit;
				return this;
			}
			
		
			public SearchQuery manageConsumer(String user, String password) {
				// TODO Auto-generated method stub
				return this;
				
			}
			
			public ImmutableSearchQuery build() {
				return new ImmutableSearchQuery(filterQuery,sorterQuery,embedQuery,paginationQuery);
			}
		
		}
	'''}