package com.linkedList;

import java.util.Stack;


class Node1{

	Node1 next;
	int data;
	Node1(int data){ 
		this.data = data;
		this.next = null;
	}
}
public class MyCustomLinkedList {
	Node1 head;
	Node1 tail;
	int length=0;
	public MyCustomLinkedList(int data){
		this.head = new Node1(data);
		this.length=1;
		this.tail = this.head;
		//System.out.print(this.head.data+"->");
	}
	// append at the end of the list 
	public Node1 append(int data) {
		Node1 newNode = new Node1(data);		
		this.tail.next = newNode;
		this.tail=newNode;
		this.length++;
		//System.out.print(this.tail.data+"->");
		return this.head;
	}
	// add at the start of the list
	public Node1 preppend(int data) {
		Node1 newNode = new Node1(data);
		newNode.next = this.head;
		this.head = newNode;
		this.length++;
		return this.head;
	}
	//print linked list
	public void printList() {
		Node1 curr = this.head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
	}
	// insert node in linkedlist 
	public Node1 insert(int index,int data) {
		Node1 newNode = new Node1(data);
		if(index==0) {
			return this.preppend(data);
		}
		if(index>=this.length) {
			return this.append(data);
		}
		Node1 pre = this.traverseTillIndex(index-1);
		Node1 aft = pre.next;
		pre.next = newNode;
		newNode.next = aft;
		this.length++;
		return this.head;
	}
	//traverse till index
	public Node1 traverseTillIndex(int index) {
		if(index<0) {
			return null;
		}
		int counter = 0;
		Node1 current = this.head;
		while(counter!=index) {
			current = current.next;
			counter++;
		}
		return current;
	}
	//Remove nodes from linkedlist
	public Node1 remove(int index) {
		Node1 pre;
		Node1 del;
		Node1 aft;
		// headnode
		if(index==0) {
			pre = this.head;
			this.head = pre.next;
			this.length--;	
			return this.head;
		}
		//tail node
		if(index==this.length-1) {
			pre=this.traverseTillIndex(index-1);
			del=pre.next;
			pre.next=null;
			this.tail=pre;
			this.length--;
			return this.head;
		}
		//in betweeen nodes
		pre = this.traverseTillIndex(index-1);
		del = pre.next;
		aft = del.next;
		pre.next = aft;
		this.length--;
		return this.head;
	}
	//Reverse linkedlist
	public Node1 reverse() {
		//if linkedlist has only one node
		//15->5->10->11->20
		//we are just reverse the pointer direction will give reverse list 
		//15<-5<-10<-11<-20
		if (this.head.next==null) {// this.length ==1
	        return this.head;
	    }
		
	    Node1 first = this.head;
	    this.tail  = this.head;
	    Node1 second = first.next;
	    
	    while(second!=null) {
	        Node1 temp = second.next;
	        second.next = first;
	        first = second;
	        second = temp;
	        
	    }
	  
	      this.head.next = null;
	      this.head = first;
	      return this.head;
	      
	}
	//Another reverse method using stack 
	public Node1 printreverse() {
		   System.out.println("In reverse");
			Stack<Node1> s = new Stack<Node1>();
		   Node1 curr = this.head;
		   while(curr!=null) {
			    s.push(curr);
			   curr = curr.next; 
		   }
		   while(!s.isEmpty()) {
			   System.out.print(s.pop().data+"->");
		   }
		   return this.head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomLinkedList linkedlist = new MyCustomLinkedList(10);
		linkedlist.append(5);
		linkedlist.append(15);
		linkedlist.preppend(20);
		linkedlist.preppend(2);
		linkedlist.insert(2, 11);
		linkedlist.insert(6, 30);
		linkedlist.remove(0);
		linkedlist.remove(5);
		linkedlist.remove(2);
		linkedlist.insert(2,10);
		linkedlist.reverse();
		linkedlist.printList();
		
		System.out.println("\n length: "+linkedlist.length);
	}

}
