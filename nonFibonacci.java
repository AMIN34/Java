import java.util.Scanner;

public class nonFibonacci {
    public int nonFibbo(int n){
        int prevPrev=1;
        int prev=2;
        int curr=3;
        while(n>0){
            prevPrev=prev;
            prev=curr;
            curr=prevPrev+prev;
            n-=(curr-prev-1);
        }
        n+=(curr-prev-1);
        return (prev+n);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nonFibonacci ob = new nonFibonacci();
        System.out.print(ob.nonFibbo(n));
        sc.close();
    }
}
