package Algos;
import java.util.Scanner;
public class LinearSearch {
    void PrintArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    int linearsearch(int arr[],int f){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==f){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch ob = new LinearSearch();
        System.out.print("How many elements in the array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.print("Enter item to be searched: ");
        int f = sc.nextInt();
        f = ob.linearsearch(arr, f);
        if(f!=-1){
            System.out.print("Item is in "+ (f+1)+"th position");
        }else{
            System.out.print("Item not found...");
        }
        sc.close();

    }
}
