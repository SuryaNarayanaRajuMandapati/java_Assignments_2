package com.scenarioforinheritance;
import java.util.Scanner;

class InsurancePolicy{
	private String customerName;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;

	public InsurancePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		super();
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = policyStatus;
		
		System.out.println("Policy Profile Created.");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(double approvedAmount) {
		if(approvedAmount < 0) {
			System.out.println("Invaild Amount");
			return;
		}
		this.approvedAmount = approvedAmount;
		System.out.println("Amount Updated Successfully");
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
		System.out.println("Policy Status Updated Successfully");
	}
	
	public void policyProfileDetails() {
		System.out.println("Customer: "+customerName);
		System.out.println("Policy Type: "+policyType);
		System.out.println("Policy Amount: "+policyAmount);
		System.out.println("Approved Amount: "+approvedAmount);
		System.out.println("Policy Status: "+policyStatus);
	}
}

public class PolicyManagement {
	public static void main(String[] args) {
		String customerName;
		String policyType;
		double policyAmount;
		double approvedAmount = 0;
		String policyStatus = "Pending";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer: ");
		customerName = sc.nextLine();
		System.out.print("Enter Policy Type: ");
		policyType = sc.nextLine();
		while(true) {
			System.out.print("Enter Policy Amount: ");
			policyAmount = sc.nextDouble();
				
			if(policyAmount < 0) {
				System.out.println("Invalid Amount");
			}else {
				break;
			}
		}
		
		
		
		InsurancePolicy ip = new InsurancePolicy(customerName, policyType, policyAmount, approvedAmount, policyStatus);
		
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println();
			System.out.println("---Menu---");
			System.out.println();
			System.out.println("1. Update Approved Amount");
			System.out.println("2. Change Policy Status");
			System.out.println("3. View Summary");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter Your Option: ");
			int option = sc.nextInt();
			System.out.println();
			
			switch(option) {
				case 1:{
					System.out.print("Enter Approved Amount: ");
					double amount = sc.nextDouble();
					ip.setApprovedAmount(amount);
					break;
				}
				case 2:{
					sc.nextLine();
					System.out.print("Enter Policy Status: ");
					String status = sc.nextLine();
					ip.setPolicyStatus(status);;
					break;
				}
				case 3:{
					System.out.println("----Policy Profile Summary----");
					ip.policyProfileDetails();
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
