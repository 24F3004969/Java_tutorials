package org.java_tutorials.dsa.graph;

// GraphTest.java
import java.util.*;

record Vertex(String data) {

    @Override
    public String toString() {
        return "Vertex(%s)".formatted(data);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vertex(String data1))) return false;
        return Objects.equals(this.data, data1);
    }

}

final class Graph {
    private final String name;
    private final Map<Vertex, List<Vertex>> graphView = new HashMap<>();

    public Graph(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    private void addVertex(Vertex vertex) {
        graphView.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex v1, Vertex v2) {
        addVertex(v1);
        addVertex(v2);
        graphView.get(v1).add(v2); // Directed edge v1 -> v2
    }

    public void addEdges(Vertex v1, List<Vertex> vertices) {
        for (var v : vertices) {
            addEdge(v1, v);
        }
    }

    /**
     * Performs BFS and returns a map of visited flags for all known vertices.
     * Vertices reachable from 'start' will be marked true.
     */
    public Map<Vertex, Boolean> bfs(Vertex start) {
        // Ensure start exists in the graph
        addVertex(start);

        // Initialize all vertices to not visited
        Map<Vertex, Boolean> visited = new LinkedHashMap<>();
        for (var v : graphView.keySet()) {
            visited.put(v, false);
        }

        // BFS
        Queue<Vertex> queue = new ArrayDeque<>();
        Set<Vertex> discovered = new HashSet<>();

        queue.add(start);
        discovered.add(start);

        while (!queue.isEmpty()) {
            var v = queue.poll();
            visited.put(v, true);

            var neighbors = graphView.getOrDefault(v, List.of());
            for (var n : neighbors) {
                if (!discovered.contains(n)) {
                    discovered.add(n);
                    queue.add(n);
                }
            }
        }

        return visited;
    }
}

class GraphTest {
    public static void main(String[] args) {
        // 1. Initialize Vertices
        var v_a = new Vertex("A");
        var v_b = new Vertex("B");
        var v_c = new Vertex("C");
        var v_d = new Vertex("D");
        var v_e = new Vertex("E");
        var v_f = new Vertex("F");
        var v_g = new Vertex("G");

        // 2. Create Graph
        var myGraph = new Graph("Large Network");

        // 3. Add Multiple Edges (Creating a layered structure)
        // Root connections
        myGraph.addEdge(v_a, v_b);
        myGraph.addEdge(v_a, v_c);

        // Mid-layer connections
        myGraph.addEdge(v_b, v_d);
        myGraph.addEdge(v_b, v_e);
        myGraph.addEdge(v_c, v_f);

        // Cross-connections and Sink
        myGraph.addEdge(v_d, v_g);
        myGraph.addEdge(v_e, v_g);
        myGraph.addEdge(v_f, v_g);
        myGraph.addEdge(v_c, v_e);  // Extra link between branches

        // 4. Run BFS
        System.out.printf("Starting BFS on %s from Vertex %s:%n", myGraph.name(), v_a);
        var traversal = myGraph.bfs(v_a);

        // Print the raw map of visited flags
        System.out.println(traversal);

        // Print only the visited vertices (those reachable from start)
        for (var entry : traversal.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Visited: " + entry.getKey());
            }
        }
    }
}
