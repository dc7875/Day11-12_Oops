package com.bridgelabz.Oops;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class StockProtfolio {
	private static ArrayList list = new ArrayList();

	private static void stockPortfolio() {
		System.out.println("Please Enter number of stocks: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStocks = sc.nextInt();
		for (int i = 0; i < numberOfStocks; i++) {

			System.out.println("Stock name:");
			String stockName = sc.next();
			System.out.println("Numbers of shares: ");
			int numberOfShares = sc.nextInt();
			System.out.println("Stock price:");
			int stockPrice = sc.nextInt();
			list.add(new Stock());
			calculateTotalStock(numberOfShares, stockPrice);

		}
	}

	public static int calculateTotalStock(int numberOfShares, int stockPrice) {
		int totalStocks = 0;
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Stock stock = (Stock) itr.next();
			int stocks = stock.getNumberOfShare() * stock.getStockPrice();
			System.out.println("Name of Stock : " + stock.getStockName() + " Total Stock Price " + stocks);
			totalStocks = totalStocks + stocks;
		}
		System.out.println("Total value of stocks : " + totalStocks);
		return numberOfShares * stockPrice;
	}

	public static void main(String[] args) {
		stockPortfolio();

	}

}
