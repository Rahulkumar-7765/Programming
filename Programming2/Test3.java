package com;

public class Test3 
{
	public static void main(String[] args) 
	{
		System.out.println("Prime Number Between 1 and 100");
		
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
		
	}

	public static boolean isPrime(int i) 
	{
		if(i<=1) 
		{
			return false;
			
		}
		for(int i1=2; i1<=Math.sqrt(i1);i1++)
		{
			if(i1%i==0) {
				return false;
				
				
			}
			
		}
		return true;
	}

}
