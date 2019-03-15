
package com.tree;

class Node1{
	int data ;
	Node1 left;
	Node1 right;
	Node1(int data){ 
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
//         12
//  	5      20 
//   2    7  15  88
public class MyBinanryTree {
	Node1 root;
	MyBinanryTree(){
		this.root  = null;
    }
	public Node1 insert(int data) {
		Node1 newNode = new Node1(data);
		if(this.root==null) {
			this.root=newNode;
			return this.root;
		}else {
			Node1 currentNode = this.root;
			while (true) {
				if(currentNode.data > data) {
					if(currentNode.left==null) {
						currentNode.left = newNode;
						return this.root;
					}
					currentNode = currentNode.left;
				}else {
					if(currentNode.right==null) {
						currentNode.right = newNode;
						return this.root;
					}
					currentNode = currentNode.right;
				}
			}
		}
	
	}
	public boolean lookup(int data) {
		if(this.root==null) {
			return false;
		}else {
			Node1 currentNode = this.root;
			while(currentNode!=null) {
				if(data < currentNode.data) {
					currentNode = currentNode.left;
				}else if(data > currentNode.data){
					currentNode = currentNode.right;
				}else if(data == currentNode.data){
					return true;
				}
			}
		}
		return false;
	}
	// Not completed
	public Node1 remove (int data) {
		if(this.root==null) {
			return null;
		}else {
			Node1 currentNode = this.root;
			Node1 parentNode = this.root;
			while(currentNode!=null) {
				if(data < currentNode.data) {
					parentNode =  currentNode;
					currentNode = currentNode.left;
				}else if(data > currentNode.data){
					parentNode =  currentNode;
					currentNode = currentNode.right;
				}else if(data == currentNode.data){
					// Case 1: Current node has no right child
						if(currentNode.right==null) {
							// modifying root node
							if(parentNode==null) {
								this.root = currentNode.left;
							}else {
								if(currentNode.data < parentNode.data) {
									parentNode.left = currentNode.left;
								}else if(currentNode.data > parentNode.data) {
									parentNode.right = currentNode.left;
								}
							}
							
						}
						// Case 2: Right child which doent have left child
						else if(currentNode.right.left==null) {
							if(parentNode==null) {
								this.root = currentNode.left;
							}else {
								if(currentNode.data < parentNode.data) {
									parentNode.left = currentNode.right;
								}else if(currentNode.data > parentNode.data) {
									parentNode.right = currentNode.right;
								}
							}
						}
						// Case 3 	Right child that has a left child
						else if(currentNode.right.left!=null) {
							// many codes of lines.
						}
				}
			}
		}
		return this.root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinanryTree bst = new MyBinanryTree();
		bst.insert(12);
		bst.insert(5);
		bst.insert(20);
		bst.insert(2);
		bst.insert(7);
		bst.insert(15);
		bst.insert(88);
		
		System.out.println(bst.lookup(88));
		

	}

}
