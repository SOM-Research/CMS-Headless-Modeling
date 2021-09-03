package edu.uoc.som.cmsdiscover.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Template {
  public CharSequence generateEntitiesClasses(final EClass modelClass, final EMap<String, String> Annotations, final EList<EClass> superClasses) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.middleware.generator;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EClass;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EAttribute;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.net.URI;");
    _builder.newLine();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpClient;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpRequest;");
    _builder.newLine();
    _builder.append("import java.net.http.HttpResponse.BodyHandlers;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Base64;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.append("import java.util.Map.Entry;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EAttribute;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EClass;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EPackage;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EReference;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EcoreFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EcorePackage;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EInt;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EBoolean;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EString;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.gson.JsonArray;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonObject;");
    _builder.newLine();
    _builder.append("import com.google.gson.JsonParser;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = modelClass.getName();
    _builder.append(_name);
    _builder.append(" extends ");
    {
      boolean _isEmpty = superClasses.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _name_1 = superClasses.get(0).getName();
        _builder.append(_name_1);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// STATIC VALUES");
    _builder.newLine();
    {
      for(final Map.Entry<String, String> Annotation : Annotations) {
        _builder.append("\t");
        _builder.append("public static final String ");
        String _key = Annotation.getKey();
        _builder.append(_key, "\t");
        _builder.append(" = \"");
        String _value = Annotation.getValue();
        _builder.append(_value, "\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Attributes");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes = modelClass.getEAllAttributes();
      for(final EAttribute attribute : _eAllAttributes) {
        _builder.append("\t");
        CharSequence _addAttribute = this.addAttribute(attribute);
        _builder.append(_addAttribute, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Constructor");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Getters & Setters");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes_1 = modelClass.getEAllAttributes();
      for(final EAttribute attribute_1 : _eAllAttributes_1) {
      }
    }
    _builder.append("\t");
    _builder.append("// Main Methods");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _addCollectionGetter = this.addCollectionGetter();
    _builder.append(_addCollectionGetter, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _addRequester = this.addRequester();
    _builder.append(_addRequester, "\t");
    _builder.newLineIfNotEmpty();
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
  
  public CharSequence addGetter(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Entity get");
    String _name = attribute.getEAttributeType().getName();
    _builder.append(_name);
    _builder.append(" () {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _name_1 = attribute.getEAttributeType().getName();
    _builder.append(_name_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addSetter(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Entity get");
    String _name = attribute.getEAttributeType().getName();
    _builder.append(_name);
    _builder.append(" (String ");
    String _name_1 = attribute.getEAttributeType().getName();
    _builder.append(_name_1);
    _builder.append(" ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _name_2 = attribute.getEAttributeType().getName();
    _builder.append(_name_2, "\t");
    _builder.append(" = ");
    String _name_3 = attribute.getEAttributeType().getName();
    _builder.append(_name_3, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addSingleGetter(final EClass modelClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = modelClass.getName();
    _builder.append(_name);
    _builder.append(" get");
    String _name_1 = modelClass.getName();
    _builder.append(_name_1);
    _builder.append("(String entityID) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// request (URL, Resource + name)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JsonElement answer = ResourceRequest(this.endpoint, \"GET\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// map()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return List<Entity>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addCollectionGetter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public List<Entity> getCollection() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JsonElement answer = ResourceRequest(\"\",\"GET\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(answer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// request (URL, Resource + name)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// For answer : aswers");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// map()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return List<Entity>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addAttribute(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _name = attribute.getEAttributeType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = attribute.getName();
    _builder.append(_name_1);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
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
    _builder.append("var client = HttpClient.newHttpClient();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// create a request");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + this.resourceRoute + singleResource))");
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
    _builder.append("var response = client.send(request, BodyHandlers.ofString());");
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
