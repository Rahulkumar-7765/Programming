package com;

import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int reverseNumber=0;
		while(number!=0) {
			int digit=number%10;
			reverseNumber=reverseNumber*10+digit;
			number/=10;
			
		}
		System.out.println("Reverse Number"+reverseNumber);
	}

}
