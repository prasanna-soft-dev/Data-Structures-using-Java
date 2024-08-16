/*9. Reverse the words in the given String1 from the first occurrence of String2 in String1 
by maintaining white Spaces. */
public class ReverseWords9{
    public static void main(String[] args) {
        String s1 = "this is a test string only";
        String s2 = "test";

        int index = s1.indexOf(s2);

        String sub1 = s1.substring(0,index);
        String sub2 = s1.substring(index);

        String str[] = sub2.split(" ");
        
        int left = 0;
        int right = str.length - 1;
        while(left  < right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for(String word : str){
            sb.append(word);
            sb.append(" ");
        }
        sub2 = sb.toString().trim();

        s1 = sub1 + sub2;

        System.out.println(s1);

    }
}
