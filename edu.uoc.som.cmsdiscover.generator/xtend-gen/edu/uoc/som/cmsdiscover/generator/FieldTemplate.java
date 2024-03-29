package edu.uoc.som.cmsdiscover.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FieldTemplate {
  public CharSequence generate(final EClass fieldClass, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = fieldClass.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes = fieldClass.getEAllAttributes();
      for(final EAttribute attribute : _eAllAttributes) {
        _builder.append("\t");
        _builder.append("private ");
        String _instanceTypeName = attribute.getEAttributeType().getInstanceTypeName();
        _builder.append(_instanceTypeName, "\t");
        _builder.append(" ");
        String _name_1 = attribute.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("// Getters and Setters");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes_1 = fieldClass.getEAllAttributes();
      for(final EAttribute attribute_1 : _eAllAttributes_1) {
        _builder.append("\t");
        _builder.append("public ");
        String _instanceTypeName_1 = attribute_1.getEAttributeType().getInstanceTypeName();
        _builder.append(_instanceTypeName_1, "\t");
        _builder.append(" get");
        String _upperCase = attribute_1.getName().substring(0, 1).toUpperCase();
        String _substring = attribute_1.getName().substring(1);
        String _plus = (_upperCase + _substring);
        _builder.append(_plus, "\t");
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \tthis.");
        String _name_2 = attribute_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _upperCase_1 = attribute_1.getName().substring(0, 1).toUpperCase();
        String _substring_1 = attribute_1.getName().substring(1);
        String _plus_1 = (_upperCase_1 + _substring_1);
        _builder.append(_plus_1, "\t");
        _builder.append("(");
        String _instanceTypeName_2 = attribute_1.getEAttributeType().getInstanceTypeName();
        _builder.append(_instanceTypeName_2, "\t");
        _builder.append(" value) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_3 = attribute_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(" = value;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String toUpperCase(final String in) {
    String _upperCase = in.substring(0, 1).toUpperCase();
    String _substring = in.substring(1);
    final String out = (_upperCase + _substring);
    return out;
  }
}
