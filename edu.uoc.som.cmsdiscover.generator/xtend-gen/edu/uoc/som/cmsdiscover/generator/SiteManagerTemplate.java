package edu.uoc.som.cmsdiscover.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SiteManagerTemplate {
  private String cmsTechnology;
  
  private EMap<String, String> Annotations;
  
  private String packageName;
  
  private Iterable<EClass> eClasses;
  
  public SiteManagerTemplate(final EPackage thePackage, final Iterable<EClass> eClasses) {
    this.Annotations = thePackage.getEAnnotations().get(0).getDetails();
    this.eClasses = eClasses;
    this.packageName = thePackage.getName();
    for (final Map.Entry<String, String> Annotation : this.Annotations) {
      boolean _contains = Annotation.getKey().contains("cmsTechnology");
      if (_contains) {
        this.cmsTechnology = Annotation.getValue();
      }
    }
  }
  
  public CharSequence generateClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.gson.JsonParser;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import generated.middleware.");
    _builder.append(this.packageName);
    _builder.append(".drivers.SearchQueryBuilder;");
    _builder.newLineIfNotEmpty();
    _builder.append("import generated.middleware.");
    _builder.append(this.packageName);
    _builder.append(".drivers.SearchQueryInterface.SearchQuery;");
    _builder.newLineIfNotEmpty();
    _builder.append("import generated.middleware.");
    _builder.append(this.packageName);
    _builder.append(".drivers.DriverInterface;");
    _builder.newLineIfNotEmpty();
    _builder.append("import generated.middleware.");
    _builder.append(this.packageName);
    _builder.append(".drivers.GenericResource;");
    _builder.newLineIfNotEmpty();
    {
      boolean _contains = this.cmsTechnology.contains("Drupal");
      if (_contains) {
        _builder.append("import generated.middleware.");
        _builder.append(this.packageName);
        _builder.append(".drivers.DrupalDriver;");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _contains_1 = this.cmsTechnology.contains("Wordpress");
        if (_contains_1) {
          _builder.append("import generated.middleware.");
          _builder.append(this.packageName);
          _builder.append(".drivers.WordpressDriver;");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _substring = this.packageName.substring(0, 10);
    _builder.append(_substring);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// STATIC VALUES");
    _builder.newLine();
    {
      for(final Map.Entry<String, String> Annotation : this.Annotations) {
        _builder.append("\t");
        _builder.append("public static final String ");
        String _key = Annotation.getKey();
        _builder.append(_key, "\t");
        _builder.append(" = \"");
        String _value = Annotation.getValue();
        _builder.append(_value, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private DriverInterface driver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _substring_1 = this.packageName.substring(0, 10);
    _builder.append(_substring_1, "\t");
    _builder.append(" (){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("driver = DrupalDriver.getInstance(this.cmsUrl, this.consumerUser, this.consumerPass);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SearchQueryBuilder getSearchQueryBuilder() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return driver.getSearchQueryBuilder();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Attributes");
    _builder.newLine();
    {
      for(final EClass modelClass : this.eClasses) {
        _builder.append("\t");
        CharSequence _addClassFetcher = this.addClassFetcher(modelClass);
        _builder.append(_addClassFetcher, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addClassFetcher(final EClass modelClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = modelClass.getName();
    _builder.append(_name);
    _builder.append(" get");
    String _name_1 = modelClass.getName();
    _builder.append(_name_1);
    _builder.append("ById(String Id){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("GenericResource answer = driver.getSingle(\"");
    String _get = modelClass.getEAnnotations().get(0).getDetails().get("resourceRoute");
    _builder.append(_get, "\t");
    _builder.append("\", Id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _name_2 = modelClass.getName();
    _builder.append(_name_2, "\t");
    _builder.append(" entity = new ");
    String _name_3 = modelClass.getName();
    _builder.append(_name_3, "\t");
    _builder.append("(driver);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("entity.mapSingleAnswer(answer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return entity;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public List<");
    String _name_4 = modelClass.getName();
    _builder.append(_name_4);
    _builder.append("> search");
    String _name_5 = modelClass.getName();
    _builder.append(_name_5);
    _builder.append("(SearchQuery searchQuery){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("List<GenericResource> answer = driver.getCollection(\"");
    String _get_1 = modelClass.getEAnnotations().get(0).getDetails().get("resourceRoute");
    _builder.append(_get_1, "\t");
    _builder.append("\", searchQuery);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("List<");
    String _name_6 = modelClass.getName();
    _builder.append(_name_6, "\t");
    _builder.append("> entityCollection = new ArrayList<");
    String _name_7 = modelClass.getName();
    _builder.append(_name_7, "\t");
    _builder.append(">();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("answer.forEach((singleAnswer) -> {");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_8 = modelClass.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append(" entity = new ");
    String _name_9 = modelClass.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("(driver);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("entity.mapSingleAnswer(singleAnswer);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("entityCollection.add(entity);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return entityCollection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
