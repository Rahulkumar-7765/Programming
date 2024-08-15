package com;

public class BinaryToDecimal 
{
	public static void main(String[] args) {
		int n=1111;
		int bi=1,rem=0,sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+sum+(rem*bi);
			n=n/10;
			bi*=2;
		}
		System.out.println(sum);
	}

}
