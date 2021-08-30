package Algos;

import java.util.Scanner;

public class Knapsack {
    void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void sort(int weight[], int value[], int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n-1;++j){
                if(weight[j]<weight[j+1]){
                    swap(weight, j, j+1);
                    swap(value, j, j+1);
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
            }
        }
        System.out.print("\nFinal Profit: "+ res);
    }
    public static void main(String[] args) {
        Knapsack ob = new Knapsack();
        int ne=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of items: ");
        int n = sc.nextInt();
        int weights[] = new int[n];
        int value[] = new int[n];
        
        System.out.print("\nEnter Value and Weight of the items\n");
        for(int i=0;i<n;++i){
            System.out.print(ne++ +") ");
            value[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        ob.sort(weights, value, n);
        System.out.print("Enter Capacity: ");
        int cpt=sc.nextInt();
        ob.knapsack(weights, value, cpt);
        sc.close();
    }    
}
