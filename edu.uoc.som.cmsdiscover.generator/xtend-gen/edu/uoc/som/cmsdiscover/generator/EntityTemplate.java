package edu.uoc.som.cmsdiscover.generator;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EntityTemplate {
  private String modelClassName;
  
  private EClass modelClass;
  
  private EList<EAttribute> classAttributes;
  
  private EList<EReference> classReferences;
  
  private EMap<String, String> Annotations;
  
  private Iterable<String> modelClasses;
  
  private String packageName;
  
  private Iterable<String> fieldClassesName;
  
  private EPackage eFieldPackage;
  
  public EntityTemplate(final EClass modelClass, final EMap<String, String> Annotations, final Iterable<String> modelClasses, final EPackage eFieldPackage, final String packageName) {
    this.modelClass = modelClass;
    this.modelClassName = modelClass.getName();
    this.classAttributes = modelClass.getEAllAttributes();
    this.classReferences = modelClass.getEAllReferences();
    this.Annotations = Annotations;
    this.modelClasses = modelClasses;
    final Function1<EClass, String> _function = (EClass it) -> {
      return it.getName();
    };
    this.fieldClassesName = IterableExtensions.<EClass, String>map(Iterables.<EClass>filter(eFieldPackage.getEClassifiers(), EClass.class), _function);
    this.eFieldPackage = eFieldPackage;
    this.packageName = packageName;
  }
  
  public CharSequence generateEntitiesClasses() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonParser;");
    _builder.newLine();
    _builder.append("import org.joda.time.DateTime;");
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".customAttributes.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".drivers.GenericResource;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".drivers.SearchQuery;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.packageName);
    _builder.append(".drivers.DriverInterface;");
    _builder.newLineIfNotEmpty();
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
    _builder.append("private JsonParser parser;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<String> attributesList = Arrays.asList(");
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
        _builder.append("\t");
        CharSequence _addAttribute = this.addAttribute(attribute_1);
        _builder.append(_addAttribute, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Relationships");
    _builder.newLine();
    {
      for(final EReference reference : this.classReferences) {
        _builder.append("\t");
        CharSequence _addReference = this.addReference(reference);
        _builder.append(_addReference, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addConstructor = this.addConstructor();
    _builder.append(_addConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Main Methods");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addDriverWrapperMethods = this.addDriverWrapperMethods();
    _builder.append(_addDriverWrapperMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _mapAnswer = this.mapAnswer();
    _builder.append(_mapAnswer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Add References Methods");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addReferenceMethods = this.addReferenceMethods();
    _builder.append(_addReferenceMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Getters and Setters");
    _builder.newLine();
    {
      for(final EAttribute attribute_2 : this.classAttributes) {
        _builder.append("\t");
        CharSequence _addGettersAndSetters = this.addGettersAndSetters(attribute_2);
        _builder.append(_addGettersAndSetters, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDriverWrapperMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(this.modelClassName);
    _builder.append(" getSingle(String Id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("GenericResource singleAnswer = driver.getSingle(resourceRoute,Id);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(this.modelClassName, "\t");
    _builder.append(" return");
    _builder.append(this.modelClassName, "\t");
    _builder.append(" = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return");
    _builder.append(this.modelClassName, "\t");
    _builder.append(" = mapSingleAnswer(singleAnswer);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return return");
    _builder.append(this.modelClassName, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public List<");
    _builder.append(this.modelClassName);
    _builder.append("> search(SearchQuery searchQuery) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("List<GenericResource> answer = driver.getCollection(resourceRoute, searchQuery);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<");
    _builder.append(this.modelClassName, "\t");
    _builder.append("> ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection = mapAnswer(answer); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(this.modelClassName, "\t");
    _builder.append("Collection;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addGettersAndSetters(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _simpleName = attribute.getEAttributeType().getInstanceClass().getSimpleName();
    _builder.append(_simpleName);
    _builder.append(" get");
    String _camelCase = this.camelCase(this.FirstUpperCase(attribute.getName()));
    _builder.append(_camelCase);
    _builder.append(" () {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return \tthis.");
    String _name = attribute.getName();
    _builder.append(_name, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _camelCase_1 = this.camelCase(this.FirstUpperCase(attribute.getName()));
    _builder.append(_camelCase_1);
    _builder.append(" (");
    String _simpleName_1 = attribute.getEAttributeType().getInstanceClass().getSimpleName();
    _builder.append(_simpleName_1);
    _builder.append(" value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _name_1 = attribute.getName();
    _builder.append(_name_1, "\t");
    _builder.append(" = value;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(this.modelClassName);
    _builder.append("(DriverInterface driver) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.driver = driver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.parser = new JsonParser();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mapAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("List<");
    _builder.append(this.modelClassName);
    _builder.append("> mapAnswer(List<GenericResource> answer) {");
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
    _builder.append("answer.forEach((singleAnswer) -> {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(this.modelClassName, "\t\t");
    _builder.append("Collection.add(mapSingleAnswer(singleAnswer));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("});");
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
    _builder.append(this.modelClassName);
    _builder.append(" mapSingleAnswer(GenericResource singleAnswer) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("singleAnswer.attributesList.forEach((attribute) -> {");
    _builder.newLine();
    {
      for(final EAttribute attribute : this.classAttributes) {
        _builder.append("\t\t");
        _builder.append("if(attribute.getName().equals(\"");
        String _name = attribute.getName();
        _builder.append(_name, "\t\t");
        _builder.append("\")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("if (attribute.getValue()!= null) {");
        _builder.newLine();
        {
          boolean _contains = attribute.getEAttributeType().getInstanceTypeName().contains("Integer");
          if (_contains) {
            _builder.append("\t\t");
            _builder.append("this.");
            String _name_1 = attribute.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append(" = Integer.parseInt(attribute.getValue());");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _contains_1 = attribute.getEAttributeType().getInstanceTypeName().contains("String");
            if (_contains_1) {
              _builder.append("\t\t");
              _builder.append("this.");
              String _name_2 = attribute.getName();
              _builder.append(_name_2, "\t\t");
              _builder.append(" = attribute.getValue().toString();");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _contains_2 = attribute.getEAttributeType().getInstanceTypeName().contains("boolean");
              if (_contains_2) {
                _builder.append("\t\t");
                _builder.append("this.");
                String _name_3 = attribute.getName();
                _builder.append(_name_3, "\t\t");
                _builder.append(" = Boolean.parseBoolean(attribute.getValue());");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _contains_3 = attribute.getEAttributeType().getInstanceTypeName().contains("Date");
                if (_contains_3) {
                  _builder.append("\t\t");
                  _builder.append("this.");
                  String _name_4 = attribute.getName();
                  _builder.append(_name_4, "\t\t");
                  _builder.append(" = new DateTime(attribute.getValue().replace(\"\\\"\", \"\")).toDate();");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      for(final EReference reference : this.classReferences) {
        {
          boolean _contains_4 = IterableExtensions.contains(this.fieldClassesName, reference.getEReferenceType().getName());
          if (_contains_4) {
            _builder.append("\t");
            _builder.append("if(attribute.getName().equals(\"");
            String _name_5 = reference.getName();
            _builder.append(_name_5, "\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t \t");
            _builder.append("if (attribute.getValue()!= null) {");
            _builder.newLine();
            _builder.append("\t \t");
            _builder.append("JsonElement elm = parser.parse(attribute.getValue());");
            _builder.newLine();
            _builder.append("\t ");
            EClassifier _eClassifier = this.eFieldPackage.getEClassifier(reference.getEReferenceType().getName());
            final EClass fieldClass = ((EClass) _eClassifier);
            _builder.newLineIfNotEmpty();
            {
              EList<EAttribute> _eAllAttributes = fieldClass.getEAllAttributes();
              for(final EAttribute attribute_1 : _eAllAttributes) {
                _builder.append("if(!elm.getAsJsonObject().get(\"");
                String _name_6 = attribute_1.getName();
                _builder.append(_name_6);
                _builder.append("\").isJsonNull()) {");
                _builder.newLineIfNotEmpty();
                {
                  boolean _contains_5 = attribute_1.getEAttributeType().getInstanceTypeName().contains("Integer");
                  if (_contains_5) {
                    _builder.append("this.");
                    String _name_7 = reference.getEReferenceType().getName();
                    _builder.append(_name_7);
                    _builder.append(".set");
                    String _FirstUpperCase = this.FirstUpperCase(attribute_1.getName());
                    _builder.append(_FirstUpperCase);
                    _builder.append("(Integer.parseInt(elm.getAsJsonObject().get(\"");
                    String _name_8 = attribute_1.getName();
                    _builder.append(_name_8);
                    _builder.append("\").toString()));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _contains_6 = attribute_1.getEAttributeType().getInstanceTypeName().contains("String");
                    if (_contains_6) {
                      _builder.append("this.");
                      String _name_9 = reference.getEReferenceType().getName();
                      _builder.append(_name_9);
                      _builder.append(".set");
                      String _FirstUpperCase_1 = this.FirstUpperCase(attribute_1.getName());
                      _builder.append(_FirstUpperCase_1);
                      _builder.append("(elm.getAsJsonObject().get(\"");
                      String _name_10 = attribute_1.getName();
                      _builder.append(_name_10);
                      _builder.append("\").toString());");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _contains_7 = attribute_1.getEAttributeType().getInstanceTypeName().contains("boolean");
                      if (_contains_7) {
                        _builder.append("this.");
                        String _name_11 = reference.getEReferenceType().getName();
                        _builder.append(_name_11);
                        _builder.append(".set");
                        String _FirstUpperCase_2 = this.FirstUpperCase(attribute_1.getName());
                        _builder.append(_FirstUpperCase_2);
                        _builder.append("(Boolean.parseBoolean(elm.getAsJsonObject().get(\"");
                        String _name_12 = attribute_1.getName();
                        _builder.append(_name_12);
                        _builder.append("\").toString()));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _contains_8 = attribute_1.getEAttributeType().getInstanceTypeName().contains("Date");
                        if (_contains_8) {
                          _builder.append(" \t");
                          _builder.append("this.");
                          String _name_13 = reference.getEReferenceType().getName();
                          _builder.append(_name_13, " \t");
                          _builder.append(".set");
                          String _FirstUpperCase_3 = this.FirstUpperCase(attribute_1.getName());
                          _builder.append(_FirstUpperCase_3, " \t");
                          _builder.append("(new DateTime(elm.getAsJsonObject().get(\"");
                          String _name_14 = attribute_1.getName();
                          _builder.append(_name_14, " \t");
                          _builder.append("\").toString()).toDate());");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("\t \t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("singleAnswer.referenceList.forEach((reference) -> {");
    _builder.newLine();
    {
      for(final EReference reference_1 : this.classReferences) {
        {
          boolean _contains_9 = IterableExtensions.contains(this.modelClasses, reference_1.getEReferenceType().getName());
          if (_contains_9) {
            _builder.append("\t");
            _builder.append("if(reference.getName().equals(\"");
            String _string = reference_1.getName().toString();
            _builder.append(_string, "\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _string_1 = reference_1.getName().toString();
            _builder.append(_string_1, "\t\t");
            _builder.append(".add(reference.getValue());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addAttribute(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _simpleName = attribute.getEAttributeType().getInstanceClass().getSimpleName();
    _builder.append(_simpleName);
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
        _builder.append("private List<String> ");
        String _string = reference.getName().toString();
        _builder.append(_string);
        _builder.append("  = new ArrayList<String>();");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_1 = IterableExtensions.contains(this.fieldClassesName, reference.getEReferenceType().getName());
      if (_contains_1) {
        _builder.append("private ");
        String _name = reference.getEReferenceType().getName();
        _builder.append(_name);
        _builder.append(" ");
        String _string_1 = reference.getName().toString();
        _builder.append(_string_1);
        _builder.append("  = new ");
        String _name_1 = reference.getEReferenceType().getName();
        _builder.append(_name_1);
        _builder.append("();");
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
            _builder.newLine();
            _builder.append("public List<");
            String _name = reference.getEReferenceType().getName();
            _builder.append(_name);
            _builder.append("> get");
            String _camelCase = this.camelCase(this.FirstUpperCase(reference.getName()));
            _builder.append(_camelCase);
            _builder.append(" () {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("List<");
            String _name_1 = reference.getEReferenceType().getName();
            _builder.append(_name_1, "\t");
            _builder.append("> referenceList = new ArrayList<");
            String _name_2 = reference.getEReferenceType().getName();
            _builder.append(_name_2, "\t");
            _builder.append(">();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _name_3 = reference.getName();
            _builder.append(_name_3, "\t");
            _builder.append(".forEach((element) -> {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _name_4 = reference.getEReferenceType().getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(" referencedEntity = new ");
            String _name_5 = reference.getEReferenceType().getName();
            _builder.append(_name_5, "\t\t");
            _builder.append("(driver);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("referenceList.add(referencedEntity.getSingle(element));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("});");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return referenceList;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public String FirstUpperCase(final String in) {
    String _upperCase = in.substring(0, 1).toUpperCase();
    String _substring = in.substring(1);
    return (_upperCase + _substring);
  }
  
  public String camelCase(final String in) {
    return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, in);
  }
}
