package Algos;

import java.util.Scanner;

public class FractionalKnapsack {
    void PrintArray(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void swap1(double arr[],int i, int j){
        double temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void sort(int weight[], int value[], double[] ratio,int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n-1;++j){
                if(ratio[j]<ratio[j+1]){
                    swap(weight, j, j+1);
                    swap(value, j, j+1);
                    swap1(ratio, j, j+1);
                }
            }
        }
    }

    void knapsack(int[] weights, int[] value, int cpt){
        int n=weights.length;
        double res=0.0;
        for(int i =0; i<n; i++){
            if(weights[i]<=cpt){
                res+=value[i];
                System.out.print("\nWeight taken: "+ weights[i]);
                System.out.print("\nIntermediate Profit "+(i+1)+": "+res);
                cpt-=weights[i];
                System.out.print("\nRemaining capacity: "+cpt);
                System.out.println();
            }else{
                res+=(double)value[i]*((double)cpt/(double)weights[i]);
                System.out.print("\nWeight taken: "+ cpt);
                System.out.print("\nIntermediate Profit "+(i+1)+": "+res);
                System.out.print("\nRemaining capacity: 0");
                System.out.println();
            }
        }
        System.out.print("\nFinal Profit: "+ res);
    }
    public static void main(String[] args) {
        FractionalKnapsack ob = new FractionalKnapsack();
        int ne=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of items: ");
        int n = sc.nextInt();
        int weights[] = new int[n];
        int value[] = new int[n];
        double ratio[] = new double[n];
        System.out.print("\nEnter Value and Weight of the items\n");
        for(int i=0;i<n;++i){
            System.out.print(ne++ +") ");
            value[i] = sc.nextInt();
            weights[i] = sc.nextInt();
            ratio[i] = (double)value[i]/(double)weights[i];
        }
        ob.sort(weights, value, ratio, n);
        System.out.print("Enter Capacity: ");
        int cpt=sc.nextInt();
        ob.knapsack(weights, value, cpt);
        sc.close();
    }    
}
