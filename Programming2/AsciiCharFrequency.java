package com;

public class AsciiCharFrequency 
{
	public static void main(String[] args) {
		int[]arr=new int[128];
//		System.out.println(arr[65]);
//		arr['A']=100;
//		System.out.println(arr[65]);
//		
//		System.out.println(arr[67]);//0
//		arr['C']++;
//		System.out.println(arr[67]);//1
//		arr['C']++;
//		System.out.println(arr[67]);//2
//		arr['C']++;
//		System.out.println(arr[67]);//3
//		arr['C']++;
		
		String s="DACCDBD";
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+"-"+arr[i]);
			}
		}
	}

}
