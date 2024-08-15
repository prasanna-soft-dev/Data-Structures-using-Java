/*13.Print the word with odd letters – PROGRAM */
public class xPattern{
    public static void main(String[] args) {
        String str = "program";

        for(int i = 0;i < str.length();i++)
        {
            for(int j = 0;j < str.length();j++)
            {
                if(i == j || i + j == str.length() - 1)
                {
                    System.out.print(str.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }  
}
