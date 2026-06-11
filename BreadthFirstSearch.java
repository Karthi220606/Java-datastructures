package practice;

import java.util.*;
import java.util.LinkedList;

class GraphBFS {
    ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

    GraphBFS(int v) {
        for (int i = 0; i < v; i++) {
            adjlist.add(new ArrayList<>());
        }
    }

    void insert(int u, int v) {
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }

    void bfs(int v) {
        System.out.print("BFS: ");
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adjlist.size()];

        visited[v] = true;
        q.add(v);

        while (!q.isEmpty()) {
            int vertex = q.remove();
            System.out.print(vertex + " -> ");

            for (int i = 0; i < adjlist.get(vertex).size(); i++) {
                int av = adjlist.get(vertex).get(i);
                if (!visited[av]) {
                    visited[av] = true;
                    q.add(av);
                }
            }
        }
    }
}

public class BreadthFirstSearch {
    public static void main(String args[]) {
        GraphBFS graph = new GraphBFS(5);

        graph.insert(0, 1);
        graph.insert(0, 4);
        graph.insert(0, 3);
        graph.insert(1, 2);
        graph.insert(1, 4);
        graph.insert(2, 3);
        graph.insert(2, 4);
        graph.insert(3, 4);

        graph.bfs(1);
    }
}
