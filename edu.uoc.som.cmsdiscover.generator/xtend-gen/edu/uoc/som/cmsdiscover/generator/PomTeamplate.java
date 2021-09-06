package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PomTeamplate {
  public CharSequence getPom() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<groupId>generated.cmsdiscover.particularName</groupId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<artifactId>generated.particularName</artifactId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<version>0.0.1-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<groupId>org.eclipse.emf</groupId>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<artifactId>org.eclipse.emf.ecore</artifactId>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<version>2.24.0</version>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<!-- https://mvnrepository.com/artifact/org.eclipse.emf/org.eclipse.emf.ecore.xmi -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<groupId>org.eclipse.emf</groupId>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<artifactId>org.eclipse.emf.ecore.xmi</artifactId>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<version>2.16.0</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<groupId>com.google.code.gson</groupId>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<artifactId>gson</artifactId>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<version>2.8.7</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<maven.compiler.source>1.8</maven.compiler.source>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<maven.compiler.target>1.8</maven.compiler.target>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    return _builder;
  }
}
