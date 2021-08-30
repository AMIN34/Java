package Algos;

import java.util.Scanner;
public class QuickSort {
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

    int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j = low; j <= high-1; ++j){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
                PrintArray(arr);
            }
        }
        swap(arr, i+1, high);
        PrintArray(arr);
        return (i+1);
    }
    void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi= partition(arr, low, high);
            quicksort(arr, low,pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickSort ob = new QuickSort();
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
        ob.quicksort(arr, 0, n-1);
        System.out.print("\nSorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
