package edu.uoc.som.cmsdiscover.generator

class TestsTemplate {
	
		def getTest() '''
package generated.middleware.Umami_Food_Magazine_API___JSON_API;

import java.util.List;

public class mainTest {

	public static void main(String[] args) {
		Recipe recipe = new Recipe();
		
		// Search Feature
		List<Recipe> fullSearch = recipe.search(new SearchQuery());
		System.out.println(fullSearch.get(3).getTitle());
		
		// Search with Filters
		List<Recipe> filteredSearch = recipe.search(new SearchQuery().addFilter("field_cooking_time", "30"));
		System.out.println(filteredSearch.get(0).getTitle());
		
		// Search Single
		Recipe singleRecipe = recipe.getSingle(fullSearch.get(1).getUuid());
		System.out.println(singleRecipe.getTitle());
		
		// Navigation
		List<Tags> tags = singleRecipe.getFieldTags();
		tags.forEach((tag) ->{
			System.out.println(tag.getName());
		});
		
	
		System.out.println("Final");
		
	}

}


	'''
	
}