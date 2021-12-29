package com.bridgelabz.Oops;

import java.util.Scanner;

public class Stock {
	private String stockName;
	private int stockPrice;
	private int sharePrice;
	private int numberOfShare;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Name: ");
		String stockName = sc.next();
		System.out.println("Enter Share Price: ");
		int sharePrice = sc.nextInt();
		System.out.println("Enter No. of Shares: ");
		int numberOfShare = sc.nextInt();

		int stockPrice = sharePrice * numberOfShare;
		System.out.println("Total Stock Price: " + stockPrice);
	}
}
