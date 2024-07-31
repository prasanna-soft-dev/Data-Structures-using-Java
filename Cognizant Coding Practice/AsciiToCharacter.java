/*
 *Question-3
Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:

Enter the digits:
65
66
67
68
Sample Output 1:

65-A
66-B
67-C
68-D

Sample Input 2:

Enter the digits:
115
116
101
112
Sample Output 2:

115-s
116-t
101-e
112-p
 */
import java.util.Scanner;
public class AsciiToCharacter
{
public static void main (String args[])
{
Scanner in = new Scanner (System.in);
System.out.println ("Enter the digits: ");

int a = in.nextInt ();
int b = in.nextInt ();
int c = in.nextInt ();
int d = in.nextInt ();

char q = (char) a;
char w = (char) b;
char e = (char) c;
char r = (char) d;

System.out.println ();
System.out.print (a);
System.out.println ("-" + q);

System.out.print (b);
System.out.println ("-" + w);

System.out.print (c);
System.out.println ("-" + e);

System.out.print (d);
System.out.println ("-" + r);
}
}
