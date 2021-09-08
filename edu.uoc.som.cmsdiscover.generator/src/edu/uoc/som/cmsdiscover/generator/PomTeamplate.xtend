package edu.uoc.som.cmsdiscover.generator



class PomTeamplate {
	
	def getPom() '''
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>generated.cmsdiscover.particularName</groupId>
  <artifactId>generated.particularName</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
  	<dependency>
  		<groupId>org.eclipse.emf</groupId>
  		<artifactId>org.eclipse.emf.ecore</artifactId>
  		<version>2.24.0</version>
  	</dependency>
  	<!-- https://mvnrepository.com/artifact/org.eclipse.emf/org.eclipse.emf.ecore.xmi -->
	<dependency>
	    <groupId>org.eclipse.emf</groupId>
	    <artifactId>org.eclipse.emf.ecore.xmi</artifactId>
	    <version>2.16.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
	<dependency>
	    <groupId>com.google.code.gson</groupId>
	    <artifactId>gson</artifactId>
	    <version>2.8.7</version>
	</dependency>
  </dependencies>
  <properties>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  <build>
      <plugins>
        <!-- any other plugins -->
        <plugin>
          <artifactId>maven-assembly-plugin</artifactId>
          <executions>
            <execution>
              <phase>package</phase>
              <goals>
                <goal>single</goal>
              </goals>
            </execution>
          </executions>
          <configuration>
            <descriptorRefs>
              <descriptorRef>jar-with-dependencies</descriptorRef>
            </descriptorRefs>
          </configuration>
        </plugin>
      </plugins>
    </build>
</project>
	'''
	
}