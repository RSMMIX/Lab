import java.util.*;
public class Pro1_64010726 {

    public static void main(String[] args) {
        // Create a Stock object with the stock  
		// symbol ORCL, the name Oracle Corporation
        Stock stock = new Stock("ORCL","Oracle Corporatiion");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        //Display
        System.out.println("");

    }
}

// class Stock {
//     String symbol;
//     String name;
//     double previousClosingPrice;
//     double currentPrice;
//     public Stock(String symbol,String name){
//         this.symbol = symbol;
//         this.name = name;
//     }
    
// }