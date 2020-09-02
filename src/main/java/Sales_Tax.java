
import java.util.Scanner;
import java.text.DecimalFormat;
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
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args){
        //Get the Purchase Amount and Display it
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of your purchase: ");
        double PurchaseAmount = keyboard.nextDouble(); 
        System.out.println("Your purchase amount is: " + df.format(PurchaseAmount));
        
        //Calculate County Sales Tax and Dispaly it
        final double COUNTY_SALES_TAX_AMMOUNT = 0.02;
        double CountySalesTax = PurchaseAmount * COUNTY_SALES_TAX_AMMOUNT;
        System.out.println("County Sales Tax: " + df.format(CountySalesTax));
        
        //Calculate State Sales Tax and Display it 
        final double STATE_SALES_TAX_AMMOUNT = 0.04; 
        double StateSalesTax = PurchaseAmount * STATE_SALES_TAX_AMMOUNT;
        System.out.println("State Sales Tax: " + df.format(StateSalesTax));
        
        //Calculate Total Sales Tax and Display it 
        double TotalSalesTax = CountySalesTax + StateSalesTax; 
        System.out.println("Total Sales Tax: " + df.format(TotalSalesTax));
        
        
        // Calculate the Total of the Sale and Displaly it 
        double SaleTotal = PurchaseAmount + TotalSalesTax; 
        System.out.println("Your sales total is: " + df.format(SaleTotal));
                
    }
    
}
