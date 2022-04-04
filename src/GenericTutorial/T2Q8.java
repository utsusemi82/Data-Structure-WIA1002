/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericTutorial;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class T2Q8 {
    public static void display(ArrayList<?>list) {
        for(int i=0; i<list.size; i++){
            System.out.println(list.get[i] + "");
        }
        System.out.println();
        
    }
    
}

/*T2Q9
*When the compiler encounters a generic class, interface, or method with an unbound type parameter, such as <T> or <E>, it replaces all occurrences of the type parameter with what type?
*The compiler will use type Object if unbounded type parameters like T are used. 
*/

/*T2Q10
10. When the compiler encounters a generic class, interface, or method with a bound type parameter, such as <T extends Number> or <E extends Comparable>, it replaces all occurrences of the type parameter with what type?
*When the compiler encounters a generic class, interface, or method with a bound type parameter, such as <T extends Number> or <E extends Comparable>, it replaces all occurrences of the type parameter with what type? 

It replaces them with their upper bounds such as Number or Comparable.   
*/