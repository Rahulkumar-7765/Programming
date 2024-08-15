package com;

public class FiboSeries1 
{
	public static void main(String[] args) {
		int n1=0,n2=1,sum=0;
		int i=1,n=50,fp=100,ep=1000;
		while(n1<=ep) {
			if(n1>=ep) {
				System.out.println(n1);
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
		}
	}
}


