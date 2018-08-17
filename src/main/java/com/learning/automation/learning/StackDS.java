package com.learning.automation.learning;

public class StackDS {

	public static void main(String arg[]) {

		stackPointer stk = new stackPointer(10);
		stk.push(stk);
		
		stackPointer stk2 = new stackPointer(20);
		stk2.push(stk2);
		stackPointer stk3 = new stackPointer(30);
		stk.push(stk3);
		stk.display();
		stk.pop();
		stk.display();
		stackArray sta = new stackArray();
		sta.push(10);
		sta.push(20);
		sta.push(30);
		sta.display();
		sta.pop();
		sta.display();

	}
	
	
}

class stackPointer{
	stackPointer next=null;
	static stackPointer top=null;
	stackPointer temp=null;
	static stackPointer nav=null;
	int data;
	stackPointer(int data){
		this.data=data;
	}

  public void push(stackPointer str) {
	  if(top==null) {top=str;top.next=null;}
	  else {str.next=top;top=str;}
  }
  
  public void pop() {
	  if(top!=null) {
		  temp=top;
		  top=top.next;
		  temp.next=null;
	  }
  }
  
  public void display() {
	  nav=top;
	  while(nav!=null) {
		  System.out.println("list"+nav.data);
		  nav=nav.next;
	  }
  }
}  

class stackArray{
	
	static int arr[]=new int[10];
	static int top=-1;
	
	public void push(int n) {
		top++;arr[top]=n;
	}
	
	public void pop() {
		if(top!=-1) {
		System.out.println("element poped"+arr[top]);
		top--;}
	}
	
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]+"\t");
		}
	}
	
  
  }
  

