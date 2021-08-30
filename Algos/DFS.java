package Algos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                    System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int unvisited(int v,int n,boolean visited[],int graph[][]){
        for(int j=0;j<n;j++){
            if(graph[v][j]!=0 && !visited[j]){
                return j;
            }
        }
        return -1;
    }

    void dfs(int graph[][],int source,int n){
        boolean visited[]=new boolean[n];
        Stack<Integer> stack = new Stack<>();
        System.out.print(source+" ");
        visited[source]=true;
        stack.push(source);
        while(!stack.empty()){
            int curr = unvisited(stack.peek(),n,visited,graph);
            if(curr==-1){
                stack.pop();
            }else{
                visited[curr]=true;
                System.out.print(curr+" ");
                stack.push(curr);
            }

        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        DFS ob = new DFS();
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
        System.out.print("DFS traversal: ");
        ob.dfs(graph, source,n);
        sc.close();
        s.close();
    }
}
