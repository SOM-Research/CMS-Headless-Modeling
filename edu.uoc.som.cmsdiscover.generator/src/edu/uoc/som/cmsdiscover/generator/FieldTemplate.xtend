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
		public «attribute.getEAttributeType().getInstanceTypeName()» get_«attribute.getName()» () {
			return 	this.«attribute.getName()»;
		}
		
		public void set_«attribute.getName()» («attribute.getEAttributeType().getInstanceTypeName()» value) {
			this.«attribute.getName()» = value;
		}
		«ENDFOR»
	}
	'''
}