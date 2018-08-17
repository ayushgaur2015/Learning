package com.learning.automation.learning;

public class SortingCode {

	public static int [] insertionSort(int a[]) {
		
		 int n = a.length;
	        for (int i=1; i<n; ++i)
	        {
	            int key = a[i];
	            int j = i-1;
	            System.out.println("key"+key);
	            System.out.println("a[j]"+a[j]);
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j>=0 && a[j] > key)
	            {
	                a[j+1] = a[j];
	                j = j-1;
	            }
	            a[j+1] = key;
	        }
		
		return a;
		
	}
	
	
	public static void main(String arg[]) {
		int a[]= {1,4,5,2,3};
		a=insertionSort(a);
		for(int i: a) {
			System.out.println(i);
		}
	}
	
}
