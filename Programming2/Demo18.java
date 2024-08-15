package com;

public class Demo18 
{
	 public static void main(String[] args) {
	        String s = "Hello";
	        char[]arr=new char[s.length()];
	        
	        // Convert string to char array
	        char[] charArray = s.toCharArray();
	        
	        // Print each character in the array
	        for (int i=0;i<s.length(); ++i) {
	        	arr[i]=s.charAt(i);
	        	System.out.println(arr[i]);
	            
	        }
	        
	    }
	}

	


