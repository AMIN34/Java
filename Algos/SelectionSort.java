package Algos;

import java.util.Scanner;
public class SelectionSort {
    void PrintArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
    void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1;++i){
            int min=i;
            for(int j=i+1;j<n;++j){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            PrintArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob= new SelectionSort();
        System.out.print("Enter No. of elements: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.println("Sorting: ");
        ob.selectionsort(arr);
        System.out.println("Sorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
