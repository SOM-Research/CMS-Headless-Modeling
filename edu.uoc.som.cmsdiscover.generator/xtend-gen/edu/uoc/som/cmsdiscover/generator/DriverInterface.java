package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DriverInterface {
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.");
    _builder.append(packageName);
    _builder.append(".drivers;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import generated.middleware.");
    _builder.append(packageName);
    _builder.append(".drivers.SearchQueryInterface.SearchQuery;");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface DriverInterface {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public JsonElement resourceRequest(String resource, String method, SearchQuery searchQuery);");
    _builder.newLine();
    _builder.append("public List<GenericResource> getCollection(String resourceRoute, SearchQuery searchQuery);");
    _builder.newLine();
    _builder.append("public GenericResource getSingle(String resourceRoute, String Id);");
    _builder.newLine();
    _builder.append("public SearchQueryBuilder getSearchQueryBuilder();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
