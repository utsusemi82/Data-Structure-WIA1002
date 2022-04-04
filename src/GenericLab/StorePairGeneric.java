//L2Q1
package GenericLab;

/**
 *
 * @author User
 * @param <E>
 */
public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>>{
    private E first, second;
    
    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        StorePairGeneric<E> another = (StorePairGeneric<E>) o ;
        return first.equals(another.first);
    }
    
    @Override
    public int compareTo (StorePairGeneric<E> o){
        return first.compareTo(o.first);
    }
    
   
}
