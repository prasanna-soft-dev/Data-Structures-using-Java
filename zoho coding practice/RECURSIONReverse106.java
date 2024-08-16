/*106) Given a string, change the order of words in the string (last string should come first).
Should use RECURSION

Sample:   one two three 
Output :  three two one 
 */
public class RECURSIONReverse106{
    public static String recursion(String[] str ,int n,StringBuilder ans){
        if(n == 0){
            ans.append(str[n]);
            return ans.toString();
        }
        ans.append(str[n]);
        ans.append(" ");
        return recursion(str,n-1,ans);
    }
    public static void main(String args[]){
        String s = "one two three";
        String str[] = s.split(" ");
        StringBuilder ans  = new StringBuilder();
        String result = recursion(str,str.length - 1,ans);

        System.out.println(result);
    }
}