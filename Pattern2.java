import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows:- ");
        int n =sc.nextInt();
        for(int i=1; i<=n; ++i){
            for(int j=1;j<=2*n -1; ++j){
                if(j<=i || j>=2*n -i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
