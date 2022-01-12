//32.b) Write a java program to find out the smallest word in a given string as input, hence convert smallest
//word in uppercase (without using toUpperCase() method) and display the entire string.
//[For example Hello Java Lab changed to Hello Java LAB].

import java.util.Scanner;
class ClassA {
    public char toUpper(char ch){
        int intCh=0;
        if(ch>96 && ch<123)
{
            intCh=ch-32;
            return (char) intCh;
}
return ch;
    }
     public String smallestWord(String str){
         String returnStr="";
        int smallestLength=Integer.MAX_VALUE;
        int minIndex=0;
        String[] array=str.split(" ");
        for(int i=0;i<array.length;i++)
       {
           if(array[i].length()<smallestLength){
                minIndex=i;
           }
       }

       for(int i=0;i<array.length;i++){
           if(i!=minIndex){
               returnStr=returnStr+array[i]+" ";
           }
           else{
               for(int j=0;j<array[minIndex].length();j++)
               returnStr=returnStr+toUpper(array[minIndex].charAt(j));
           }
       }
       return returnStr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ClassA c=new ClassA();
        System.out.println(c.smallestWord(str));
        sc.close();
    }
}