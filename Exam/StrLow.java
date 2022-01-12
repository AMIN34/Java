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
       for(int i=0;i<array[minIndex].length();i++){
            returnStr=returnStr+toUpper(array[minIndex].charAt(i));
       }
       return returnStr;
    }
    public static void main(String [] args){
        ClassA c=new ClassA();
        System.out.println(c.smallestWord("sayantan guha Java lab"));
    }
}