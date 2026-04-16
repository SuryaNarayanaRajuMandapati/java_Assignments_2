package com.scenarioforinheritance;
import java.util.Scanner;

class SalesEmployee{
	private String employeeName;
	private int employeeID;
	
	public SalesEmployee(String employeeName, int employeeID) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}

class PerformanceEmployee extends SalesEmployee{
	int salesEntryList = 0;
	double totalSales = 0;
	double averageSales = 0;
	String performanceGrade;

	public PerformanceEmployee(String employeeName, int employeeID) {
		super(employeeName, employeeID);
		System.out.println("Employee Sales Profile Created");
	}

	public int getSalesEntryList() {
		return salesEntryList;
	}

	public void setSalesEntryList(int salesEntryList) {
		this.salesEntryList = salesEntryList;
	}
	
	public void updateSalesEntry() {
		this.salesEntryList++;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	public void updateTotalSales(double amount) {
		if(amount < 0) {
			System.out.println("Invalid Amount");
			return;
		}
		this.totalSales += amount;
		System.out.println("Sales Amount Added Successfully");
	}

	public double getAverageSales() {
		return averageSales;
	}

	public void setAverageSales(double averageSales) {
		this.averageSales = averageSales;
	}
	
	public void calculateAverageSales() {
		this.averageSales = (this.totalSales / this.salesEntryList);
	}

	public String getPerformanceGrade() {
		return performanceGrade;
	}

	public void setPerformanceGrade(String performanceGrade) {
		this.performanceGrade = performanceGrade;
	}
	
	public void assignPerformanceGrade(){
		if(this.averageSales > 10000) {
			this.performanceGrade = "Excellent";
		}
		else {
			this.performanceGrade = "Good";
		}
	}
	
	public void employeeSalesSummary() {
		System.out.println("---Sales Summary---");
		System.out.println("Employee Name: "+super.getEmployeeName());
		System.out.println("Employee ID: "+super.getEmployeeID());
		System.out.println("Total Sales: "+this.totalSales);
		System.out.println("Average Sales: "+this.averageSales);
		System.out.println("Performance Grade: "+this.performanceGrade);
		System.out.println();
	}
	
}

public class EmployeeSalesTracking {
	public static void main(String[] args) {
		String employeeName;
		int employeeID;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		employeeName = sc.nextLine();
		System.out.println("Enter Employee ID: ");
		employeeID = sc.nextInt();
		
		PerformanceEmployee pe = new PerformanceEmployee(employeeName, employeeID);
		
		boolean isContinue = true;
		while(isContinue) {
			System.out.println();
			System.out.println("---Menu---");
			System.out.println();
			System.out.println("1. Add Sales");
			System.out.println("2. Recalculate Result");
			System.out.println("3. View Summary");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter Your Option: ");
			int option = sc.nextInt();
			System.out.println();
			
			switch(option) {
				case 1:{
					System.out.print("Enter Sales Amount: ");
					double amount = sc.nextDouble();
					pe.updateSalesEntry();
					pe.updateTotalSales(amount);
					pe.calculateAverageSales();
					pe.assignPerformanceGrade();
					System.out.println("Employee sales Analytics Generated Successfully");
					break;
				}
				case 2:{
					pe.calculateAverageSales();
					pe.assignPerformanceGrade();
					System.out.println("Employee sales Analytics Generated Successfully");
					break;
				}
				case 3:{
					pe.employeeSalesSummary();
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
