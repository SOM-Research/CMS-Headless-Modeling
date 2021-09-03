package edu.uoc.som.cmsdiscover.generator



class TestGenerator {
	
	def getTest() '''
	package org.connector.generator;
	
	import com.google.gson.JsonElement;
	import Article;

	public class test {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Article article = new Article();
			JsonElement answer = article.getCollection();
			System.out.println(answer);
		}
	
	}
	'''
	
}