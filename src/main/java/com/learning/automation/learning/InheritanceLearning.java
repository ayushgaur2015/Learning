package com.learning.automation.learning;

class A
{
    int i = 1212;
    
    protected void methodONe(int i) {
    	System.out.println("hello");
    }
}
 
class B extends A
{
    
 
    public B()
    {
    	this(10);
        
    }
    
    public void methodONe(short i) {
    	System.out.println("hello2");
    }
    
    public B(int a) {
    	super();
    	this();
    }
}


public class InheritanceLearning {
	public static void main(String[] args)
    {
        A a = new B();
        a.methodONe(10);
    }
}
