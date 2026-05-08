package com.placementtest;
import java.util.Scanner;

abstract class Vehicle{
	private String ownerName;
	private String vehicleNumber;
	private String vehicleType;
	
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleType() {
		return this.vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public abstract void displayProfile();
}


interface ServiceOperations{
	
	void updateServiceCategory(String category);
	void updateServiceCenter(String serviceCenter);
}

class ServiceVehicle extends Vehicle implements ServiceOperations{
	
	private String serviceCenterName;
	private String serviceCategory;
	
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName, String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println();
		System.out.println("Vehicle Profile Created Successfully");
	}
	
	
	
	public String getServiceCenterName() {
		return serviceCenterName;
	}



	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}



	public String getServiceCategory() {
		return serviceCategory;
	}



	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}



	@Override
	public void displayProfile() {
		System.out.println();
		System.out.println("Owner Name: "+super.getOwnerName());
		System.out.println("Vehicle Number: "+super.getVehicleNumber());
		System.out.println("Service Center: "+this.serviceCenterName);
		System.out.println("Service Category: "+this.serviceCategory);
	}

	@Override
	public void updateServiceCategory(String category) {
		if(category.trim() == "" || category.trim()==null) {
			System.out.println("Invalid Service Category");
			return;
		}
		this.serviceCategory = category;
		
		System.out.println();
		System.out.println("Service Category Updated Successfully");
	}
	
	@Override
	public void updateServiceCenter(String center) {
		if(center.trim() == "" || center.trim()==null) {
			System.out.println("Invalid Service Center");
			return;
		}
		this.serviceCenterName = center;
		System.out.println();
		System.out.println("Service Center Updated Successfully");
	}
}

public class VehicleServiceSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Owner Name: ");
		String ownerName = sc.nextLine();
		System.out.print("Enter Vehicle Number: ");
		String vehicleNumber = sc.nextLine();
		System.out.print("Enter Vehicle Type: ");
		String vehicleType = sc.nextLine();
		System.out.print("Enter Service Center Name: ");
		String serviceCenterName = sc.nextLine();
		System.out.print("Enter Service Category: ");
		String serviceCategory = sc.nextLine();
		
		Vehicle v = new ServiceVehicle(ownerName,vehicleNumber,vehicleType,serviceCenterName,serviceCategory);
		ServiceVehicle sv = (ServiceVehicle)v;

		
		boolean isBreak = false;
		
		while(true) {
			System.out.println();
			System.out.println("--- Vehicle Service Menu ---");
			System.out.println("1. Update Service Category");
			System.out.println("2. Update Service Center");
			System.out.println("3. View Profile");
			System.out.println("4. Exit");
			
			System.out.println();
			
			System.out.print("Choose your Option: ");
			
			int value = sc.nextInt();
			switch(value) {
				case 1: {
					sc.nextLine();
					System.out.print("Enter Service Categroy:");
					String category = sc.nextLine();
					sv.updateServiceCategory(category);
					break;
				}
				case 2: {
					sc.nextLine();
					System.out.print("Enter Service Center: ");
					String center = sc.nextLine();
					sv.updateServiceCenter(center);
					break;
				}
				case 3: {
					System.out.println();
					System.out.println("Vehicle Details");
					System.out.println("----------------------");
					v.displayProfile();
					break;
				}
				case 4:{
					System.out.println("Thanks for using this service");
					isBreak = true;
					break;
				}
				default: {
					System.out.println("Invalid Option");
				}
			}
			
			
			if(isBreak) {
				break;
			}
				
		}
		
		sc.close();
	}
}
