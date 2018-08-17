package com.learning.automation.learning;

public class ArrayCode {
	public static void main(String arg[]) {
		int arr[]={10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		arr= reverseArray(arr);	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void SumX(int arr[], int n, int x) {
		boolean flag=false;
		int i=0;
			for(int j=i+1;j<n;j++,i++) {
				if(arr[i]+arr[j]==x) {
					System.out.println(arr[i]+"and"+arr[j]);
					flag=true;
				}
			}
	if(!flag) {
			System.out.println("not found");
		}
		
	}
	
	public static int[] cycleRotate(int arr[],int n,int d) {
		int temp=arr[n-1];
		System.out.println(temp);
		int count=0;
		while(count<d&&d<n) {
			for(int i=n-2;i>=0;i--) {
				System.out.println(arr[i+1]+"is overridden by "+arr[i]);
				arr[i+1]= arr[i];
			}count++;
		arr[0]=temp;}
		
		return arr;
	}
	
	public static int maxSumRotation(int arr[],int n) {
		
		int rotation=0,max=0;;
		while(rotation<n-2) {
			int sum=0;
			int lastNode=n-2;
			int count=0;
			int temp=arr[n-1];
		while(lastNode>=0) {
			arr[lastNode+1]=arr[lastNode];			
			lastNode--;
		}
		arr[0]=temp;
		while(count<n) {
			System.out.println(count+"*"+arr[count]);
			sum+=count*arr[count];
			System.out.println(sum);
			count++;
		}
		System.out.println(sum);
		if(max<sum) {
			max=sum;
		}rotation++;
		}
		return max;
	}
	
	static int[] reverseArray(int[] a) {

        int num = a.length;
        int d=0;
        for(int i=num-1;i>=0;i--){
        	int temp = a[num-i-1];
        	a[num-i-1]=a[i];
        	a[i]=temp;
        	if(i==num/2) {
        		break;
        	}
        }


        return a;
    }
	
}
