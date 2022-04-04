//L2Q3
package GenericLab;

/**
 *
 * @author User
 */
public class CompareMax{
    
    
    public static <E extends Comparable> E maximum(E num1, E num2, E num3){
        E max = num1;
        
        if(num2.compareTo(max)>0)
            max = num2;
        
        if(num3.compareTo(max)>0)
            max = num3;
        
        return max;
    }
    
    public static void main(String[] args) {
        
        System.out.printf("%d is maximum for %d, %d, %d\n\n", maximum(255, 185, 543), 255, 185, 543); 

        System.out.printf("%s is maximum for %s, %s, %s\n\n", maximum('f', 'u', 'x'),'f', 'u', 'x'); 

        System.out.printf("%s is maximum for %s, %s, %s\n\n", maximum("cat", "dog", "duck") ,"cat", "dog", "duck"); 

    } 
    
}
