package com;
//pass by value
public class Demo5 
{
	static void fun(int n) {
		n=20;
		System.out.println(n);//20
	}
	public static void main(String[] args) {
		int n=10;
		fun(n);
		System.out.println(n);//10
	}

}
