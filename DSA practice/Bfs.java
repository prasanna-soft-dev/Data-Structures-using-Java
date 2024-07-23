import java.util.*;
import lombok.Data;
import lombok.ToString;

public class Bfs {

    @Data
    public class Vertex<T> {
        private final T data;
        private boolean visited;
        @ToString.Exclude
        private List<Vertex<T>> neighbours = new LinkedList<>();
    }

    public class BreadthFirstSearch<T> {
        private final Vertex<T> startVertex;

        public BreadthFirstSearch(Vertex<T> startVertex) {
            this.startVertex = startVertex;
        }

        public void traverse() {
            Queue<Vertex<T>> queue = new LinkedList<>();
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                Vertex<T> current = queue.poll();
                if (!current.isVisited()) {
                    current.setVisited(true);
                    System.out.println(current);
                    queue.addAll(current.getNeighbours());
                }
            }
        }
    }

    public static void main(String args[]) {
        Bfs bfsExample = new Bfs();
        Vertex<Integer> v0 = bfsExample.new Vertex<>(0);
        Vertex<Integer> v1 = bfsExample.new Vertex<>(1);
        Vertex<Integer> v2 = bfsExample.new Vertex<>(2);
        Vertex<Integer> v3 = bfsExample.new Vertex<>(3);
        Vertex<Integer> v4 = bfsExample.new Vertex<>(4);
        Vertex<Integer> v5 = bfsExample.new Vertex<>(5);
        Vertex<Integer> v6 = bfsExample.new Vertex<>(6);

        v0.setNeighbours(Arrays.asList(v1, v5, v6));
        v1.setNeighbours(Arrays.asList(v3, v4, v5));
        v4.setNeighbours(Arrays.asList(v2, v6));
        v6.setNeighbours(Arrays.asList(v0));

        BreadthFirstSearch<Integer> bfs = bfsExample.new BreadthFirstSearch<>(v1);
        bfs.traverse();
    }
}


