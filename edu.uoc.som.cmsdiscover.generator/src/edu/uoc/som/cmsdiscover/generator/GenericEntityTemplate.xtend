package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EPackage

class GenericEntityTemplate {
	
	def generateGenericEntity(EPackage thePackage) '''
	
	package generated.middleware.«thePackage.getName()».drivers;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class GenericEntity {
		
		public List<GenericAttribute> attributesList = new ArrayList<GenericAttribute>();
		public List<GenericReference> referenceList = new ArrayList<GenericReference>();
	
	}
	
	
	'''	
	
	def generateGenericAttribute(EPackage thePackage) '''
	package generated.middleware.«thePackage.getName()».drivers;
	
	public class GenericAttribute {
	
		
		String name;
		String value;
		
		
		public String getName() {
			return this.name;
		}
		
		public String getValue() {
			return this.value;
		}
		
		public void setName(String value) {
			this.name = value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	'''
	
	def generateGenericReference(EPackage thePackage) '''
	package generated.middleware.«thePackage.getName()».drivers;
	
	public class GenericReference {
	
		String name;
		String value;
		
		
		public String getName() {
			return this.name;
		}
		
		public String getValue() {
			return this.value;
		}
		
		public void setName(String value) {
			this.name = value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
	
	}
	
	'''
}