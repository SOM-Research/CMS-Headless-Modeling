package edu.uoc.som.cmsdiscover.generator;

import java.util.Map;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DriverTemplate {
  private EMap<String, String> sourceCmsInformation;
  
  private EPackage thePackage;
  
  private String cmsTechnology;
  
  public CharSequence generateDriver(final EPackage thePackage) {
    CharSequence _xblockexpression = null;
    {
      this.thePackage = thePackage;
      this.sourceCmsInformation = thePackage.getEAnnotations().get(0).getDetails();
      for (final Map.Entry<String, String> detail : this.sourceCmsInformation) {
        boolean _contains = detail.getKey().contains("cmsTechnology");
        if (_contains) {
          this.cmsTechnology = detail.getValue();
        }
      }
      _xblockexpression = this.generate();
    }
    return _xblockexpression;
  }
  
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated.middleware.");
    String _name = this.thePackage.getName();
    _builder.append(_name);
    _builder.append(".drivers;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.net.URI;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.net.http.HttpClient;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.net.http.HttpRequest;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.net.http.HttpResponse;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.net.http.HttpResponse.BodyHandlers;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import com.google.gson.JsonParser;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.Map.Entry;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    _builder.append(this.cmsTechnology, "\t");
    _builder.append("Driver implements DriverInterface {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// STATIC VALUES");
    _builder.newLine();
    {
      for(final Map.Entry<String, String> Annotation : this.sourceCmsInformation) {
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
    _builder.append("// FilterRequest");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String filterQuery = \"\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// SortingRequest");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String sorterQuery = \"\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// EmbeddingRequest");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String embedQuery = \"\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Pagination");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String paginationQuery = \"\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addSingleGetter = this.addSingleGetter();
    _builder.append(_addSingleGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _addCollectionGetter = this.addCollectionGetter();
    _builder.append(_addCollectionGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _contains = this.cmsTechnology.contains("Drupal");
      if (_contains) {
        _builder.append("\t");
        CharSequence _addDrupalFilterBuilder = this.addDrupalFilterBuilder();
        _builder.append(_addDrupalFilterBuilder, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalSorterBuilder = this.addDrupalSorterBuilder();
        _builder.append(_addDrupalSorterBuilder, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalEmbedding = this.addDrupalEmbedding();
        _builder.append(_addDrupalEmbedding, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalPagination = this.addDrupalPagination();
        _builder.append(_addDrupalPagination, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalSessionManager = this.addDrupalSessionManager();
        _builder.append(_addDrupalSessionManager, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalRequester = this.addDrupalRequester();
        _builder.append(_addDrupalRequester, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalMapAnswer = this.addDrupalMapAnswer();
        _builder.append(_addDrupalMapAnswer, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _addDrupalSingleMapAnswer = this.addDrupalSingleMapAnswer();
        _builder.append(_addDrupalSingleMapAnswer, "\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      boolean _contains_1 = this.cmsTechnology.contains("Wordpress");
      if (_contains_1) {
        _builder.append("\t");
        this.addWordpressFilterBuilder();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        this.addWordpressSorterBuilder();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        this.addWordpressEmbedding();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        this.addWordpressSessionManager();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        this.addWordpressRequester();
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addSingleGetter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public GenericEntity getSingle(String resourceRoute, String Id) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JsonElement answer = resourceRequest(resourceRoute+\"/\"+Id,\"GET\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("GenericEntity returnEntity = mapSingleAnswer(answer.getAsJsonObject().get(\"data\"));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return returnEntity;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addCollectionGetter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public List<GenericEntity> getCollection(String resourceRoute) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JsonElement answer = resourceRequest(resourceRoute,\"GET\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<GenericEntity> entityCollection = mapAnswer(answer); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return entityCollection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalSingleMapAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private GenericEntity mapSingleAnswer(JsonElement res) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("GenericEntity genericInstance = new GenericEntity();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Entry<String, JsonElement> element : res.getAsJsonObject().entrySet()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (element.getKey().contains(\"relationships\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("for (Entry<String, JsonElement> singleRelation : element.getValue().getAsJsonObject().entrySet()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("JsonElement relationData = singleRelation.getValue().getAsJsonObject().get(\"data\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("if (!relationData.isJsonNull()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("String entityType = null;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("String entityId = null;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("if (relationData.isJsonObject()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("entityType = relationData.getAsJsonObject().get(\"type\").getAsJsonPrimitive().getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("entityId = relationData.getAsJsonObject().get(\"id\").getAsJsonPrimitive().getAsString();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("if (!(entityType == null)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("GenericReference genericReference = new GenericReference();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericReference.setName(singleRelation.getKey());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericReference.setValue(entityId);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("// Add attribute to instance");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericInstance.referenceList.add(genericReference);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("if(!relationData.getAsJsonArray().isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("relationData.getAsJsonArray().forEach((singleReference) ->{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("String Type = singleReference.getAsJsonObject().get(\"type\").getAsString();\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("if (!(Type == null)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("GenericReference genericReference = new GenericReference();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericReference.setName(singleRelation.getKey());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericReference.setValue(singleReference.getAsJsonObject().get(\"id\").getAsString());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("// Add attribute to instance");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("genericInstance.referenceList.add(genericReference);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (element.getKey().contains(\"id\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("String value = element.getValue().toString().replaceAll(\"\\\"\",\"\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(value != null ){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Create the attribute");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("GenericAttribute genericAttribute = new GenericAttribute();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericAttribute.setName(\"uuid\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericAttribute.setValue(value);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Add attribute to instance");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericInstance.attributesList.add(genericAttribute);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} if(element.getKey().contains(\"attributes\")) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for( Entry<String, JsonElement> attribute: element.getValue().getAsJsonObject().entrySet()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("GenericAttribute genericAttribute = new GenericAttribute();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericAttribute.setName(attribute.getKey());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericAttribute.setValue(attribute.getValue().toString());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Add attribute to instance");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("genericInstance.attributesList.add(genericAttribute);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return genericInstance;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalMapAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private List<GenericEntity> mapAnswer(JsonElement res) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("GenericEntity generic = new GenericEntity();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<GenericEntity> entityCollection = new ArrayList<GenericEntity>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("res.getAsJsonObject().get(\"data\").getAsJsonArray().forEach((content) -> {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("entityCollection.add(mapSingleAnswer(content));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return entityCollection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public void addWordpressRequester() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void addWordpressSessionManager() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void addWordpressEmbedding() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void addWordpressSorterBuilder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void addWordpressFilterBuilder() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public CharSequence addDrupalPagination() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void addPagination(int pageOffset, int pageLimit) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if ((pageOffset != 0) && (pageLimit != 0)) this.paginationQuery = \"&page[offset]=\"+pageOffset+\"&page[limit]=\"+pageLimit;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (pageOffset != 0) this.paginationQuery = \"&page[offset]=\"+pageOffset;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (pageLimit != 0) this.paginationQuery = \"&page[limit]=\"+pageLimit;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalSessionManager() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public void manageConsumer(String user, String password) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalEmbedding() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void addEmbedReference(String referenceName) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.embedQuery = \"&include=\"+referenceName;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalSorterBuilder() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void addSorter(String fieldName, String sortType) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(sortType.contains(\"ASC\")) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.sorterQuery = \"&sort=\"+fieldName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.sorterQuery = \"&sort=-\"+fieldName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalFilterBuilder() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void addFilter(String fieldName, String value) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.filterQuery = this.filterQuery + \"&filter[\"+fieldName+\"]=\"+value;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addDrupalRequester() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public JsonElement resourceRequest(String resource, String method) {");
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
    _builder.append("HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + resource + this.filterQuery + this.paginationQuery + this.sorterQuery + this.embedQuery))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".method(method, HttpRequest.BodyPublishers.noBody()).header(\"accept\", \"application/json\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//.header(\"Authorization\", basicAuth(this.consumerUser, this.consumerPass))");
    _builder.newLine();
    _builder.append("\t\t");
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
    _builder.append("System.out.println(\"Opps route: \" + resource + \" has returned status: \" + response.statusCode());");
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
