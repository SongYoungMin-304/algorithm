package basic;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public int V;
    public boolean[] visited;
    public LinkedList[] adj;

    public BFS(int V){
        this.V = V;
        visited = new boolean[V];
        adj = new LinkedList[V];

        for(int a = 0; a < adj.length; a++){
            adj[a] = new LinkedList();
        }
    }

    public void connect(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }

    public void BFSFunction(int v){

        Queue queue = new LinkedList();

        queue.add(v);
        visited[v] = true;

        while(queue.size()!=0){
            int k = (int) queue.poll();

            System.out.println(k);

            for(int a = 0; a < adj[k].size(); a++){
                if(visited[(int) adj[k].get(a)]!=true){
                    visited[(int) adj[k].get(a)]=true;
                    queue.add(adj[k].get(a));
                }
            }
        }

    }

    //  0
    // 1 2
    //3 4 5

    public static void main(String[] args) {
        System.out.println("송영민");
        BFS bfs = new BFS(7);
        bfs.connect(0,1);
        bfs.connect(0,2);
        bfs.connect(1,3);
        bfs.connect(1,4);
        bfs.connect(2,4);
        bfs.connect(2,5);
        bfs.BFSFunction(0);
    }
}
