package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList

class Template {
	def generateMiddleWare(EClass modelClass, EList<EClass> superClasses) '''
		package Web_Name
	
		import org.eclipse.emf.ecore.EClass
		import org.eclipse.emf.ecore.EAttribute
	
	
		public class «modelClass.getName()» extends « IF !superClasses.isEmpty()» « superClasses.get(0).getName()» «ENDIF» {
			« IF !superClasses.isEmpty()»
			« superClasses.get(0).getName()»
			«ENDIF»
			// Attributes
			« FOR EAttribute attribute : modelClass.getEAllAttributes()»
				«addAttribute(attribute)»
			«ENDFOR»
			
			// Constructor
			 «addConstructor(modelClass)»
			
			// Methods
			// Getters
			«addSingleGetter()»
			«addCollectionGetter()»

		}
	'''
	
	def addConstructor(EClass entity) '''
		public «entity.getName()»(params) {
			// Init params
		}
	'''

	
	def addSingleGetter() '''
		public Entity getSingle(name) {
			// request (URL, Resource + name)
			// map()
			return Entity
		}
		
	
	'''
	
	def addCollectionGetter() '''
		public List<Entity> getCollection(name) {
			// request (URL, Resource + name)
			// For answer : aswers
			// map()
			return List<Entity>
		}
	'''
	
	def addAttribute(EAttribute attribute) '''
		private «attribute.getEAttributeType().getName()» «attribute.getName()» ;
	'''
		
}
