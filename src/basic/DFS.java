package basic;

import java.util.LinkedList;

public class DFS {

    public int V;
    public boolean[] visited;
    public LinkedList[] adj;

    public DFS(int V){
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

    public void DFSFunction(int V){
        visited[V] = true;

        System.out.println(V);

        for(int a = 0; a < adj[V].size(); a++){
            if(!visited[(int) adj[V].get(a)]){
                DFSFunction((int) adj[V].get(a));
            }
        }
    }

    //  0
    // 1 2
    //3 4 5

    public static void main(String[] args) {
        DFS dfs = new DFS(6);
        dfs.connect(0,1);
        dfs.connect(0,2);
        dfs.connect(1,3);
        dfs.connect(1,4);
        dfs.connect(2,4);
        dfs.connect(2,5);

        dfs.DFSFunction(0);
    }
}
