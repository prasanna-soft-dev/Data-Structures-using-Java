import java.util.*;
class Selection {
     void Sort(int arr[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_indx=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min_indx])
                    min_indx=j;


                int temp=arr[min_indx];
                arr[min_indx]=arr[i];
                arr[i]=temp;
        }

    }
    static void PrintArray(int arr[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=console.nextInt();
        }
        Selection is=new Selection();
        is.Sort(arr,n);
        PrintArray(arr,n);
    }
}