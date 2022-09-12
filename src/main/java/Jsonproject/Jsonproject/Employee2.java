package Jsonproject.Jsonproject;

import java.util.List;

public class Employee2 {
		private String name ;
		private String position ;
		private List<String> skilltree;
		
		public Employee2()
		{
			
		}
		public Employee2(String name, String position, List<String> skilltree) {
			super();
			this.name = name;
			this.position = position;
			this.skilltree = skilltree;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public List<String> getSkilltree() {
			return skilltree;
		}
		public void setSkilltree(List<String> skilltree) {
			this.skilltree = skilltree;
		}
		
		
		


}
