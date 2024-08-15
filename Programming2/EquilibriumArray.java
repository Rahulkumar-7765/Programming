package com;

public class EquilibriumArray
{
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,1,1,1,7};
		int m=(arr.length-1)/2;
		int sum1=0,sum2=0;
		for(int i=0;i<=m;i++) {
			sum1+=arr[i];
		}
		for(int i=m+1;i<arr.length;i++) {
			sum2+=arr[i];
		}
		if(sum1==sum2) {
			System.out.println("Equilibrium Array");
		}
		else {
			System.out.println("Not A Equilibrium Array");
		}
	}

}
