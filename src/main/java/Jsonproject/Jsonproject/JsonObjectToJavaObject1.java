package Jsonproject.Jsonproject;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.jar.JarException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectToJavaObject1 {

	public static void main(String[] args) throws JsonParseException, JarException, IOException, ClassNotFoundException, SQLException, IllegalArgumentException, IllegalAccessException {
		ObjectMapper om = new ObjectMapper(); 
		List<Employee2> emp = om.readValue(new File("C:\\javaprograms\\Employee1.json"), new TypeReference<List<Employee2>>(){});
		
//		System.out.println(emp.getSkilltree());
//		System.out.println(emp.getName());
		System.out.println(emp);
		
//		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres");
//		String query ="INSERT INTO employeejson(\n" + " name,position,skilltree)\n" + "values(?,?,?)\n" ;
//		PreparedStatement pstmt = con.prepareStatement(query);
//				
//
//		for (Employee2 e : emp) {
//			int i = 1;
//			Class<?> test = e.getClass();
//			Field[] field = test.getDeclaredFields();
//			for (Field filed : field) {
//				filed.setAccessible(true);
//				if (filed.getType() == int.class) {
//					pstmt.setInt(i, filed.getInt(e));
//					i++;
//				} else {
//					pstmt.setString(i, filed.get(e).toString());
//					i++;
//				}
//			}
//			pstmt.execute();
//		}

	}

}
