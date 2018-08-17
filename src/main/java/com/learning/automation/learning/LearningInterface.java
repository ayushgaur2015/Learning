package com.learning.automation.learning;

interface LearningInterface {
	
	int a=10;
	public int b=10;
	
	public void display();
	
	public void set();
	
}

class it1 implements LearningInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("it1");
	}

	@Override
	public void set() {		
	}
	
}
