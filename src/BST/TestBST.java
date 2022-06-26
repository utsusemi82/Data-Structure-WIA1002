/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BST;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JiaWen
 */
public class TestBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST<Integer> tree = new BST<>();
        Integer[] data = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        
        for (Integer data1 : data) {
            tree.insert(data1);
        }
        
        System.out.println("Input data: " + Arrays.toString(data));
        
        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        
        System.out.print("\nPostoder: ");
        tree.postorder(tree.root);
        
        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);
        
        System.out.print("\nHeight of BST: " + tree.height());

        System.out.print("\nRoot for BST is: " + tree.getRoot());
    
        System.out.print("\nCheck whether 10 is in the tree? " + tree.search(10));
        
        System.out.print("\nDelete 53");
        tree.delete(53);
        
        System.out.print("Updated Inorder data(sorted): ");
        tree.inorder(tree.root);
        
        System.out.print("\nMin Value: " + tree.minValue());
        System.out.print("\nMax Value: " + tree.maxValue());
        
        System.out.print("\nA path from the root to 6 is: ");
        ArrayList<TreeNode<Integer>> list = tree.path(6);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).getElement()+ " ");
        }
    }
    
}
