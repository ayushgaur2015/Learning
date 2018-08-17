package com.learning.automation.learning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	static int iterateIt(int[][] a) {
		/*
		 * Write your code here
		 */
		int sum=0;
		int n= a.length;
		for(int i=0;i<n-3;i++) {
			for(int j=0;j<n-3;j++) {
				for(int k=i;k<i+3;k++) {
					for(int l=j;l<j+3;l++) {
				   	System.out.print("i="+i+"l="+l+"\t");
					System.out.print(a[k][l]);
				}
					System.out.println("\n");
			}
			}
			System.out.println("\n");
		}
		
		return sum;
	}
	public static void main(String[] args) throws IOException {
		int a[][] = { {1, 2, 3, 4, 5, 6},
				{0,0,0,0,0,0,},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}
				,{2,2,2,2,2,2},{3,3,3,3,3,3}};
		iterateIt(a);
	}
}
