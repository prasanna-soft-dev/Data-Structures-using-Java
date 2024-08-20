/*Print pattern like this

Example:
Input: 1
Output: 0

Input: 2
Output: 
0 0
0 1
1 0
1 1

Input: 3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1 */
public class BinarySequence{
    public static void main(String[] args) {
        int n = 4;
        int totalNumbers = (1 << n);

        
        for(int i = 0;i < totalNumbers;i++){
            int num = i;
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < n;j++){
                sb.append(num % 2);
                num /= 2;
            }
            sb.reverse();
            while(sb.length() < n){
                sb.insert(0, 0);
            }
            System.out.println(sb.toString());
        }
    }
}
