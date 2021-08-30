package Algos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DjikstraAlgo {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }

    int mindist(int dist[],boolean visited[]){
        int mindst=Integer.MAX_VALUE;
        int mindstver=-1;
        for(int i=0;i<dist.length;++i){
            if(!visited[i] && dist[i]<mindst){
                mindst=dist[i];
                mindstver=i;
            }
        }
        return mindstver;
    }

    void djikstra(int graph[][],int source,int des){
        int n=graph.length;
        boolean visited[] = new boolean[n];
        int dist[]=new int[n];
        for(int i=0;i<n;++i){
            visited[i]=false;
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;
        for(int i=0;i<n;++i){
            int u=mindist(dist, visited);
            visited[u]=true;
            for(int v=0;v<n;v++){
                if(!visited[v] && graph[u][v]!=0 && (dist[u]+graph[u][v]<dist[v])){
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        System.out.println("Distance from "+source+" to "+des+" is "+dist[des]);
    }

    public static void main(String[] args) throws FileNotFoundException{
        DjikstraAlgo ob= new DjikstraAlgo();
        File fp = new File("algos/Djikstra.txt");
        Scanner sc =new Scanner(fp);
        Scanner s= new Scanner(System.in);
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
        System.out.println();
        System.out.print("Enter Source: ");
        int source=s.nextInt();
        System.out.print("Enter Destination: ");
        int des = s.nextInt();
        ob.djikstra(graph, source, des);
        s.close();
        sc.close();
    }
}
