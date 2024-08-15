package com;

public class NthPrimeNumber
{
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=1; i<=n; i++) {
			if(n%1==0) {
				c++;
			}
		}
		return c==2;
	}
	public static void main(String[] args) {
		int i=1;
		int count=0;
		int n=10;
		while(n!=0) {
			if(isPrime(i)==true) {
				count++;
				if(count==n) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}
}
