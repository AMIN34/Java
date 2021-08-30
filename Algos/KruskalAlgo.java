package Algos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KruskalAlgo {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }

    int find(int[] parent,int i){
        while(parent[i]!=i){
            i=parent[i];
        }
        return i;
    }

    void union(int[] parent, int i, int j){
        int m=find(parent,i);
        int n=find(parent,j);
        parent[m]=n;
    }

    void kruskalMST(int graph[][],int[] parent,int n){
        int mincost=0;
        for(int i=0;i<n;++i){
            parent[i]=i;
        }
        int v=0;
        while(v<n-1){
            int min=Integer.MAX_VALUE;
            int a=0,b=0;
            for(int i=0;i<n;++i){
                for(int j=0;j<n;++j){
                    if(find(parent, i)!= find(parent, j) && graph[i][j]<min){
                        a=i;
                        b=j;
                        min=graph[i][j];
                    }
                }
            }
            v++;
            union(parent, a, b);
            mincost+=min;
        }
        System.out.print("Minimum Weight of the graph: "+mincost);
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        KruskalAlgo ob = new KruskalAlgo();
        File fp = new File("algos/Kruskal.txt");
        Scanner sc= new Scanner(fp);
        int n = Integer.parseInt(sc.nextLine());
        int graph[][]=new int[n][n];
        int parent[] = new int[n];
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
        ob.kruskalMST(graph, parent, n);

        sc.close();
    }
}
