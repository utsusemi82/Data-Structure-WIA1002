//T2Q2
package GenericTutorial;

/**
 *
 * @author User
 */
public class MyArray {
    
    public static void main(String[] args){
        Integer[] num = {1, 2, 3, 4, 5};
        String[] name = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'}; 
        
        MyArray.listAll(num);
        MyArray.listAll(name);
        MyArray.listAll(alphabet);
        
    }
    
    public static <t> void listAll(t[] list){
        for (t list1 : list) {
            System.out.println(list1 + " ");
        }
        System.out.println();
    }
     
}
