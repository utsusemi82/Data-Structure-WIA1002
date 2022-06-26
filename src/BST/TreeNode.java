/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
    
    
}
