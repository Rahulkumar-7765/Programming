package com;

public class Test1 
{
	public static void main(String[] args) {
		int sum=0;
		int rem=0;
		int n=9;
//		int n*n;
		int sq=n*n;
		while(sq!=0) {
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			
		}
		if(sum==n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
		
	}

}
