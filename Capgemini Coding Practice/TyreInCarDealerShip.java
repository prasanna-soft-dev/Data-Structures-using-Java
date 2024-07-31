/*
 * Problem Statement –
A function is there which tells how many dealerships there are and the total number of cars in each dealership.
Your job is to calculate how many tyres would be there in each dealership.

Input
3 

4 2

4 0

1 2

Output
20

16

8

There are total 3 dealerships

dealerships1 contains 4 cars and 2 bikes

dealerships2 contains 4 cars and 0 bikes

dealerships3 contains 1 cars and 2 bikes

Total number of tyres in dealerships1  is (4 x 4) + (2 x 2) = 20

Total number of tyres in dealerships2 is (4 x 4) + (0 x 2) = 16

Total number of tyres in dealerships3 is (1 x 4) + (2 x 2) = 8
 */
import java.util.*;
public class TyreInCarDealerShip{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int dealership_count = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int i =1;i <= dealership_count;i++)
        {
            int dealership_car = sc.nextInt();
            int dealership_bike = sc.nextInt();

            ans.add(dealership_car * 4 + dealership_bike * 2);
        }
        for(int num : ans)
        {
            System.out.println(num);
        }
    }
    
}
