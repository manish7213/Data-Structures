package com.manish.Tree;


class BinTreeHeight {
	public static int height(Node root) {
		if(root==null)
            return -1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
    
        return 1+(Math.max(rightHeight,leftHeight));
    }

}


// Considering the height of the root node is -1;

/*input: 
7
3
5
2
1
4
6
7
output:
3  
*
*/