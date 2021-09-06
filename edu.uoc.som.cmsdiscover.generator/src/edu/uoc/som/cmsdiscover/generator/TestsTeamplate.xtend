package edu.uoc.som.cmsdiscover.generator

class TestsTeamplate {
	
		def getTest() '''
package generated.middleware.Umami_Food_Magazine_API___JSON_API;

import java.util.List;

public class Testing {

	public static void main(String[] args) {
		Recipe recipe = new Recipe();
		List<Recipe> listRecipe = recipe.getCollection();
		System.out.println("hola");
		
	}

}


	'''
	
}