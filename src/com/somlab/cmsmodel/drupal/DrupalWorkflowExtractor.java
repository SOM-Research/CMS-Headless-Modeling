package com.somlab.cmsmodel.drupal;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map.Entry;
//import org.eclipse.emf.common.util.URI;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import workflowMetamodel.WorkflowMetamodelFactory;
import workflowMetamodel.WorkflowMetamodelPackage;
import workflowMetamodel.impl.WorkflowMetamodelPackageImpl;
import workflowMetamodel.permission;
import workflowMetamodel.role;
import workflowMetamodel.root;
import workflowMetamodel.state;
import workflowMetamodel.transition;
import workflowMetamodel.user;
import workflowMetamodel.workflow;

public class DrupalWorkflowExtractor {
	
	WorkflowMetamodelPackage _WorkflowPackage;
	WorkflowMetamodelFactory _WorkflowFactory;
	
	
	public root getWorkflows(String host, String basePath, List<String> resources_path) {
		WorkflowMetamodelPackageImpl.init();
		WorkflowMetamodelPackage.eINSTANCE.eClass();

		//_WorkflowPackage = WorkflowMetamodelPackage.eINSTANCE;
		_WorkflowFactory = WorkflowMetamodelFactory.eINSTANCE;
		String baseUrl = host + basePath;
		System.out.println("******************* in workflows");
  		//_WorkflowPackage.setName("Workflows");
		//_WorkflowPackage.setNsPrefix("Workflows");
		//_WorkflowPackage
		//		.setNsURI("http:///com.somlab.drupal");
		root rootWorkflow = _WorkflowFactory.createroot();
		resources_path.forEach((singleResource) ->  { 
			switch (singleResource) {
			  	case("/workflow/workflow"): {
		
					
			  		// Create Workflow, states, transitions & permissions
			  		JsonObject data = ResourceRequest(baseUrl, singleResource);
			  		for(Entry<String, JsonElement> workflows : data.entrySet()) {			  
			  			if (workflows.getKey().contains("data")) {
			  				JsonArray workflowsValue = (JsonArray) workflows.getValue();
			  				System.out.println("*******************" + data.toString());
			  				for (JsonElement workflow : workflowsValue) {
			  					JsonObject workflowObject = workflow.getAsJsonObject().get("attributes").getAsJsonObject();
			  					
			  					workflow workflowClass = _WorkflowFactory.createworkflow();
			  					workflowClass.setLabel(workflowObject.get("label").getAsString());
			  					workflowClass.setWorkflow_code(workflowObject.get("drupal_internal__id").getAsString());
			  					workflowClass.setStatus(workflowObject.get("status").getAsBoolean());
			  					workflowClass.setLangocde(workflowObject.get("langcode").getAsString());
			  					// Create States
			  					JsonObject states = workflowObject.getAsJsonObject().get("type_settings").getAsJsonObject().get("states").getAsJsonObject();
			  					for(Entry<String, JsonElement> state : states.entrySet()) {		
			  						state stateInstance = _WorkflowFactory.createstate();
			  						JsonObject stateObject = state.getValue().getAsJsonObject();
			  						stateInstance.setCode(state.getKey());
			  						stateInstance.setLabel(stateObject.get("label").getAsString());
			  						stateInstance.setWeight(stateObject.get("weight").getAsInt());
			  						stateInstance.setPublished(stateObject.get("published").getAsBoolean());
			  						stateInstance.setDefault_revision(stateObject.get("default_revision").getAsBoolean());
			  						workflowClass.getStates().add(stateInstance);
			  					}
			  					JsonObject transitions = workflowObject.getAsJsonObject().get("type_settings").getAsJsonObject().get("transitions").getAsJsonObject();
			  					for(Entry<String, JsonElement> transition : transitions.entrySet()) {		
			  						transition transitionInstance = _WorkflowFactory.createtransition();
			  						JsonObject transitionObject = transition.getValue().getAsJsonObject();
			  						transitionInstance.setCode(transition.getKey());
			  						transitionInstance.setLabel(transitionObject.get("label").getAsString());
			  						transitionInstance.setWeight(transitionObject.get("weight").getAsInt());
			  						// Set states references
			  						workflowClass.getStates().forEach((state) -> {
			  							if (state.getCode().contains(transitionObject.get("to").getAsString())) {
			  								transitionInstance.setTo(state);
			  							}
			  							transitionObject.get("from").getAsJsonArray().forEach((fromState) -> {
			  								if (state.getCode().contains(fromState.getAsString())) {
				  								transitionInstance.getFrom().add(state);
				  							}
			  							});
			  						});
			  						workflowClass.getTransitions().add(transitionInstance);
			  						// For every transition, we can create manually the specific permision class
			  						permission permissionInstance = _WorkflowFactory.createpermission();
			  						permissionInstance.setPermission_code("use editorial transition "+transition.getKey());
			  						rootWorkflow.getPermission().add(permissionInstance);
			  					}
			  					//_WorkflowPackage.getEClassifiers().add( (EClassifier) workflowClass);
			  					rootWorkflow.getWorkflow().add(workflowClass);
			  						
			  					}
			  			}
			  		}
			  		// Create users roles
			  		singleResource = "/user_role/user_role";
			  		JsonObject response = ResourceRequest(baseUrl, singleResource);
			  		for(Entry<String, JsonElement> user_roles : response.entrySet()) {			  
			  			if (user_roles.getKey().contains("data")) {
			  				JsonArray user_roles_value = (JsonArray) user_roles.getValue();
			  				for (JsonElement user_role : user_roles_value) {
			  					role userRole = _WorkflowFactory.createrole();
			  					userRole.setId(user_role.getAsJsonObject().get("id").getAsString());
			  					userRole.setLabel(user_role.getAsJsonObject().get("attributes").getAsJsonObject().get("label").getAsString());
			  					userRole.setDrupal_internal__id(user_role.getAsJsonObject().get("attributes").getAsJsonObject().get("drupal_internal__id").getAsString());
			  					JsonArray rolePermissions = user_role.getAsJsonObject().get("attributes").getAsJsonObject().get("permissions").getAsJsonArray();
			  					rolePermissions.forEach((permission) -> {
			  						rootWorkflow.getPermission().forEach((permissionClass) -> {
			  							if((permissionClass.getPermission_code()).contains(permission.getAsString())) {
			  								userRole.getPermissions().add(permissionClass);
			  							}
			  						});
			  					});
		//	  				    workflowPackage.getEClassifiers().add( (EClass) userRole);
			  					rootWorkflow.getRole().add(userRole);
			  				}
			  			}
			  		}
			  		// Create user instances
			  		singleResource = "/user/user";
			  		JsonObject responseUsers = ResourceRequest(baseUrl, singleResource);
			  		user userInstance = _WorkflowFactory.createuser();
			  		for(Entry<String, JsonElement> users : responseUsers.entrySet()) {	
			  			if (users.getKey().contains("data")) {
			  				JsonArray usersValue = (JsonArray) users.getValue();
			  				for (JsonElement userSingle : usersValue) {
			  					System.out.println("User: "+ userSingle);
			  					userInstance.setId(userSingle.getAsJsonObject().get("id").getAsString());
			  					JsonObject userAttr = userSingle.getAsJsonObject().get("attributes").getAsJsonObject();
			  					System.out.println(userAttr.get("display_name").getAsString());
				  					if (userAttr.get("display_name").getAsString().contains("Anonymous")) {
				  					userInstance.setName(userAttr.get("display_name").getAsString());
			  					} else {
			  						userInstance.setName(userAttr.get("display_name").getAsString());
				  					userInstance.setUid(userAttr.get("drupal_internal__uid").getAsInt());
				  					userInstance.setLangocde(userAttr.get("langcode").getAsString());
				  					userInstance.setTimezone(userAttr.get("timezone").getAsString());
				  					userInstance.setMail(userAttr.get("mail").getAsString());
				  					userInstance.setStatus(userAttr.get("status").getAsBoolean());
				  					// Now we are goingo to create the roles relationship
				  					JsonArray userRoles = userSingle.getAsJsonObject().get("relationships").getAsJsonObject().get("roles").getAsJsonObject().get("data").getAsJsonArray();
				  					userRoles.forEach((userRole) -> {
				  						String id = userRole.getAsJsonObject().get("id").getAsString();
				  						rootWorkflow.getRole().forEach((roleClass) -> { 
				  							if ( (roleClass.getId()).contains(id)) {
				  								userInstance.getRoles().add(roleClass);
				  							}
				  						});
				  					});
			  					}
			  					rootWorkflow.getUser().add(userInstance);
			  				}
			  			}
			  		}
			  		
			  		
			  		break;
			  	}
				case("/user_role/user_role"): {
			  		
			  		break;
			  	}
				default: break;
			}
		});
		

		//_WorkflowPackage.getEClassifiers().add( (EClassifier) rootWorkflow);
		
		return rootWorkflow;
	}
	
	public JsonObject ResourceRequest(String baseUrl, String singleResource) {
		
		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder(
		       URI.create("https://" + baseUrl.replace("\"", "") + singleResource.replace("\"", "") ))
		   .header("accept", "application/json").setHeader("Cookie", "SSESS6745cea9edb54d790af01271456d40dd=NNQFDkCiClF2KtEpnBbi0X6U4XczxndR6zE_tBJexEk")
		   .build();

		// use the client to send the request
		try {
			var response = client.send(request, BodyHandlers.ofString());
			JsonObject res = new JsonParser().parse(response.body()).getAsJsonObject();
			return res;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public root CreateWorkflows(root workflowRoot) {
		return workflowRoot;
	}
}