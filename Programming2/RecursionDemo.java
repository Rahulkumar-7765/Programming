package com;

public class RecursionDemo 
{
//	static int i=1;
//	static void display(int n) {
//		
//		if(i<=n) {
//			System.out.println(i);
//			i++;;
//			display(n);
//		}
//	}
//	public static void main(String[] args) {
//		display(5);
//		
//	}
//	static void display(int n) {
//		if(n>=1) {
//			display(n-1);
//			System.out.println(n);
//		}
//	}
//	public static void main(String[] args) {
//		display(5);
//	}
	static void display(int n) {
		if(n>=1) {
			System.out.println(n);
			display(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		display(3);
	}

}
