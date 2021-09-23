package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SearchQueryInterface {
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.");
    _builder.append(packageName);
    _builder.append(".drivers;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface SearchQueryInterface {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQuery addFilter(String fieldName, String value);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQuery addSorter(String fieldName, String sortType);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQuery addPagination(int pageOffset, int pageLimit);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQuery addEmbedReference(String referenceName);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQuery manageConsumer(String user, String password);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
