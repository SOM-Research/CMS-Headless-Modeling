package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestGenerator {
  public CharSequence getTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.connector.generator;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.gson.JsonElement;");
    _builder.newLine();
    _builder.append("import Article;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class test {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Article article = new Article();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JsonElement answer = article.getCollection();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(answer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
