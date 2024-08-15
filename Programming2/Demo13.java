package com;

public class Demo13 
{
	 public static void main(String[] args) {
	        String input = "acatcatbcat";
	        String substring = "cat";
	        int count = countSubstring(input, substring);
	        System.out.println("Count: " + count);
	    }

	    public static int countSubstring(String str, String sub) {
	        int count = 0;
	        int lastIndex = 0;
	        while ((lastIndex = str.indexOf(sub, lastIndex)) != -1) {
	            count++;
	            lastIndex += sub.length() - 1;
	        }
	        return count;
	    }
	}



