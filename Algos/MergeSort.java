package Algos;
import java.util.Scanner;
public class MergeSort {
    void PrintArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    void merge(int arr[],int lb, int mid,int ub){
        int i=lb;
        int k=lb;
        int j=mid+1;
        int b[] = new int[50];
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;
                k++;
            }
            else{
                b[k]=arr[j];
                k++;
                j++;
            }
        }
        if(i>mid){
            while(j<=ub){
                b[k]=arr[j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr[i];
                k++;
                i++;
            }
        }
        for(k=lb;k<=ub;k++){
            arr[k]=b[k];
        }
        PrintArray(arr);
    }
    void mergesort(int arr[],int lb,int ub){
        if(lb<ub){
            int mid =(lb+ub)/2;
            mergesort(arr,lb,mid); 
            mergesort(arr,mid+1,ub); 
            merge(arr,lb,mid,ub);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSort ob =new MergeSort();
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
        ob.mergesort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        ob.PrintArray(arr);
        sc.close();
    }
}
