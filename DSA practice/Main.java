import java.util.*;
class Main {
    static void BubbleSort(int arr[], int n)
    {
        int i,j,temp;
        boolean Swapped;
        for(i=0;i<n-1;i++)
        {
            Swapped=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Swapped=true;
                }
            }
            if(Swapped==false)
            break;
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
        BubbleSort(arr,n);
        PrintArray(arr,n);
    }
}
