/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author JiaWen
 */
public class UnweightedGraphSelf{
    public class Vertex<T extends Comparable<T>, N extends Comparable <N>> {
        T vertexInfo;
        int indeg;
        int outdeg;
        Vertex<T,N> nextVertex;
        Edge<T,N> firstEdge;

        public Vertex(){
            vertexInfo = null;
            indeg = 0;
            outdeg = 0;
            nextVertex = null;
            firstEdge = null;
        }

        public Vertex(T vInfo, Vertex<T,N> next){
            vertexInfo = vInfo;
            indeg = 0;
            outdeg = 0;
            nextVertex = next;
            firstEdge = null;
        }

    }

    public class Edge<T extends Comparable <T>, N extends Comparable <N>>{
        Vertex<T,N> toVertex;
        Edge<T,N> nextEdge;

        public Edge(){
            toVertex = null;
            nextEdge = null;
        }

        public Edge(Vertex<T,N> destination, Edge<T,N> a){
            toVertex = destination;
            nextEdge = a;
        }


    }
    
    public class Graph<T extends Comparable<T>, N extends Comparable<N>>{
        Vertex<T,N> head;
        int size;
        
        public Graph(){
            head = null;
            size = 0;
        }
    }
}
