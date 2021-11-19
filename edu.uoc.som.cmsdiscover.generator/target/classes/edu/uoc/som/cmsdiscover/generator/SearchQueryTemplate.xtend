package edu.uoc.som.cmsdiscover.generator

class SearchQueryTemplate {
	def generate(String packageName) '''
		package generated.middleware.«packageName».drivers;
		
		
		import java.io.UnsupportedEncodingException;
		import java.net.URLEncoder;
		import java.nio.charset.StandardCharsets;
		import java.util.HashMap;
		
		public class SearchQueryBuilder implements SearchQueryInterface {
			
		
			HashMap<String, String> filters = new HashMap<>();
			HashMap<String, String> sorters = new HashMap<>();
			HashMap<String, String> embeds = new HashMap<>();
			HashMap<Integer, Integer> pagination = new HashMap<>();
			
			// FilterRequest
			String filterQuery = "";
			// SortingRequest
			String sorterQuery = "";
			// EmbeddingRequest
			String embedQuery = "";
			// Pagination
			String paginationQuery = "";
			
			public SearchQueryBuilder addFilter(String fieldName, String value) {
				
				try {
					filters.put(fieldName, URLEncoder.encode(value, StandardCharsets.UTF_8.toString()));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				/*String filter;
				try {
					filter = URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
					this.filterQuery = this.filterQuery + "&filter["+fieldName+"]="+filter;
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
				return this;
			}
			
			
			public SearchQueryBuilder addSorter(String fieldName, String sortType) {
				
				sorters.put(fieldName,sortType);
				/*
				if(sortType.contains("ASC")) {
					this.sorterQuery = "&sort="+fieldName;
				}
				else {
					this.sorterQuery = "&sort=-"+fieldName;
				}*/
				
				return this;
			}
			
			public SearchQueryBuilder addEmbedReference(String referenceName) {
				embeds.put("embed",referenceName);
				//this.embedQuery = "&include="+referenceName;
				return this;
			}
			
			public SearchQueryBuilder addPagination(int pageOffset, int pageLimit) {
				
				pagination.put(pageOffset,pageLimit);
				
				/*if ((pageOffset != 0) && (pageLimit != 0)) this.paginationQuery = "&page[offset]="+pageOffset+"&page[limit]="+pageLimit;
				if (pageOffset != 0) this.paginationQuery = "&page[offset]="+pageOffset;
				if (pageLimit != 0) this.paginationQuery = "&page[limit]="+pageLimit;*/
				return this;
			}
			
		
			public SearchQueryBuilder manageConsumer(String user, String password) {
				// TODO Auto-generated method stub
				return this;
				
			}
			
			public SearchQuery build() {
				return new SearchQuery(filters,sorters,embeds,pagination);
			}
		
		}
	'''}