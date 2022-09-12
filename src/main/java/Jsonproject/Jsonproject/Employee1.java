package Jsonproject.Jsonproject;

public class Employee1 {
	private String name ;
	private String position ;
	private String address ;
	
	
	public Employee1()
	{
		
	}
	public Employee1(String name, String position, String address) {
		super();
		this.name = name;
		this.position = position;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
