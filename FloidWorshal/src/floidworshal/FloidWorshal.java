package floidworshal;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import java.awt.Container;
import java.util.Iterator;

public class FloidWorshal {
    //нахождения транзитивного замыкания графа отношения
    public static boolean[][] transClosure(boolean[][] G) {
        int n = G.length;
        for (int l = 0; l < n; l++) {
            // Формирование матрицы G(l+1):
            for (int u = 0; u < n; u++) {
                if (G[u][l]) {
                    for (int v = 0; v < n; v++) {
                        G[u][v] = G[u][v] || G[l][v];
                    }
                }
            }
        }
        return G;
    }
    public class Graph {
    class Arc {
        public Arc(int to, 
                   double weight,
                   Arc next) {
            this.to = to;
            this.weight = weight;
            this.next = next;
        }
        private int to;
        private double weight;
        private Arc next;
    }

    private int nVert;
    private Arc[] list;

    public Graph(int nVert) {
        this.nVert = nVert;
        list = new Arc[nVert];
    }
}
private static void traverseDepthComponent
        (int i, Graph g, GraphVisitor visitor, 
         boolean[] visited) {
    visitor.visitVertexIn(i);
    visited[i] = true;
    for (Iterator arcs = g.adjacentArcs(i); 
                  arcs.hasNext(); ) {
        Graph.Arc arc = (Graph.Arc)arcs.next();
        visitor.visitArcForward(i, arc, 
                                visited[arc.getTo()]);
        if (!visited[arc.getTo()]) {
            traverseDepthComponent(arc.getTo(), g, 
                                   visitor, visited);
        }
        visitor.visitArcBackward(i, arc);
    }
    visitor.visitVertexOut(i);
}

  public static void traverseWithContainer(Graph g, GraphVisitor visitor, int start,
			ContainerFactory factory) {
    // Инициализация
    int n = g.vertices();                              // Число вершин графа
    Container container = factory.createContainer(n);  // Создание контейнера
    container.push(start);                             // Инициализация контейнера
    boolean[] inQueue = new boolean[n];
    boolean[] passed = new boolean[n];
    inQueue[start] = true;
    visitor.visitVertexIn(start);

    while (!container.isEmpty()) {
        int current = container.pull();
        passed[current] = true;
        visitor.visitVertexOut(current);
        for (Iterator arcs = g.adjacentArcs(current); arcs.hasNext(); ) {
            Graph.Arc arc;
            arc = (Graph.Arc)arcs.next();
            int end = arc.getTo();
            if (passed[end])
                visitor.visitArcBackward(current, arc);
            else {
                visitor.visitArcForward(current, arc, inQueue[end]);
                if (!inQueue[end]) {
                    container.push(end);
                    inQueue[end] = true;
                    visitor.visitVertexIn(end);
                }
            }
        }
    }
}




    public static void main(String[] args) {
        
    }
}
