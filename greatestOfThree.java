import java.util.Scanner;
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no.s:- ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        if (a > b && a > c){
            System.out.println(a+" is the greatest");
        }else if(b>a && b>c){
            System.out.println(b+" is the greatest");
        }else{
            System.out.println(c+" is the greatest");
        }
        sc.close();
    }
}
