package edu.uoc.som.cmsdiscover.generator

class TestsTemplate {
	
		def getTest(String PackageName, String siteManagerName) '''
package «PackageName».tests;

import «PackageName».Recipe;
import «PackageName».«siteManagerName»;
import «PackageName».Tags;
import «PackageName».drivers.SearchQueryBuilder;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		«siteManagerName» siteManager = new «siteManagerName»();
		SearchQueryBuilder searchQuery = siteManager.getSearchQueryBuilder();
		
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