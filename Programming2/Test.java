package com;
//pass by ref
public class Test 
{
	static void fum(int[]arr) {
		arr[0]=200;
		System.out.println(arr);
		System.out.println(arr[0]);
	}
	public static void main(String[] args) {
		int[]arr= {10,20,30};
		System.out.println(arr[0]);
		fum(arr);
		System.out.println(arr[0]);
	}

}
