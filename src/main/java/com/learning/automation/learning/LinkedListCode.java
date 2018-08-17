package com.learning.automation.learning;

public class LinkedListCode {
	
	public static void main(String arg[]) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n2.next=n1;
		n1.next=null;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1.hashCode());
		//System.out.println(n1.next.hashCode());
		System.out.println(n2.next.hashCode());
		
	}
		

}


class Node{
	
	Node next;
	public Node head;
	int data;
	Node(int d){
		this.data=d;
	}
	
}

