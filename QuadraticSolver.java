import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a,b and c in ax²+bx+c:- ");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= b*b - 4.0*a*c;
        if(d>0){
            double r1= (-b + Math.pow(d, 0.5)/(2.0*a));
            double r2= (-b - Math.pow(d, 0.5)/(2.0*a));
            System.out.println("The Roots of the equation are "+r1+" and "+r2);
        }else if(d==0){
            double r = -b/(2.0*a);
            System.out.println("The Root of the equation is "+r);
        }else{
            double r1= -b/(2.0*a);
            double i1= (Math.pow(-d, 0.5))/(2.0*a);
            System.out.println("The Roots of the equation are "+r1+"+"+i1+"i and "+r1+"-"+i1+"i");
        }
        sc.close();
    }
}
