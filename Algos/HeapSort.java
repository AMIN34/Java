package Algos;
import java.util.Scanner;
public class HeapSort {
    void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void PrintArray(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    void heapify(int arr[],int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            swap(arr, i, largest);;
            heapify(arr, n, largest);
        }
    }
    void heapsort(int arr[]){
        int n = arr.length;
        for(int i=(n/2)-1;i>=0;--i){
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
            PrintArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeapSort ob = new HeapSort();
        System.out.print("How many elements on array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.println("Sorting: ");
        ob.heapsort(arr);
        System.out.print("\nSorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
