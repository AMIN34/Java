package Algos;
import java.util.Scanner;
public class ToweofHanoi {
    void ToH(int n, char front, char aux, char end, int x){
        if(n==1){
            System.out.println("Move disk 1 from rod "+front+" to rod "+end);
            return;
        }
        x++;
        ToH(n-1, front, end, aux, x);
        System.out.println("Move disk "+n+" from rod "+front+" to rod "+end);
        ToH(n-1, aux, end, front, x);
    }
    public static void main(String[] args) {
        System.out.println("A is Source, B is auxilary and C is Destination\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of disks: ");
        int n = sc.nextInt();
        System.out.println();
        int x=0;
        ToweofHanoi ob = new ToweofHanoi();
        ob.ToH(n, 'A', 'B', 'C', x);
        sc.close();
    }
    
}
