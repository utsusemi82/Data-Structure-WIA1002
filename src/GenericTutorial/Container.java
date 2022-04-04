package GenericTutorial;


//T2Q1 (Generic)

/**
 *
 * @author User
 * @param <T>
 */

public class Container<T> {

    public Container() {
    }
    
    private T t;

    public void add(T d) {
        this.t = d;
    }
    
    public T retrieve(){
        return t;
    }
    
    //main method
    public static void main(String[] args){
        Container<Integer> a = new Container<>();
        Container<String> b = new Container<>();
        
        a.add(50);
        b.add("Java");
        
        System.out.println("Integer container: " + a.retrieve());
        System.out.println("String container: " + b.retrieve());
    }   
}
