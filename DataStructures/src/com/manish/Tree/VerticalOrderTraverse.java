package com.manish.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VerticalOrderTraverse {
	
	
	public static void verticalOrderTraversal(Node root) {
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		HashMap<Integer,Node> map = new HashMap<>();
		int hd=0;
		map.put(hd,root);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			//System.out.println(temp.data+" ");
			if(temp.left!=null) {
				queue.add(temp.left);
				map.put(hd-1,temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
				map.put(hd+1, temp.right);
				
			}
			
		}
		
		for(Map.Entry<Integer,Node> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue().data);
		}
	}

}
