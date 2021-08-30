import java.util.Scanner;
public class electiveCourse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year and Branch:- ");
        int y = sc.nextInt();
        String x = sc.next();
        switch(y){
            case 1: System.out.println("Elective Courses: Advance english, Algebra");
            break;
            case 2: 
                switch(x){
                    case "CSE":
                    case "CCE": System.out.println("Elective Courses:  Machine Learning, Big Data");
                    break;
                    case "ECE": System.out.println("Elective Courses:  Antenna Engineering");
                    break;
                    default: System.out.println("Elective Courses:  Optimization");
                }
            break;
            default:System.out.println("Elective Courses:  Optimization");
        }
        sc.close();
    }
}
