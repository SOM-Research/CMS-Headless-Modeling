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
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface SearchQueryInterface {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder addFilter(String fieldName, String value);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder addSorter(String fieldName, String sortType);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder addPagination(int pageOffset, int pageLimit);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder addEmbedReference(String referenceName);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder manageConsumer(String user, String password);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static class SearchQuery {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HashMap<String, String> filterQuery;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HashMap<String, String> sorterQuery;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HashMap<String, String> embedQuery;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HashMap<Integer, Integer> pagination;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SearchQuery(HashMap<String, String> filters, HashMap<String, String> sorters, HashMap<String, String> embeds, HashMap<Integer, Integer> pagination) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.filterQuery = filters;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.sorterQuery = sorters;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.embedQuery = embeds;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.pagination = pagination;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
