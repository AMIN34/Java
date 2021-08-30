import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter month number from 1 to 12 (1 = Jan, and 12 = Dec):- ");
        int m = sc.nextInt();
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("No. of days is 31");
            break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("No. of days is 30");
            break;
            case 2: System.out.println("No. of days is 28");
            break;
            default: System.out.println("Please enter a number between 1 and 12");
        }
        sc.close();
    }
}
