package Algos;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    void PrintArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    int binarysearch(int arr[],int k,int l,int h){
        int mid=(l+h)/2;
        if(l<=h){
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                return binarysearch(arr, k, l,mid);
            }
            return binarysearch(arr, k, mid+1,h);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array: ");
        ob.PrintArray(arr);
        System.out.print("After Sorting: ");
        Arrays.sort(arr);
        ob.PrintArray(arr);
        System.out.println("Enter key to be searched: ");
        int k=sc.nextInt();
        k=ob.binarysearch(arr, k, 0,n);
        if(k!=-1){
            System.out.print("Item is in "+ (k+1)+"th position as in sorted array");
        }else{
            System.out.print("Item not found...");
        }
        sc.close();
    }
}
