package com.scenarioforinheritance;
import java.util.Scanner;

class Staff{
	private String staffName;
	private String staffID;
	private String baseShift;
	
	public Staff(String staffName, String staffID, String baseShift) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.baseShift = baseShift;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getBaseShift() {
		return baseShift;
	}

	public void setBaseShift(String baseShift) {
		this.baseShift = baseShift;
	}
	
	
}

class DepartmentStaff extends Staff{
	private String departmentName;
	private String responsibilityLevel;
	
	public DepartmentStaff(String staffName, String staffID, String baseShift, String departmentName, String responsibilityLevel) {
		super(staffName, staffID, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
		System.out.println("Staff Profile Created");
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		if(departmentName.trim() == "") {
			System.out.println("Invalid Department Name");
			return;
		}
		this.departmentName = departmentName;
		System.out.println("Department Name Updated Successfully.");
	}

	public String getResponsibilityLevel() {
		return responsibilityLevel;
	}

	public void setResponsibilityLevel(String responsibilityLevel) {
		if(responsibilityLevel.trim() == "") {
			System.out.println("Invalid Level");
			return;
		}
		this.responsibilityLevel = responsibilityLevel;	
		System.out.println("Responsibility Level Updated Successfully.");
	}
	
	public void staffProfile() {
		System.out.println("Name: "+super.getStaffName());
		System.out.println("Staff ID: "+super.getStaffID());
		System.out.println("Shift: "+super.getBaseShift());
		System.out.println("Department: "+this.departmentName);
		System.out.println("Responsibility: "+this.responsibilityLevel);
	}
	
}

public class StaffAndDepartmentSystem {
	public static void main(String[] args) {
		String staffName;
		String staffID;
		String baseShift;
		String departmentName;
		String responsibilityLevel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Staff Name: ");
		staffName = sc.nextLine();
		System.out.println("Enter Staff ID: ");
		staffID = sc.nextLine();
		System.out.println("Enter Base Shift: ");
		baseShift = sc.nextLine();	
		System.out.println("Enter Department Name: ");
		departmentName = sc.nextLine();
		System.out.println("Enter Responsibility Level: ");
		responsibilityLevel = sc.nextLine();
		
		DepartmentStaff ds = new DepartmentStaff(staffName, staffID, baseShift, departmentName, responsibilityLevel);
		
boolean isContinue = true;
		
		while(isContinue) {
			System.out.println();
			System.out.println("---Menu---");
			System.out.println();
			System.out.println("1. Update Responsibility");
			System.out.println("2. Update Department");
			System.out.println("3. View Profile");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter Your Option: ");
			int option = sc.nextInt();
			System.out.println();
			
			switch(option) {
				case 1:{
					sc.nextLine();
					System.out.println("Enter Responsibility Level: ");
					String resLevel = sc.nextLine();
					ds.setResponsibilityLevel(resLevel);
					break;
				}
				case 2:{
					sc.nextLine();
					System.out.println("Enter Department Name: ");
					String depName = sc.nextLine();
					ds.setDepartmentName(depName);
					break;
				}
				case 3:{
					ds.staffProfile();
					break;
				}
				case 4:{
					isContinue = false;
					System.out.println("Thank You!");
					break;
				}
			}
		}
		
		sc.close();
	}
}









