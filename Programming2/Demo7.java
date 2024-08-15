package com;

public class Demo7 
{
	public static void main(String[] args) {
		String s="hello123@&bye##&&ZZ";
		String a="",n="",sc="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				a=a+ch;
			}
			else if(ch>='0'&&ch<='9') {
				n=n+ch;
			}
			else {
				sc=sc+ch;
			}
		}
		System.out.println("alpha" +a);
		System.out.println("numeric" +n);
		System.out.println("special char" +sc);
		System.out.println(a+n+sc);
	}

}
