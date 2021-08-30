import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of rows:- ");
        int n =sc.nextInt();
        for(int i=1; i<=n; ++i){
            for(int j=1;j<=2*n-1; ++j){
                if(j<=i || j>=2*n -i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int k=0;
        for (int i=1; i<=n;++i,k = 0) {
            for (int j= 1;j<=n-i;++j) {
               System.out.print("  ");
            }
            while (k != 2 * i - 1) {
               System.out.print("* ");
               ++k;
            }
            System.out.println();;
         }
        sc.close();
    }
}
