//32. a) Write a program to determine sum of the following series for given value of n: 1 - 1/22 + 1/32
//- ..... +1/n2

import java.util.Scanner;

public class SumSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given series: 1 - 1/2^2 + 1/3^2 - ... + 1/n^2");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Value of the series becomes: ");
        double oddS=0,evenS=0;
        for(double i=1;i<=n;i++){
            if(i%2==0){
                evenS += 1/Math.pow(i, 2);
            }else{
                oddS += 1/Math.pow(i, 2);
            }
        }
        System.out.print((oddS-evenS));
        sc.close();
    }
}