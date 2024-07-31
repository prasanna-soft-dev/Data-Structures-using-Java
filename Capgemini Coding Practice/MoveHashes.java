/******************************************************************************

Problem Statement –
You have write a function that accepts, a string which length is “len”, the string has some “#”, 
in it you have to move all the hashes to the front of the 
string and return the whole string back and print it.
char* moveHash(char str[],int n);

example :-
Sample Test Case
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront

*******************************************************************************/
import java.util.*;
public class MoveHashes
{
    public static String moveHash(String s)
    {
        String s1=new String("");
        String s2=new String("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                s2=s2+s.charAt(i);
            }
        }
        return s1.concat(s2);
    }
	public static void main(String[] args) {
		System.out.println(moveHash("Move#Hash#to#Front"));
	}
}