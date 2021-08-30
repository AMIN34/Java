package CodeforcesCP;

import java.util.Scanner;
// Couldn't complete


public class AquaMoon_1545A {
    void PrintArray(int arr[]){
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
    }
    boolean result(boolean state[]){
        for(boolean states: state){
            if(!states){
                return false;
            }
        }
        return true;
    }
    void Solution(int arr[], boolean state[]){
        int n = arr.length;
        for(boolean s: state){
            System.out.print(s+ " ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    state[j]=!state[j];
                    state[j+1]=!state[j+1];
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    PrintArray(arr);
                    for(boolean s: state){
                        System.out.print(s+ " ");
                    }
                    System.out.println();
                }
            }
        }
        // PrintArray(arr);
        for(boolean s: state){
            System.out.print(s+ " ");
        }
        System.out.println();
        if(result(state)){
            System.out.print("YES\n");
        }
        else{
            System.out.print("NO\n");
        }
    }
    public static void main(String[] args) {
        AquaMoon_1545A ob = new AquaMoon_1545A();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            boolean state[] = new boolean[n];
            for(int i =0;i<n;++i){
                state[i]=true;
            }
            int arr[] = new int[n];
            for(int i =0;i<n;++i){
                arr[i]=sc.nextInt();
            }
            ob.Solution(arr, state);
            t--;
        }
        sc.close();
    }
}
