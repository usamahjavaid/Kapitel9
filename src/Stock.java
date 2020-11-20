/*
(The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class. Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle
Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage.
 */


public class Stock {

    String symbol; //A string data field named symbol for the stock’s symbol.
    String name;  //A string data field named name for the stock’s name.
    double previousClosingPrice; //A double data field named previousClosingPrice
    double currentPrice; //A double data field named currentPrice

    //Construct a stock with specified symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    //returns the percentage changed from previousClosingPrice to currentPrice.

    double getChangePercent(){

        return ((currentPrice - previousClosingPrice)/ previousClosingPrice * 100);

    }

    public static void main(String[] args) {

        //creates a Stock object with the stock symbol ORCL, the name Oracle Corporation
        Stock stock = new Stock ("ORCL", "Oracle Coporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 35.35;

        //Display the price-change percentage

        System.out.println("Stock name: " + stock.name);
        System.out.println("Stock symbol:  " + stock.symbol);
        System.out.println("Price-change percentage: " + stock.getChangePercent() );
    }
}
