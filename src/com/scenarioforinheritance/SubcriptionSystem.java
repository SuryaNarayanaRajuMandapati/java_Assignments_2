package com.scenarioforinheritance;

import java.util.Scanner;

class SubscriptionPlan {
	private String subscriberName;
	private String planType;
	private double planCost;
	private double paidAmount;
	private String subscriptionStatus;

	public SubscriptionPlan(String subscriberName, String planType, double planCost, String subscriptionStatus) {
		super();
		this.subscriberName = subscriberName;
		this.planType = planType;
		this.planCost = planCost;
		this.subscriptionStatus = subscriptionStatus;
		System.out.println("Subscription Profile Created");
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public double getPlanCost() {
		return planCost;
	}

	public void setPlanCost(double planCost) {
		this.planCost = planCost;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		if(paidAmount < 0) {
			System.out.println("Invalid Amount");
			return;
		}
		this.paidAmount = paidAmount;
	}

	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		if(subscriptionStatus.trim() == "") {
			System.out.println("Invaild Status");
			return;
		}
		this.subscriptionStatus = subscriptionStatus;
	}
	
	public void subscriptionProfileDetails() {
		System.out.println("Subscription Summary");
		System.out.println();
		System.out.println("Subscriber: "+this.subscriberName);
		System.out.println("Plan Type: "+this.planType);
		System.out.println("Plan Cost: "+this.planCost);
		System.out.println("Paid Amount: "+this.paidAmount);
		System.out.println("Subscription Status: "+this.subscriptionStatus);
	}

}

public class SubcriptionSystem {
	public static void main(String[] args) {
		String subscriber;
		String planType;
		double planCost;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Subscriber Name: ");
		subscriber = sc.nextLine();
		System.out.println("Enter Plan Type: ");
		planType = sc.nextLine();
		while (true) {
			System.out.println("Enter plan Cost: ");
			planCost = sc.nextDouble();

			if (planCost < 0) {
				System.out.println("Invalid Cost Amount");
			} else {
				break;
			}
		}

		SubscriptionPlan sp = new SubscriptionPlan(subscriber, planType, planCost, "Active");

		boolean isContinue = true;

		while (isContinue) {
			System.out.println();
			System.out.println("---Menu---");
			System.out.println();
			System.out.println("1. Update Payment");
			System.out.println("2. Change Status");
			System.out.println("3. View Summary");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter Your Option: ");
			int option = sc.nextInt();
			System.out.println();

			switch (option) {
			case 1: {
				System.out.println("Enter Paid Amount");
				double amount = sc.nextDouble();
				sp.setPaidAmount(amount);
				break;
			}
			case 2: {
				sc.nextLine();
				System.out.println("Enter Subscription Status: ");
				String status = sc.nextLine();
				sp.setSubscriptionStatus(status);
				break;
			}
			case 3: {
				sp.subscriptionProfileDetails();
				break;
			}
			case 4: {
				isContinue = false;
				System.out.println("Thank You!");
				break;
			}
			}
		}

		sc.close();
	}

}
