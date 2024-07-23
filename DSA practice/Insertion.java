import java.util.*;
class Insertion {
     void Sort(int arr[], int n)
    {
        int i;
        for(i=1;i<n-1;++i)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
        Insertion is=new Insertion();
        is.Sort(arr,n);
        PrintArray(arr,n);
    }
}