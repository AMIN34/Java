package Algos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class BFS {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void bfs(int graph[][],int source,int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(source);
        visited[source]=true;
        int vertex;
        while(!q.isEmpty()){
            vertex = q.get(0);
            System.out.print(vertex+" ");
            q.remove(q.get(0));
            for(int i=0;i<n;++i){
                if(graph[vertex][i]!=0 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        BFS ob = new BFS();
        File fp = new File("algos/bfs.txt");
        Scanner sc = new Scanner(fp);
        Scanner s = new Scanner(System.in);
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
        System.out.print("Enter starting vertex: ");
        int source = s.nextInt();
        System.out.print("BFS traversal: ");
        ob.bfs(graph, source,n);
        sc.close();
        s.close();
    }
}
