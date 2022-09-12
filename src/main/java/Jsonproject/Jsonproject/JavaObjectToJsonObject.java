package Jsonproject.Jsonproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJsonObject {
  public static void main(String[] args) throws JsonProcessingException {
	  ObjectMapper om = new ObjectMapper();
	  
	  Employee e = new Employee(1 , "rahul" , "25000");
	  
	  String jsonformat = om.writeValueAsString(e);
	  
	  System.out.println(jsonformat);  
  }
}

