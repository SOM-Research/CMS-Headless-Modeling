package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestsTemplate {
  public CharSequence getTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.Umami_Food_Magazine_API___JSON_API.tests;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import generated.middleware.Umami_Food_Magazine_API___JSON_API.Recipe;");
    _builder.newLine();
    _builder.append("import generated.middleware.Umami_Food_Magazine_API___JSON_API.Umami_Food;");
    _builder.newLine();
    _builder.append("import generated.middleware.Umami_Food_Magazine_API___JSON_API.Tags;");
    _builder.newLine();
    _builder.append("import generated.middleware.Umami_Food_Magazine_API___JSON_API.drivers.SearchQuery;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class mainTest {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Umami_Food siteManager = new Umami_Food();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SearchQuery searchQuery = siteManager.getSearchQuery();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Simple search");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Recipe> recipeList = siteManager.searchRecipe(searchQuery);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(recipeList.get(3).getTitle());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Search with filters");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("searchQuery.addFilter(\"field_cooking_time\", \"30\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Recipe> recipeFilteredList = siteManager.searchRecipe(searchQuery);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(recipeFilteredList.get(0).getTitle());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Get Single recipe");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Recipe singleRecipe = siteManager.getRecipeById(recipeFilteredList.get(0).getUuid());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(singleRecipe.getTitle());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Navigation though entities");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Tags> tags = singleRecipe.getFieldTags();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("tags.forEach((tag) ->{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(tag.getName());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Final\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
