package Algos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FloydWarshell {
    void PrintGraph(int dist[][],int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(dist[i][j]==9999){
                    System.out.print("INF\t");
                }else{
                    System.out.print(dist[i][j]+"       ");
                }
            }
            System.out.println();
        }
    }
    void floydwarshell(int n, int graph[][]){
        int dist[][] = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                dist[i][j]=graph[i][j];
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }
        for(int i=0;i<n;++i){
            if(dist[i][i]<0){
                System.out.print("Negative edge cycle detected!!!");
                System.exit(1);
            }
        }
        System.out.println("Shortest length matrix: ");
        PrintGraph(dist, n);
    }
    public static void main(String[] args) throws FileNotFoundException {
        FloydWarshell ob = new FloydWarshell();
        File fp = new File("algos/floyd.txt");
        Scanner sc = new Scanner(fp);
        int n = Integer.parseInt(sc.nextLine());
        int graph[][]=new int[n][n];
        while(sc.hasNextLine()){
            for(int i=0;i<n;++i){
                String[] line = sc.nextLine().trim().split(" ");
                for(int j=0;j<n;++j){
                    graph[i][j]=Integer.parseInt(line[j]);
                }
            }
        }
        
        System.out.println("Given Adjacent Matrix: ");
        ob.PrintGraph(graph,n);
        System.out.println();
        ob.floydwarshell(n, graph);

        sc.close();
    }
}
