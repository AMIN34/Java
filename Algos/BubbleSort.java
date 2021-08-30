package Algos;

import java.util.Scanner;

public class BubbleSort {
    void PrintArray(int arr[]){
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
    }

    void Bubblesort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;++i){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    PrintArray(arr);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort ob= new BubbleSort();
        System.out.print("Enter No. of elements: ");
        int n= sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.println("Sorting: ");
        ob.Bubblesort(arr);
        System.out.println("Sorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
