package com;

public class PalindromicSubString 
{
	public static void main(String[] args) {
	        String str = "abbacgcahjfj";
	        printAllPalindromicSubstrings(str);
	    }

	    static void printAllPalindromicSubstrings(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                String substr = str.substring(i, j);
	                if (isPalindrome(substr) && substr.length()>1) {
	                    System.out.println(substr);
	                }
	            }
	        }
	    }

	    static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}



