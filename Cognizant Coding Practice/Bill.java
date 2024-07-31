/*Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. 
Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290 */
import java.util.*;
public class Bill{
    public static void GenrateBill(int pizza, int puffs, int drinks)
    {
        int p_pizza = 100;
        int p_puffs = 20;
        int p_drinks = 10;

        int total = 0;

        total = (pizza * p_pizza) + (puffs * p_puffs) + (drinks * p_drinks);

        System.out.println("Bill Details");

        System.out.println(" No of pizzas:"+pizza);
        System.out.println(" No of puffs:"+puffs);
        System.out.println(" No of cooldrinks:"+drinks);
        System.out.println(" Total price="+total);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no of Pizzaz bought: ");
        int pizza = sc.nextInt();

        System.out.print("Enter the no of Puffs bought: ");
        int puffs = sc.nextInt();

        System.out.print("Enter the no of cool drinks bought: ");
        int drinks = sc.nextInt();


        GenrateBill(pizza, puffs, drinks);
    }
}
