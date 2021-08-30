import java.util.Scanner;
public class PosORNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:- ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Its neither negative nor positive");
        }else if(n>0){
            System.out.println("Its positive");
        }else{
            System.out.println("Its negative");
        }
        sc.close();
    }
}
