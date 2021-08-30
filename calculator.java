import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression (use space after each operand and operator):- ");
        float a=sc.nextFloat();
        char c= sc.next().charAt(0);
        float b=sc.nextFloat();
        switch(c){
            case '+': System.out.println("Result:- "+(a+b));
            break;
            case '-': System.out.println("Result:- "+(a-b));
            break;
            case '*': System.out.println("Result:- "+(a*b));
            break;
            case '/': System.out.println("Result:- "+(a/b));
            break;
            case '^': System.out.println("Result:- "+(Math.pow(a, b)));
            break;
            default: System.out.println("Please enter operator among [+ , - , * , /, ^]");
        }
        sc.close();
    }
}
