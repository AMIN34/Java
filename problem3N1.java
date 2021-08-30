// Problem 3n+1
import java.util.Scanner;
public class problem3N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter initial positive no.: ");
        int n = sc.nextInt();
        while(n!=1){
            if(n<0){
                System.out.print("Not a positive number.");
                System.exit(1);
            }
            System.out.print(n+" ");
            if (n%2!=0){
                n=3*n+1;
            }else{
                n/=2;
            }
            if(n==1){
                System.out.print(n+" ");
            }
            count++;
        }
        System.out.print("\nNo. of terms: "+count);
        sc.close();
    }
}
