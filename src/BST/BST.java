/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

import java.util.ArrayList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class BST<E extends Comparable<E>> {
    TreeNode<E> root;
    int size = 0;

    public BST() {
    }
    
    public boolean search(E element){
        TreeNode<E> current = root;
        while(current != null)
            if(element.compareTo(current.getElement()) < 0){
                //go left
                current = current.left;
            }else if(element.compareTo(current.getElement()) < 0){
                //go right
                current = current.left;
            }else
                return true;
        return false;
        
    }
    
    public boolean insert(E e){
        if(root == null)
            root = new TreeNode(e);
        else{
            TreeNode<E> current = root;
            TreeNode<E> parent = new TreeNode<>();
            while(current != null){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }else{
                    return false;
                }
            }if(e.compareTo(parent.element)<0){
                parent.left = new TreeNode<>(e);
            }else if(e.compareTo(parent.element)>0){
                parent.right = new TreeNode<>(e);
            }
        }
        size ++;
        return true;
    }
    
    public int getSize(){
        return size;
    }
    
    public int height(){
        if(root == null){
            return 0;
        }
        return height(root);
    }
    
    private int height(TreeNode<E> node){
        if (node == null){
            return -1;
        }
        
        int leftH = height(node.left);
        int rightH = height(node.right);
        
        return Math.max(leftH, rightH) + 1;
        
    }
    
    public E getRoot(){
        if ( root == null){
            return null;
        }else{
            return root.element;
        }
    }
    
    public E minValue(){
        if(root == null){
            return null;
        }else{
            TreeNode<E> current = root;
            TreeNode<E> parent = null;
            
            while(current != null){
                parent = current;
                current = current.left;
            }
            return parent.element;
        }
    }
    
    public E maxValue(){
        if(root == null){
            return null;
        }else{
            TreeNode<E> current = root;
            TreeNode<E> parent = null;
            
            while(current != null){
                parent = current;
                current = current.right;
            }
            return parent.element;
        }
    }
    
    public ArrayList<TreeNode<E>> path(E e){
        if(search(e) == false){
            return null;
        }else{
            ArrayList <TreeNode<E>> list = new ArrayList<>();
            TreeNode<E> current = root;
            
            while(true){
                list.add(current);
                
                if(e.compareTo(current.element)<0){
                    current = current.left;
                }else if(e.compareTo(current.element)>0){
                    current = current.right;
                }else if(e.compareTo(current.element) == 0){
                    return list;
                }
            }
        }
    }
    
    public boolean delete(E e){
        if(search(e) == false){
            return false;
        }else{
            TreeNode<E> current = root;
            TreeNode<E> parent = null;
            
            while(e.compareTo(current.element)!=0){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }
            }
            
            if(current.left == null){
                if(e.compareTo(parent.element)<0){
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }else{
                TreeNode<E> rightMost = current.left;
                TreeNode<E> parentRightMost = null;
                
                while(rightMost.right != null){
                    parentRightMost = rightMost;
                    rightMost = rightMost.right;
                }
                current.element = rightMost.element;
                parentRightMost.right = rightMost.left;
            }
        }
        size-- ;
        return true;
    }
    
    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }
    
    protected void inorder(TreeNode<E> root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    
    protected void preorder(TreeNode<E> root) {
        //base case when root is null
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    protected void postorder(TreeNode<E> root) {
        //base case when root is null
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
}
