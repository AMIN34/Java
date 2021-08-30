import java.util.Scanner;
public class scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current college year: -");
        int y = sc.nextInt();
        switch(y){
            case 3:
            case 4: 
                System.out.println("Enter Marks:- ");
                float m =sc.nextFloat();
                if(m>50){
                    System.out.println("Eligible");
                }else{ 
                    System.out.println("Not Eligible");
                }
            break;
            default: System.out.println("Not Eligible");
        }
        sc.close();
    }
}
