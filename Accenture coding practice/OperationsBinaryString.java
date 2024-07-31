/*Problem Description :
The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. 
You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:
– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:
No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1
Output:
1 */
import java.util.*;
public class OperationsBinaryString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=s.charAt(0) - '0';
        for(int i=1;i<s.length();i+=2)
        {
            char c=s.charAt(i);
            int next = s.charAt(i+1)-'0';
            if(c == 'A')
            {
                sum=sum & next;
            }
            else if(c == 'B')
            {
                sum = sum | next;
            }
            else
            {
                sum = sum ^ next;
            }
        }
        System.out.println(sum);
    }
}
