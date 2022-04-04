//L2Q5
package GenericLab;

import static GenericLab.FindMax.Circle.max;

/**
 *
 * @author User
 * @param <E>
 */
public class FindMax<E> {
    
    public static class Circle implements Comparable <Circle>{
       
        double radius;

        public Circle(double radius){
            this.radius = radius;
        }
        
        @Override
        public int compareTo(Circle c){
            if(this.radius > c.radius)
                return -1;
            else
                return 0;
        }
        
        @Override
        public String toString(){
            return Double.toString(this.radius);
        }
        
         
        //Max Method 
        public static <E extends Comparable<E> > E max(E[] list) { 
            if (list.length != 0){
                E max = list[0];
            }
            
            for (E list1 : list) {
                if (list1.compareTo(max) > 0) {
                    //positive number means a > b
                    max = list[i];
                }
            }
            
            return max; 

            }
            return null; 

        } 

        //Main Method 

        public static void main(String[] args) { 

        Integer[] intArray = {1,2,3} ; 
        String[] strArray = {"red","green","blue"} ; 
        Circle[] cirArray = {new Circle(3), new Circle(2.9), new Circle(5.9)} ; 

         

        System.out.println(max(intArray)); 

        System.out.println(max(strArray)); 

        System.out.println(max(cirArray)); 
        }
}

         
    
    
    

