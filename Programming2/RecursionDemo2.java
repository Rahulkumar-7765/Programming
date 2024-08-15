package com;

public class RecursionDemo2 
{
	static int factN(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*factN(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factN(5));
	}

}
