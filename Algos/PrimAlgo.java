package Algos;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrimAlgo {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void printTree(int dist[], int graph[][]){
        int total=0;
        int n= dist.length;
        System.out.println();
        System.out.println("Edge\tWeight");
        for(int i=1;i<n;++i){
            System.out.println(dist[i]+" - "+ i + "\t "+ graph[i][dist[i]]);
            total+=graph[i][dist[i]];
        }
        System.out.print("\nMinimum Weight: "+total);
    }

    int minweight(boolean selected[],int weight[]){
        int min= Integer.MAX_VALUE;
        int min_indx=-1;
        int n=weight.length;
        for(int i=0;i<n;++i){
            if(selected[i]==false && weight[i]<min){
                min=weight[i];
                min_indx=i;
            }
        }
        return min_indx;
    }

    void primMST(int graph[][],int n){
        boolean selected[] = new boolean[n];
        int dist[] = new int[n];
        int weight[]=new int[n];
        for(int i=0;i<n;++i){
            weight[i]=Integer.MAX_VALUE;
            selected[i]=false;
        }
        dist[0]=-1; //root
        weight[0]=0; //first node
        for(int v=0;v<n-1;++v){
            int i=minweight(selected, weight);
            selected[i]=true;
            for(int j=0;j<n;++j){
                if(graph[i][j]!=0 && selected[j]==false && graph[i][j]<weight[j]){
                    dist[j]=i;
                    weight[j]=graph[i][j];
                }
            }
        }
        printTree(dist, graph);
    }

    public static void main(String[] args) throws FileNotFoundException{
        PrimAlgo ob = new PrimAlgo();
        File fp = new File("algos/Prim.txt");
        Scanner sc= new Scanner(fp);
        int n = Integer.parseInt(sc.nextLine());
        int graph[][]=new int[n][n];
        while(sc.hasNextLine()){
            for(int i=0;i<n;++i){
                String[] line= sc.nextLine().trim().split(" ");
                for(int j=0;j<n;++j){
                    graph[i][j]=Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println("Given Adjacent Matrix: ");
        ob.PrintGraph(graph, n);
        ob.primMST(graph, n);
        sc.close();
    }
}
