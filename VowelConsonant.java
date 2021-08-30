import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charecter:- ");
        char a= sc.next().charAt(0);
        boolean x=false;
        switch(a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': x=true;
        }
        if(x){
            System.out.println("Its a vowel");
        }else{
            if((a>='A' && a<='Z')||(a>='a' && a<='z')){
                System.out.println("Its a consonant");
            }else{
                System.out.println("Please enter an alphabet charecter");
            }
        }
        sc.close();
    }
    
}
