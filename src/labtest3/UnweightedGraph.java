/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest3;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author JiaWen
 * @param <T>
 */

public class UnweightedGraph<T extends Comparable<T>> {
    Vertex<T> head;
    int size ;

    public UnweightedGraph(){
        this.head = null;
        size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public boolean hasVertex(T vertex){
        if (head == null) return false;

        Vertex <T> temp = head;
        while (temp != null){
            if (temp.vertexInfo.compareTo(vertex) == 0){
                return true;
            }
            temp = temp.nextVertex;
        }

        return false;
    }

    public int getIndeg(T v){
        if (hasVertex(v) == true){
            Vertex<T> temp = head;
            while (temp != null){
                if (temp.vertexInfo.compareTo(v) == 0){
                    return temp.inDeg;
                }
                temp = temp.nextVertex;
            }
        }

        return -1; //if vertex not found
    }

    public int getOutdeg(T v){
        if (hasVertex(v) == true){
            Vertex<T> temp = head;
            while (temp != null){
                if (temp.vertexInfo.compareTo(v) == 0){
                    return temp.outDeg;
                }
                temp = temp.nextVertex;
            }
        }

        return -1; //if vertex not found
    }

    //create two pointer , one fast one slow
    //fast pointer will update the slow pointer to last node of the list
    //after update , previous pointer will reach last node
    //fast pointer will update to null and terminate while loop
    public boolean addVertex(T v){
        if (hasVertex(v) == false){
            Vertex<T> temp = head;
            Vertex<T> newVertex = new Vertex<>(v, null);
            if (head == null){
                head = newVertex;
            }else {
                Vertex<T> previous = head;
                while( temp != null){
                    
                    previous = temp;
                    temp = temp.nextVertex;
                }
                previous.nextVertex = newVertex;
            }
            size ++;
            return true;
        }else {
            return false;
        }
    }

    //with node information , find index of the vertex
    public int getIndex (T vertex){
        Vertex <T> temp = head;
        int pos = 0;

        while (temp != null){
            if (temp.vertexInfo.compareTo(vertex) == 0){
                return pos;
            }
            temp = temp.nextVertex;
            pos += 1;            
        }
        return -1; // vertex not found
    }

    //return all vertex in the graph
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T> listOfVertex = new ArrayList<>();
        Vertex <T> temp = head;

        while (temp != null){
            listOfVertex.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return listOfVertex;
    }

    //get vertex info at specific position
    public T getVertex(int pos){
        if (pos > size -1 || pos < 0){
            return null;
        }
        Vertex<T> temp = head;
        for (int x = 0; x<pos ; x++){
            temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }

   
    //add new edge from source to destination , with a weight

    public boolean addEdge(T movie1 , T movie2 , T movie3){
        if (head == null) return false;
        if (! hasVertex(movie1) || ! hasVertex(movie2)|| ! hasVertex(movie3));

        Vertex<T> movie1Vertex = head;
        while (movie1Vertex != null){
            if (movie1Vertex.vertexInfo.compareTo(movie1) == 0){
                Vertex<T> movie2Vertex = head;
                while (movie2 != null){
                    //found destination
                    if (movie2.compareTo(movie2) == 0){
                        
                        Edge<T> currentEdge = movie1Vertex.firstEdge;
                        //Create the edge. Let the â€œref to next edgeâ€� point to the edges list
                        Edge<T> newEdge = new Edge<>(movie2Vertex);
                        //Let the source vertex point to the new edge object
                        movie1Vertex.firstEdge = newEdge;
                        //Add 1 to in and out degree
                        movie1Vertex.outDeg ++;
                        movie2Vertex.inDeg ++;
                        return true;
                    }
                    movie2Vertex = movie2Vertex.nextVertex;
                }
                Vertex<T> movie3Vertex = head;
                while (movie3 != null){
                    //found destination
                    if (movie3.compareTo(movie3) == 0){
                        
                        Edge<T> currentEdge = movie2Vertex.firstEdge;
                        //Create the edge. Let the â€œref to next edgeâ€� point to the edges list
                        Edge<T> newEdge = new Edge<>(movie3Vertex , currentEdge);
                        //Let the source vertex point to the new edge object
                        movie2Vertex.firstEdge = newEdge;
                        //Add 1 to in and out degree
                        movie2Vertex.outDeg ++;
                        movie3Vertex.inDeg ++;
                        return true;
                    }
                    movie3Vertex = movie3Vertex.nextVertex;
                }
            }
            movie1Vertex = movie1Vertex.nextVertex;
        }
        return false;

    }

    //return all neighbours of a vertex in ArrayList
    public ArrayList<T> getNeighbours(T v){
        if (head == null) return null;
        if ( !hasVertex(v)) return null;

        ArrayList<T> list = new ArrayList<>();

        Vertex<T> temp = head;

        while (temp != null){
            if (temp.vertexInfo.compareTo(v) == 0){
                Edge<T> currentEdge = temp.firstEdge;
                while (currentEdge != null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }

        return list;
    }

    //print graph using printEdges method
    public void printEdges()   {
        Vertex<T> temp=head;
        while (temp!=null) {
           System.out.print("# " + temp.vertexInfo + " : " );
           Edge<T> currentEdge = temp.firstEdge;
           while (currentEdge != null) {
              System.out.print("[" + temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo );
              currentEdge=currentEdge.nextEdge;
              while (currentEdge != null) {
              System.out.print(temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "] " );
              currentEdge=currentEdge.nextEdge;
              }
           }
           
           System.out.println();
           temp=temp.nextVertex;
        }  
    }

    //add the undirected edge
    public boolean addUndirectedEdge(T v1 , T v2 ,T v3){
        boolean flag1 , flag2;

        flag1 = addEdge(v1, v2, v3);
        flag2 = addEdge(v2, v1, v3);

        return (flag1 && flag2);
    }

    //remove edge from graph

    public boolean removeEdge(T source , T destination){
        if (head == null) return false;

        Vertex<T> sourceVertex = head;

        while (sourceVertex != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                Edge <T> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null){
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0){
                        //disconnect the edges
                        sourceVertex.firstEdge = currentEdge.nextEdge;
                        currentEdge.toVertex = null;
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                }

                return false; // if the edges is not found, no connection between the source n dest
            }

            sourceVertex = sourceVertex.nextVertex;
        }

        return false; // if source vertex not found
    }

    //print matrix
    private boolean adjMatrix[][];
    private int numVertices;

    // Initialize the matrix
    public UnweightedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdgeMatrix(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }
    
    // Print the matrix
    @Override
    public String toString() {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < numVertices; i++) {
        s.append(i).append(": ");
        for (boolean j : adjMatrix[i]) {
          s.append(j ? 1 : 0).append(" ");
        }
        s.append("\n");
      }
      return s.toString();
    }



    //implement DFS
    public void DFS(UnweightedGraph<T> Graph, T vertex){
        DFSTraverse(Graph , vertex);        
    }

    private void DFSTraverse(UnweightedGraph<T> g, T start){
        Stack<T> stack = new Stack<>();
        //create an arraylist of visited vertex
        visited = new ArrayList<>();
        System.out.println("Watch movie " + start);
		stack.push(start);
        
	while(!stack.isEmpty()){
            T tmp = stack.pop();
            System.out.print(tmp + " ");

            ArrayList<T> neighbourVertex = getNeighbours(tmp);
        for (int x = 0 ; x<neighbourVertex.size() ; x++){
            if ( !visited.contains(neighbourVertex.get(x))){
                stack.push(neighbourVertex.get(x));
                visited.add(neighbourVertex.get(0));
                }
            }

        System.out.println("     also need to watch" + visited.toString());
        System.out.println("     stack" + stack.toString());
            
		}
	}
    
    
}

