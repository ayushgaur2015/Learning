package com.learning.automation.learning;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			multiple(n);
		}
	}

	public static void multiple(int n) {
		int sum = 0;
		int i = 3;
		int j = 5;
		while (j < n || i < n) {

			if (i < n) {
				sum += i;
				i = i + 3;
			}
			if (j < n) {
				if (j % 3 != 0) {
					sum += j;
				}
				j = j + 5;
			}
		}
		System.out.println(sum);

	}
}
