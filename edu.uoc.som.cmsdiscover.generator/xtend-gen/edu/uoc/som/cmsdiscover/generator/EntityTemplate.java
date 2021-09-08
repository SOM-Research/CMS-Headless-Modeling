package edu.uoc.som.cmsdiscover.generator;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EntityTemplate {
  private String cmsTechnology;
  
  private String modelClassName;
  
  private EClass modelClass;
  
  private EList<EAttribute> classAttributes;
  
  private EList<EReference> classReferences;
  
  private EMap<String, String> Annotations;
  
  private Iterable<String> modelClasses;
  
  private String packageName;
  
  public EntityTemplate(final EClass modelClass, final EMap<String, String> Annotations, final Iterable<String> modelClasses, final String packageName) {
    this.modelClass = modelClass;
    this.modelClassName = modelClass.getName();
    this.classAttributes = modelClass.getEAllAttributes();
    this.classReferences = modelClass.getEAllReferences();
    this.Annotations = Annotations;
    this.modelClasses = modelClasses;
    this.packageName = packageName;
  }
  
  public CharSequence generateEntitiesClasses() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.net.URI;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpClient;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpRequest;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpResponse;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpResponse.BodyHandlers;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonParser;");
    _builder.newLine();
    _builder.append("import java.util.Map.Entry;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.text.ParseException;");
    _builder.newLine();
    _builder.append("import java.text.SimpleDateFormat;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.modelClassName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// STATIC VALUES");
    _builder.newLine();
    {
      for(final Map.Entry<String, String> Annotation : this.Annotations) {
        _builder.append("\t\t");
        _builder.append("public static final String ");
        String _key = Annotation.getKey();
        _builder.append(_key, "\t\t");
        _builder.append(" = \"");
        String _value = Annotation.getValue();
        _builder.append(_value, "\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        {
          String _key_1 = Annotation.getKey();
          boolean _equals = Objects.equal(_key_1, "cmsTechnology");
          if (_equals) {
            _builder.append("\t\t");
            _builder.append("//\t");
            _builder.append(this.cmsTechnology = Annotation.getValue(), "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<String> attributesList = Arrays.asList(");
    {
      final Function1<EAttribute, String> _function = (EAttribute it) -> {
        return it.getName();
      };
      List<String> _map = ListExtensions.<EAttribute, String>map(this.classAttributes, _function);
      boolean _hasElements = false;
      for(final String attribute : _map) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\"");
        _builder.append(attribute, "\t");
        _builder.append("\"");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Attributes");
    _builder.newLine();
    {
      for(final EAttribute attribute_1 : this.classAttributes) {
        _builder.append("\t\t");
        CharSequence _addAttribute = this.addAttribute(attribute_1);
        _builder.append(_addAttribute, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Relationships");
    _builder.newLine();
    {
      for(final EReference reference : this.classReferences) {
        _builder.append("\t\t");
        CharSequence _addReference = this.addReference(reference);
        _builder.append(_addReference, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Main Methods");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addCollectionGetter = this.addCollectionGetter();
    _builder.append(_addCollectionGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addSingleGetter = this.addSingleGetter();
    _builder.append(_addSingleGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addRequester = this.addRequester();
    _builder.append(_addRequester, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _mapDrupalAnswer = this.mapDrupalAnswer();
    _builder.append(_mapDrupalAnswer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _mapWordpressAnswer = this.mapWordpressAnswer();
    _builder.append(_mapWordpressAnswer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addReferenceMethods = this.addReferenceMethods();
    _builder.append(_addReferenceMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addConstructor(final EClass entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("(params) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("// URL");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Endpoint");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// User");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Password");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Technology type");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addSingleGetter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(this.modelClassName);
    _builder.append(" getSingle(String Id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JsonElement answer = ResourceRequest(\"/\"+Id,\"GET\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append(" return");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append(" = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (this.cmsTechnology.contains(\"Drupal\")) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return");
    _builder.append(this.modelClassName, "\t\t\t");
    _builder.append(" = mapSingleDrupalAnswer(answer.getAsJsonObject().get(\"data\")); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//return");
    _builder.append(this.modelClassName, "\t\t\t");
    _builder.append(" = mapWordpressAnswer(answer); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return return");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addCollectionGetter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public List<");
    _builder.append(this.modelClassName);
    _builder.append("> getCollection() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("JsonElement answer = ResourceRequest(\"\",\"GET\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<");
    _builder.append(this.modelClassName, "\t");
    _builder.append("> ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (this.cmsTechnology.contains(\"Drupal\")) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append("Collection = mapDrupalAnswer(answer); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append("Collection = mapWordpressAnswer(answer); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mapWordpressAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected List<");
    _builder.append(this.modelClassName);
    _builder.append("> mapWordpressAnswer(JsonElement answer) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("List<");
    _builder.append(this.modelClassName, "\t");
    _builder.append("> ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mapDrupalAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("protected List<");
    _builder.append(this.modelClassName);
    _builder.append("> mapDrupalAnswer(JsonElement answer) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<");
    _builder.append(this.modelClassName, "\t");
    _builder.append("> ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection = new ArrayList<");
    _builder.append(this.modelClassName, "\t");
    _builder.append(">();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("answer.getAsJsonObject().get(\"data\").getAsJsonArray().forEach((content) -> {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append("Collection.add(mapSingleDrupalAnswer(content));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    _builder.append(this.modelClassName);
    _builder.append(" mapSingleDrupalAnswer(JsonElement answer) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append(" returnInstance = new ");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Entry<String, JsonElement> element : answer.getAsJsonObject().entrySet()) {{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (element.getKey().contains(\"relationships\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for (Entry<String, JsonElement> singleRelation : element.getValue().getAsJsonObject().entrySet()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("JsonElement relationData = singleRelation.getValue().getAsJsonObject().get(\"data\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("String entityType = null;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("String entityId = null;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (relationData.isJsonObject()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("entityType = relationData.getAsJsonObject().get(\"type\").getAsJsonPrimitive().getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("entityId = relationData.getAsJsonObject().get(\"id\").getAsJsonPrimitive().getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("if(!relationData.getAsJsonArray().isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("entityType = relationData.getAsJsonArray().get(0).getAsJsonObject().get(\"type\").getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("entityId = relationData.getAsJsonArray().get(0).getAsJsonObject().get(\"id\").getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (!(entityType == null)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("int index = entityType.indexOf(\"--\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("String referencedClass = entityType.substring(index + 2).substring(0, 1)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append(".toUpperCase() + entityType.substring(index + 2).substring(1);");
    _builder.newLine();
    {
      for(final EReference reference : this.classReferences) {
        {
          boolean _contains = IterableExtensions.contains(this.modelClasses, reference.getEReferenceType().getName());
          if (_contains) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("if(singleRelation.getKey().equals(\"");
            String _string = reference.getName().toString();
            _builder.append(_string, "\t\t\t\t\t\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("returnInstance.");
            String _string_1 = reference.getName().toString();
            _builder.append(_string_1, "\t\t\t\t\t\t");
            _builder.append(" = entityId;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (element.getKey().contains(\"id\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("String value = element.getValue().toString().replaceAll(\"\\\"\",\"\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(value != null && value.matches(\"[0-9.]+\")){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("returnInstance.uuid = Integer.parseInt(value);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(element.getKey().contains(\"attributes\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for( Entry<String, JsonElement> attribute: element.getValue().getAsJsonObject().entrySet()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.out.println(attribute.getKey()+\": \"+attribute.getValue());");
    _builder.newLine();
    {
      for(final EAttribute attribute : this.classAttributes) {
        _builder.append("\t\t\t\t\t");
        _builder.append("if(attribute.getKey().equals(\"");
        String _name = attribute.getName();
        _builder.append(_name, "\t\t\t\t\t");
        _builder.append("\")) {");
        _builder.newLineIfNotEmpty();
        {
          boolean _contains_1 = attribute.getEAttributeType().getInstanceTypeName().contains("Integer");
          if (_contains_1) {
            _builder.append("\t\t\t\t\t");
            _builder.append("returnInstance.");
            String _name_1 = attribute.getName();
            _builder.append(_name_1, "\t\t\t\t\t");
            _builder.append(" = attribute.getValue().getAsInt();");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _contains_2 = attribute.getEAttributeType().getInstanceTypeName().contains("String");
            if (_contains_2) {
              _builder.append("\t\t\t\t\t");
              _builder.append("returnInstance.");
              String _name_2 = attribute.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append(" = attribute.getValue().toString();");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _contains_3 = attribute.getEAttributeType().getInstanceTypeName().contains("boolean");
              if (_contains_3) {
                _builder.append("\t\t\t\t\t");
                _builder.append("returnInstance.");
                String _name_3 = attribute.getName();
                _builder.append(_name_3, "\t\t\t\t\t");
                _builder.append(" = attribute.getValue().getAsBoolean();");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _contains_4 = attribute.getEAttributeType().getInstanceTypeName().contains("Date");
                if (_contains_4) {
                  _builder.append("\t\t\t\t\t");
                  _builder.append("try{");
                  _builder.newLine();
                  _builder.append("\t\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("returnInstance.");
                  String _name_4 = attribute.getName();
                  _builder.append(_name_4, "\t\t\t\t\t\t");
                  _builder.append(" = new SimpleDateFormat(\"YYYY-MM-DD[T]HH:mm:ss. SSS[Z]\").parse(attribute.getValue().getAsString());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t\t");
                  _builder.append("} catch ( ParseException e) {");
                  _builder.newLine();
                  _builder.append("\t\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("e.printStackTrace();");
                  _builder.newLine();
                  _builder.append("\t\t\t\t\t");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          }
        }
        _builder.append("\t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("if(element.getValue().getAsJsonObject().get(\"drupal_internal__nid\") != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("// returnInstance.contentId = element.getValue().getAsJsonObject().get(\"drupal_internal__nid\").getAsJsonObject().get(\"value\").toString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return returnInstance;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addAttribute(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _instanceTypeName = attribute.getEAttributeType().getInstanceTypeName();
    _builder.append(_instanceTypeName);
    _builder.append(" ");
    String _name = attribute.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence addReference(final EReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _contains = IterableExtensions.contains(this.modelClasses, reference.getEReferenceType().getName());
      if (_contains) {
        _builder.append("public String ");
        String _string = reference.getName().toString();
        _builder.append(_string);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence addReferenceMethods() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final EReference reference : this.classReferences) {
        {
          boolean _contains = IterableExtensions.contains(this.modelClasses, reference.getEReferenceType().getName());
          if (_contains) {
            _builder.append("public ");
            String _name = reference.getEReferenceType().getName();
            _builder.append(_name);
            _builder.append(" get");
            String _name_1 = reference.getName();
            _builder.append(_name_1);
            _builder.append(" (String entityId) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _name_2 = reference.getEReferenceType().getName();
            _builder.append(_name_2, "\t");
            _builder.append(" referencedEntity = new ");
            String _name_3 = reference.getEReferenceType().getName();
            _builder.append(_name_3, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return referencedEntity.getSingle(entityId);");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence addRequester() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public JsonElement ResourceRequest(String singleResource, String method) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// create a client");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HttpClient client = HttpClient.newHttpClient();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// create a request");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + this.resourceRoute + singleResource))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".method(method, HttpRequest.BodyPublishers.noBody()).header(\"accept\", \"application/json\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//.header(\"Authorization\", basicAuth(this.consumerUser, this.consumerPass))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".build();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// use the client to send the request");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("request.method();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HttpResponse<String> response = client.send(request, BodyHandlers.ofString());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (response.statusCode() == 200) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("JsonElement res = new JsonParser().parse(response.body());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return res;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(\"Opps route: \" + singleResource + \" has returned status: \" + response.statusCode());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch (InterruptedException e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
