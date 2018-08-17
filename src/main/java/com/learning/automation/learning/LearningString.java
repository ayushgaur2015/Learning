package com.learning.automation.learning;

import java.util.HashMap;
import java.util.Map;

public class LearningString {

	public static void main(String arg[]) {
		// dupl_occurance("aaabbbcddedafgh");
		// duplWordOccurance("People of gotham. This is your final warning. Abandon this
		// city or I will unleash your greatest fears. This is my testimony thomas
		// wayne. Dear son As you are reading this , than I may no be there to see you
		// as the good man your have grown up to be");
		//occuranceOfGivenCharacter('i');
		//reverseString("People of gotham. This is your final warning. Abandon this");
		int a[]= {1,1,2,3,4,4,4,5,6,7};
		repeatingNumbers(a,10);
	}

	public static void dupl_occurance(String str) {
		int num = str.length();
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		for (int i = 0; i < num; i++) {
			char chars = str.charAt(i);
			if (occ.containsKey(chars)) {
				int count = occ.get(chars);
				occ.put(chars, ++count);
			} else {
				occ.put(chars, 1);

			}
		}

		for (char i : occ.keySet()) {
			System.out.println(i + " " + occ.get(i));
		}

	}

	public static void duplWordOccurance(String str) {

		String[] strSp = str.split(" ");
		int num = strSp.length;
		Map<String, Integer> occ = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String key = strSp[i].toLowerCase();
			if (occ.containsKey(key)) {
				int count = occ.get(key);
				occ.put(key, ++count);
			} else {
				occ.put(key, 1);
			}
		}

		for (String i : occ.keySet()) {
			System.out.println(i + " " + occ.get(i));
		}
	}

	
	public static void occuranceOfGivenCharacter(char i) {
		String str = "People of gotham. This is your final warning. Abandon this";
	
		int num = str.split(String.valueOf(i)).length-1;
		System.out.println(num);
	}
	
//	public static void reverseString(String str) {
//		StringBuffer strB = new StringBuffer(str);
//		System.out.println(strB.reverse());
//		String[] strSp = str.split(" ");
//		int num  = strSp.length;
//		for(int i=num;i>0;i++) {
//			List<String> newStr = strSp[i]; 
//		}
//		
//		for(String strs:strSp) {
//			System.out.print(strs+" ");
//		}
//	}
	
	public static void repeatingNumbers(int[] a, int num) {
		
		for(int i=0;i<num;i++) {
			int temp = a[i];
			int count = 0;
			int nums=0;
			for(int j=0;j<num;j++) {
				if(temp==a[j]&&i>j) {
					count++;
					nums=temp;
				}
			}
			System.out.println(nums+" "+count);
		}
	}
}
