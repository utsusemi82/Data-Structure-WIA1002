//L2Q2
package GenericLab;

/**
 *
 * @author User
 * @param <E>
 */
public class MyGeneric<E> {
    private E e;

    public MyGeneric() {
    }

    public MyGeneric(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    
    //Test program
    public static void main(String[] args){
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        strObj.setE("Java");
        intObj.setE(8);
        
        System.out.println("String: " + strObj.getE());
        System.out.println("Integer: " + intObj.getE());
    }
    
    
    
}
