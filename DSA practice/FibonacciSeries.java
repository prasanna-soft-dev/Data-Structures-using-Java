import java.util.*;
public class FibonacciSeries {
    public static int Fib_number(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return Fib_number(n-2)+Fib_number(n-1);
        }
    }
    public static void main(String argd[])
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.print(Fib_number(i)+" ");
        }
    }
    
}
