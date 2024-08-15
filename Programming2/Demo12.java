package com;

public class Demo12
{
	public static void main(String[] args) {
		String s="acatcatbcat";
		
		int c=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='a'&&s.charAt(i+1)=='b') {
				c++;
			}
		}
		 System.out.println(c);
	}

}
