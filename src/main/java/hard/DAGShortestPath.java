package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DAGShortestPath {

    private static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static void shortestPathDAG(List<Edge>[] graph, int source, int destination) {
        int vertices = graph.length;

        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);

        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);

        distances[source] = 0;

        topologicalSort(graph, source, new boolean[vertices], new Stack<>());

        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (distances[u] == Integer.MAX_VALUE) {
                continue;
            }

            for (Edge edge : graph[u]) {
                int v = edge.destination;
                int weight = edge.weight;

                if (distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    parent[v] = u;
                }
            }
        }

        if (distances[destination] == Integer.MAX_VALUE) {
            System.out.println("No path found from source to destination.");
        } else {
            List<Integer> path = new ArrayList<>();
            int current = destination;
            while (current != -1) {
                path.add(0, current);
                current = parent[current];
            }
            System.out.println("Shortest path from source to destination:");
            for (int node : path) {
                System.out.print(node + " ");
            }
        }
    }

    private static Stack<Integer> stack = new Stack<>();

    private static void topologicalSort(List<Edge>[] graph, int vertex, boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;

        for (Edge edge : graph[vertex]) {
            if (!visited[edge.destination]) {
                topologicalSort(graph, edge.destination, visited, stack);
            }
        }

        stack.push(vertex);
    }

    public static void main(String[] args) {
        int vertices = 6;
        List<Edge>[] graph = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 4, 1));
        graph[1].add(new Edge(1, 2, 3));
        graph[2].add(new Edge(2, 3, 6));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 4));
        graph[5].add(new Edge(5, 3, 1));

        int source = 0;
        int destination = 3;

        shortestPathDAG(graph, source, destination);
    }
}
