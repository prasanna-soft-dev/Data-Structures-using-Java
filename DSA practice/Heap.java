public class Heap {
    public void sort(int arr[])
    {
        int N=arr.length;
        for(int i=N/2-1;i>=0;i--)
        Heapify(arr, N, i);

        for(int i=N-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            Heapify(arr,i,0);
        }

    }
    static void Heapify(int arr[],int N,int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<N && arr[l]>arr[largest])
        largest=l;

        if(r<N && arr[r]>arr[largest])
        largest=r;

        if(largest!=i)
        {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            Heapify(arr,N,largest);
        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String argd[])
    {
        int arr[]={5, 10, 3, 7, 4, 8};
        Heap hp=new Heap();
        hp.sort(arr);
        printArray(arr);

    }
}
