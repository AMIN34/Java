import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int a=1;
        
        // 0=sandwich 1=maggie 2=pasta 3=upma
        
        // IF-ELSE :- 

        /* if(a==0){
            System.out.println("Sandwich");
        }else if(a==1){
            System.out.println("Maggie");
        }else if(a==2){
            System.out.println("Pasta");
        }else{
            System.out.println("Dosa");
        } */
        /* if(a==0){
            System.out.println("Inside if");
            System.out.println("Condition satisfied");
        }else{
            System.out.println("Inside else");
            System.out.println("Condition not satisfied");
        } */
        
        // SWITCH CASE :- 

        /* switch(a){
            case 0:
                System.out.println("Sandwich");
            break;
            case 1:
                System.out.println("Maggie");
            break;
            case 2:
                System.out.println("Pasta");
            break;
            case 3:
                System.out.println("Upma");
            break;
            default:
                System.out.println("Dosa");
            break;
        } */

        // AND operator :- 
        /* if (a==0 && b==0){
            System.out.println("Sandwich and Coffee");  
        }else if(a==1 && b==1) {
            ....
        } */

        // Nested IF-ELSE:-
        /* if(a==0){
            if(b==0){
                System.out.println("Sandwich and Coffee");
            }else if(b==1){
                System.out.println("Sandwich and Tea");
            }
        }else if(a==1){
            if(b==0){
                System.out.println("Maggie and Coffee");
            }else if(b==1){
                System.out.println("Maggie and Tea");
            }
        } */

        // OR operator
        /* if(a==4 || b==2 ){
            System.out.println("Perfect Day");
        }else if(a=0 || b==1){
            System.out.println("Not Perfect Day");
        } */

        //++ and --
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        sc.close();
    }
    
}
