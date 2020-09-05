
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class Sales_Tax {
    public static void main (String[] args){
        //Get the Purchase Amount and Display it
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of your purchase: ");
        double PurchaseAmount = keyboard.nextDouble(); 
        System.out.printf("\n Your purchase amount is: $%.2f", PurchaseAmount);
        
        //Calculate County Sales Tax and Dispaly it
        final double COUNTY_SALES_TAX_AMMOUNT = 0.02;
        double CountySalesTax = PurchaseAmount * COUNTY_SALES_TAX_AMMOUNT;
        System.out.printf("\n County Sales Tax: $%.2f", CountySalesTax);
        
        //Calculate State Sales Tax and Display it 
        final double STATE_SALES_TAX_AMMOUNT = 0.04; 
        double StateSalesTax = PurchaseAmount * STATE_SALES_TAX_AMMOUNT;
        System.out.printf("\n State Sales Tax: $%.2f", StateSalesTax);
        
        //Calculate Total Sales Tax and Display it 
        double TotalSalesTax = CountySalesTax + StateSalesTax; 
        System.out.printf("\n Total Sales Tax: $%.2f", TotalSalesTax);
        
        
        // Calculate the Total of the Sale and Displaly it 
        double SaleTotal = PurchaseAmount + TotalSalesTax; 
        System.out.printf("\n Your sales total is: $%.2f", SaleTotal);
                
    }
    
}
