package com.livetechstudy.spring.autowire;

public class Department {
	private String departmentID;
	private String detpartmentName;
	public String getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	public String getDetpartmentName() {
		return detpartmentName;
	}
	public void setDetpartmentName(String detpartmentName) {
		this.detpartmentName = detpartmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", detpartmentName=" + detpartmentName + "]";
	}
	
}
