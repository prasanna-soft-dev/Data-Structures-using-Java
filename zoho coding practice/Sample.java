//find the majarity element
public class Sample{
    //moore voting algorithm
    public static void mva(int arr[]){
        int candidate = arr[0];
        int count = 1;
        for(int num : arr){
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                candidate = num;
                count = 1;
            }
        }
        System.out.println(candidate);
    }
    public static void main(String[] args) {
        int arr[] = {5,1,1,1,2};
        int ans = 0;
        for(int num : arr){
            ans ^= num;
        }
        System.out.println(ans);
        mva(arr);
    }
    
}
