package com.scenarioforinheritance;

import java.util.Scanner;

class StockHandler{
	private String handlerName;
	private String handlerID;
	public StockHandler(String handlerName, String handlerID) {
		super();
		this.handlerID = handlerID;
		this.handlerName = handlerName;
		System.out.println("Stock Performance Profile Created");
	}
	public String getHandlerName() {
		return handlerName;
	}
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}
	public String getHandlerID() {
		return handlerID;
	}
	public void setHandlerID(String handlerID) {
		this.handlerID = handlerID;
	}
	
	
}

class StockPerformance extends StockHandler{
	private int stockQuantities;
	private int totalStockHandled;
	private double avgStockPerEntry;
	private String handlingGrade;
	public StockPerformance(String handlerName, String handlerID) {
		super(handlerName, handlerID);
	}
	public int getStockQuantities() {
		return stockQuantities;
	}
	public void setStockQuantities(int stockQuantities) {
		this.stockQuantities = stockQuantities;
	}
	public void updateTotalStockQuantites(int Stocks) {
		if(Stocks < 0) {
			System.out.println("Invalid Stock Quantity");
			return;
		}
		this.totalStockHandled += Stocks;
		this.stockQuantities++;
		System.out.println("Stock Quantity Updated Successfully");
	}
	public int getTotalStockHandled() {
		return totalStockHandled;
	}
	public void setTotalStockHandled(int totalStockHandled) {
		this.totalStockHandled = totalStockHandled;
	}
	public double getAvgStockPerEntry() {
		return avgStockPerEntry;
	}
	public void setAvgStockPerEntry(double avgStockPerEntry) {
		this.avgStockPerEntry = avgStockPerEntry;
	}
	public void calculateAvgStocks() {
		this.avgStockPerEntry = this.totalStockHandled / this.stockQuantities;
		System.out.println("Stocks Report Generated Successfully.");
	}
	public String getHandlingGrade() {
		return handlingGrade;
	}
	public void setHandlingGrade(String handlingGrade) {
		this.handlingGrade = handlingGrade;
	}
	public void calculateHandlingGrade() {
		if(this.avgStockPerEntry > 50) {
			this.handlingGrade = "Excellent";
		}else {
			this.handlingGrade = "Good";
		}
	}
	
	public void stockSummary() {
		System.out.println("Stocks Summary");
		System.out.println();
		System.out.println("Handler: "+super.getHandlerName());
		System.out.println("Handler ID: "+super.getHandlerID());
		System.out.println("Total Stocks Handled: "+this.totalStockHandled);
		System.out.println("Average Stock Per Entry: "+this.avgStockPerEntry);
		System.out.println("Handling Grade: "+this.handlingGrade);
	}
	
}

public class StockSystem {
	public static void main(String[] args) {
		String handlerName;
		String handlerID;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Handler Name: ");
		handlerName = sc.nextLine();
		System.out.println("Enter Handler ID: ");
		handlerID = sc.nextLine();
		
		StockPerformance sp = new StockPerformance(handlerName, handlerID);
		
		boolean isContinue = true;

		while (isContinue) {
			System.out.println();
			System.out.println("---Menu---");
			System.out.println();
			System.out.println("1. Add Stock");
			System.out.println("2. Recalculate Result");
			System.out.println("3. View Summary");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter Your Option: ");
			int option = sc.nextInt();
			System.out.println();

			switch (option) {
			case 1: {
				System.out.println("Enter Stock Quantity: ");
				int stocksQnty = sc.nextInt();
				sp.updateTotalStockQuantites(stocksQnty);
				sp.calculateAvgStocks();
				sp.calculateHandlingGrade();
				break;
			}
			case 2: {
				sp.calculateAvgStocks();
				sp.calculateHandlingGrade();
				break;
			}
			case 3: {
				sp.stockSummary();
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
