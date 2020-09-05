
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep*/
public class Cookie_Calories {
    public static void main (String[] args){
        //Calculate the Number of Cookies per Serving
        final double CALORIES_PER_SERVING = 300; 
        final double COOKIES_IN_BAG = 40;
        final double SERVINGS_IN_BAG = 10;
        double CookiesPerServing = COOKIES_IN_BAG / SERVINGS_IN_BAG; 
        
        //Calculate the Number of Calories per Cookie 
        double CaloriesPerCookie = CALORIES_PER_SERVING / CookiesPerServing;
        
        // Ask the user to enter the number of cookies they ate 
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the number of cookies that you ate: ");
        
        // Calculate the number of calories the user ate
        double CookiesAte = keyboard.nextDouble();
        double CaloriesConsumed = CaloriesPerCookie * CookiesAte; 
        System.out.println("You consumed " + CaloriesConsumed + " Calories");
    }
}
