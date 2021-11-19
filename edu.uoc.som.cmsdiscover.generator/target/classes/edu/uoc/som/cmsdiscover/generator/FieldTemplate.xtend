package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EClass

class FieldTemplate {
	def generate(EClass fieldClass, String packageName) '''
	package «packageName»;
	
	public class «fieldClass.getName()» {
		
		«FOR attribute : fieldClass.getEAllAttributes()»
		 private «attribute.getEAttributeType().getInstanceTypeName()» «attribute.getName()»;
		«ENDFOR»
		// Getters and Setters
		«FOR attribute : fieldClass.getEAllAttributes()»
		public «attribute.getEAttributeType().getInstanceTypeName()» get«attribute.getName().substring(0, 1).toUpperCase() + attribute.getName().substring(1)» () {
			return 	this.«attribute.getName()»;
		}
		
		public void set«attribute.getName().substring(0, 1).toUpperCase() + attribute.getName().substring(1)»(«attribute.getEAttributeType().getInstanceTypeName()» value) {
			this.«attribute.getName()» = value;
		}
		«ENDFOR»
	}
	'''
	
	def toUpperCase(String in){
		val out = in.substring(0, 1).toUpperCase() + in.substring(1);
		return out
	}
}