import java.util.Scanner;
public class program2 {
    public static int add(int a, int b){
        return (a+b);
    }

    public static int multiplication(int a, int b){
        return(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* String str= "My name is AMINUR RASHID";
        System.out.println(str); */   
        
        /* int arr[]= {1,2,3,4,5};
        System.out.println(arr[2]); */
        //int arr[]= new int[5];
        
        /* arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt(); */

        /* for(int i=0;i<5;++i){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;++i){
            System.out.println(arr[i]);
        } */
        
        /* int i=0;
        while(i<5){
            arr[i]=sc.nextInt();
            ++i;
        }
        for(i=0;i<5;++i){
            System.out.println(arr[i]);
        }
        sc.close(); */
        
        /* int i=0;
        do{
            //Statements
        }while(i<5); */
        
        //Pattern 1
        /* for(int i=0;i<5;++i){
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        } */

        int a= sc.nextInt();
        int b=sc.nextInt();
        //System.out.println(add(a, b));
        System.out.println(multiplication(a, b));
        sc.close();
    }
}
