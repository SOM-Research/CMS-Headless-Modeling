package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass

class Template {
	def generateMiddleWare(EClass entity) '''
		package Web_Name
	
		import org.eclipse.emf.ecore.EClass
		import org.eclipse.emf.ecore.EAttribute
	
	
		public class «entity.getName()»(url) extends LA SUPER CLASS. {
			
			
			// Attributes
			« FOR EAttribute attribute : entity.getEAllAttributes()»
				«addAttribute(attribute)»
			«ENDFOR»
			
			// Constructor
			 «addConstructor(entity)»
			
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
