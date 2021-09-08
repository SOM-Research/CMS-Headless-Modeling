package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestsTeamplate {
  public CharSequence getTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.Umami_Food_Magazine_API___JSON_API;");
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
    _builder.append("Recipe recipe = new Recipe();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Recipe> listRecipe = recipe.getCollection();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"hola\");");
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
