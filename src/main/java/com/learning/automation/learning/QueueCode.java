package com.learning.automation.learning;

public class QueueCode {
	public static void main(String arg[]) {
	
	QueueDS q1 = new QueueDS(10);
	q1.push(q1);
	QueueDS q2 = new QueueDS(20);
	QueueDS q3 = new QueueDS(30);
	q2.push(q2);
	q3.push(q3);
	q1.display();
	q1.pop();
	q1.display();
	}
	
}

class QueueDS{
	static QueueDS front=null;
	static QueueDS rear=null;
	QueueDS next=null;
	int data;
	
	QueueDS(int data) {
		this.data=data;
	}
	
	public void push(QueueDS q) {
		System.out.println(q.data+"is pushed");
		if(front==null&&rear==null) {front=rear=q;			
		}
		else {
			rear.next=q;
			rear=q;
		}
		rear.next=null;
		
	}
	
	public void pop() {
		if(rear!=front&&front!=null) {
			QueueDS temp;
			temp=front;
			front=front.next;
			temp.next=null;
		}
		
	}
	
	public void display() {
		QueueDS temp = front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}