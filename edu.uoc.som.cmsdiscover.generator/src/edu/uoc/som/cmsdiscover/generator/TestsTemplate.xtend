package edu.uoc.som.cmsdiscover.generator

class TestsTemplate {
	
		def getTest() '''
package generated.middleware.Umami_Food_Magazine_API___JSON_API.tests;

import generated.middleware.Umami_Food_Magazine_API___JSON_API.Recipe;
import generated.middleware.Umami_Food_Magazine_API___JSON_API.Umami_Food;
import generated.middleware.Umami_Food_Magazine_API___JSON_API.Tags;
import generated.middleware.Umami_Food_Magazine_API___JSON_API.drivers.SearchQuery;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		Umami_Food siteManager = new Umami_Food();
		SearchQuery searchQuery = siteManager.getSearchQuery();
		
		// Simple search
		List<Recipe> recipeList = siteManager.searchRecipe(searchQuery.build());
		System.out.println(recipeList.get(3).getTitle());
		
		// Search with filters
		searchQuery.addFilter(Recipe.FILTER_FIELD_COOKING_TIME, "30");
		List<Recipe> recipeFilteredList = siteManager.searchRecipe(searchQuery.build());
		System.out.println(recipeFilteredList.get(0).getTitle());
		
		// Get Single recipe
		Recipe singleRecipe = siteManager.getRecipeById(recipeFilteredList.get(0).getUuid());
		System.out.println(singleRecipe.getTitle());
		
		// Navigation though entities
		List<Tags> tags = singleRecipe.getFieldTags();
		tags.forEach((tag) ->{
			System.out.println(tag.getName());
		});
		
	
		System.out.println("Final");
		
	}


}


	'''
	
}