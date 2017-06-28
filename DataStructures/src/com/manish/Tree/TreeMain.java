package com.manish.Tree;

import java.util.Scanner;

public class TreeMain {
	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
       /* int height = BinTreeHeight.height(root);
        System.out.println(height);*/
        
       // LevelOrderTravers.levelOrder(root);
        
        VerticalOrderTraverse.verticalOrderTraversal(root);
    }
		
}


