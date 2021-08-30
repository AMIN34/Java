import java.util.ArrayList;
import java.util.Scanner;

public class tankempty {
    ArrayList<Integer> duration(int[] tanks, int[] rates){
        ArrayList<Integer> small = new ArrayList<>();
        int n= tanks.length;
        int[] dura = new int[n];
        for(int i=0;i<n;++i){
            dura[i]=tanks[i]/rates[i];
        }
        int currentValue = dura[0]; 
		for (int j=1; j < n; j++) {
			if (dura[j] <=currentValue) 
				currentValue = dura[j];
		}
        for (int j=0; j < n; j++) {
			if (dura[j] ==currentValue) 
				small.add(j);
		}
        return small;
    }
    public static void main(String[] args) {
        tankempty ob = new tankempty();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] tanks= new int[n];
        int[] rates = new int[n];
        for(int i=0;i<n;++i){
            tanks[i]=sc.nextInt();
        }
        for(int i=0;i<n;++i){
            rates[i]=sc.nextInt();
        }
        // System.out.print(ob.duration(tanks, rates));
        ArrayList<Integer> arr = new ArrayList<>();
        arr=ob.duration(tanks, rates);
        for(int nums : arr){
            System.out.print(nums + " ");
        }

        sc.close();
    }
}
