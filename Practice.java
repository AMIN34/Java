import java.io.File;
// import java.lang.Math;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Practice {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
    public static void main(String[] args) {
        
        /* int x= (int)(Math.random()*6)+1;
        System.out.println("First Dice: "+x);
        int y= (int)(Math.random()*6)+1;
        System.out.println("Second dice: "+y);
        System.out.println("Total value: "+(x+y)); */
        
        
        Scanner sc = new Scanner(System.in);
        
        
        // System.out.print("Enter Name: ");
        // String a = sc.next();
        // System.out.print("\nHello, "+a.toUpperCase()+", nice to meet you!");
        

        /* System.out.print("eggs: ");
        int x = sc.nextInt();
        System.out.print("Your number of eggs is "); */
        /* while(x!=0){
            if(x>144){
                y= x / 144;
                System.out.print(y+" Gross, ");
                x%=144;
            }else if(x>12){
                y=x / 12;
                System.out.print(y+" Dozens and ");
                x%=12;
            }else{
                System.out.print(x);
                break;
            }
        } */
        // System.out.print((x/144)+" Gross, "+((x%144)/12)+" Dozens and "+(((x%144)%12)));
        
        
        File fp = new File("testdata.txt");
        try{
            Scanner s = new Scanner(fp);
            while(s.hasNextLine()){
                String line= s.nextLine();
                System.out.println(line);
                float a = Float.parseFloat(s.nextLine());
                float b = Float.parseFloat(s.nextLine());
                float c = Float.parseFloat(s.nextLine());
                System.out.println("Average Marks: "+ ((a+b+c)/3));
            }
            s.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        sc.close();

        System.out.println(Day.FRIDAY.ordinal());
        for(Day d: Day.values()){
            System.out.print(d+" ");
        }
        
        

    }
}
