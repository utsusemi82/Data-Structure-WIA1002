//L2Q4
package GenericLab;

/**
 *
 * @author User
 */
public class minmax {
    
    public static void main(String[] args){
       Integer[] intArray = {5,3,7,1,4,9,8,2};
       String[] strArray = {"red", "blue", "orange", "tan"}; 
       
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    public static <E extends Comparable> String maximum(E[] genericArray){
        E min = genericArray[0];
        E max = genericArray[0];
        
        for(int i=0; i<genericArray.length; i++){
            if(min.compareTo(genericArray[i]>0))
                min = genericArray[i];
        }
        
        for (E genericArray1 : genericArray) {
            if (max.compareTo(genericArray1 < 0)) {
                max = genericArray1;
            }
        }
        
        return "Min = " + min + " Max = " + max;
    }
    
}
