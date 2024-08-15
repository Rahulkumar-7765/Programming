package com;

public class Demo11 
{
	public static void main(String[] args) {
//		char c1='1';
//		char c2='6';
//		System.out.println((c1-48)+c2-48);
//	}
		String s="a12b4";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9') {
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);

}
}
