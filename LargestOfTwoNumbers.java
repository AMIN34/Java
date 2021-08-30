import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }
        sc.close();
    }
    
}
