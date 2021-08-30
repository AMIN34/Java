import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // int a;
        // a=5;
        // System.out.println(a);

        // double d;
        // d=5;
        // System.out.println(d);

        // char c;
        // c='a';
        // System.out.println(c);

        // float a=-5,b=8,c;
        // c=a-b;
        // System.out.println("The Value of c, a and b are "+c+" "+(a+b)+" "+ a+" "+ b);

        Scanner sc = new Scanner (System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("The summation is "+(a+b));
        sc.close();
    }
}
