package Algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JobSequencing {
    public static class Job {
        String id;
        int deadline;
        int profit;

        Job(String id, int deadline, int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }

    void JobScheduiling(ArrayList<Job> arr, int n){
        Collections.sort(arr,(a,b)-> b.profit - a.profit);
        boolean freetimeslot[] = new boolean[n];
        String job[] =new String[n];
        for(int i=0;i<n;++i){
            for(int j = Math.min(n-1, arr.get(i).deadline -1); j>=0;--j ){
                if(freetimeslot[j]==false){
                    freetimeslot[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(String j : job){
            System.out.print("--> "+j);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Job> arr = new ArrayList<Job>();
        int dmax=Integer.MIN_VALUE;
        System.out.print("Enter no. of job: ");
        int n = sc.nextInt();
        while(n!=0){
            System.out.print("\nEnter id: ");
            String id= sc.next();
            System.out.print("\nEnter deadline: ");
            int deadline = sc.nextInt();
            System.out.print("\nEnter Profit: ");
            int profit = sc.nextInt();
            arr.add(new Job(id, deadline, profit));
            if(deadline>dmax){
                dmax=deadline;
            }
            n--;
        }
        System.out.print("\nJob Sequence: ");
        JobSequencing ob = new JobSequencing();
        ob.JobScheduiling(arr, dmax);
        sc.close();
    }
    
}
