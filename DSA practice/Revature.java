//find the first word with length 4 in String
import java.util.*;
public class Revature {
    public static void main(String args[])
    {
        String str="this is a String";

        String[] words=str.split(" ");
        String result=new String();
        for(String word:words)
        {
            if(word.length()==4)
            {
                result=word;
                System.out.println(result);
                return;
            }
        }
    }
    
}
