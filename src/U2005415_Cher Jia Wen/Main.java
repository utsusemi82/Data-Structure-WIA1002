/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U2005415_CJW;

/**
 *
 * @author JiaWen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Packet> main = new Queue<>();
        
        System.out.println("10 packets arrived");
        Packet a = new Packet("Video", 1);
        Packet b = new Packet("Voice", 2);
        Packet c = new Packet("Data", 3);
        Packet d = new Packet("Data", 4);
        Packet e = new Packet("Voice", 5);
        Packet f = new Packet("Video", 6);
        Packet g = new Packet("Voice", 7);
        Packet h = new Packet("Voice", 8);
        Packet i = new Packet("Data", 9);
        Packet j = new Packet("Video", 10);
        
        Packet[] listofarray = {a, b, c, d, e, f, g, h, i, j};
        main.enqueue(listofarray);
        
        main.toString();
        
        System.out.println("Processing 10 network packets");
        PriorityQueue<Packet> PQ = new PriorityQueue<>();
        PQ.display();
        
        
    }
    
}
