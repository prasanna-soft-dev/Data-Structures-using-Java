/*Problem Statement – 
Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the 
quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and
display it in the format (liters per 100 kilometers).

Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.

[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :

float cost=670.23;

System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);

Sample Input 1:
Enter the no of liters to fill the tank
           20
Enter the distance covered
           150
Sample Output 1:
Liters/100KM
          13.33
Miles/gallons
          17.64
Explanation: 

For 150 KM fuel consumption is 20 liters, 
Then for 100 KM fuel consumption would be (20/150)*100=13.33,
Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
Fuel consumption is given in liters, we have to convert it to gallons (20*0.2642)=5.284, 
Then find (miles/gallons)=(93.21/5.284)=17.64 */

import java.util.*;
public class FuelConsumption{
    public static void European(double fuel, double distance)
    {
        double ans=(fuel / distance) * 100;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f\n", ans);
    }
    public static void milesGallons(double fuel, double distance)
    {
        double miles = (distance * 6214);
        double gallon = (fuel * 2642);
        
        double ans = (miles / gallon);
        System.out.println("Miles/gallons");
        System.out.printf("%.2f\n", ans);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of liters to fill the tank ");

        double fuel = sc.nextDouble();
        
        System.out.println("Enter the distance covered");

        double distance = sc.nextDouble();

        European(fuel, distance);
        milesGallons(fuel, distance);
    }
    
}
