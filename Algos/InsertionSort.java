package Algos;
import java.util.Scanner;
public class InsertionSort {
    void PrintArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    void insertionsort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;++i){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && k<arr[j]){
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j+1]=k;
            PrintArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSort ob =new InsertionSort();
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.print("Sorting: \n");
        ob.insertionsort(arr);
        System.out.print("Sorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
