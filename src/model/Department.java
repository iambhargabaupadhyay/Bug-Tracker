package model;

public class Department {
	private String DepartmentId;
	private String DepartmentName;
	private String Location;
	
	
	public Department(String departmentId, String departmentName, String location) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		Location = location;
	}
	
	public String getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(String departmentId) {
		DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
}
