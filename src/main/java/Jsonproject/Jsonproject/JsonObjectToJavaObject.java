package Jsonproject.Jsonproject;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectToJavaObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om1 = new ObjectMapper();
		
	    Employee1 emp = om1.readValue(new File("C:\\javaprograms\\Employee.json") , Employee1.class);
		
		
		System.out.println("empName = " + emp.getName() + "," + "position = " + emp.getPosition() + "," + "location = " + emp.getAddress());

	}

}
