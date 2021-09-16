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
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface DriverInterface {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addFilter(String fieldName, String value);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addSorter(String fieldName, String sortType);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addPagination(int pageOffset, int pageLimit);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addEmbedReference(String referenceName);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void manageConsumer(String user, String password);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public JsonElement resourceRequest(String resource, String method);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<GenericEntity> getCollection(String resourceRoute);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public GenericEntity getSingle(String resourceRoute, String Id);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
