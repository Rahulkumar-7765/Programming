package com;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PasswordStrengthChecker {
	    public static void main(String[] args) {
	        System.out.println(checkPasswordStrength("abe@123")); // Weak
	        System.out.println(checkPasswordStrength("ahj271")); // Weak
	        System.out.println(checkPasswordStrength("67ghuj")); // Weak
	        System.out.println(checkPasswordStrength("95gh@uio")); // Strong
	    }

	    public static String checkPasswordStrength(String password) {
	        if (password.length() < 8) {
	            return "Weak"; // Password length should be at least 8 characters
	        }

	        // Check for repeated characters
	        if (hasRepeatedCharacters(password)) {
	            return "Weak"; // Repeated characters found
	        }
 
	        // Check for sequences of 3 characters
	        if (hasSequenceOfThree(password)) {
	            return "Weak"; // Sequence of 3 characters found
	        }

	        // Check for at least one alphabetical character, one numerical character, and one special character
	        if (!hasAlphaNumericSpecial(password)) {
	            return "Weak"; // Missin2g at least one type of character
	        }

	        return "Strong"; // Password passes all criteria
	    }

	    private static boolean hasRepeatedCharacters(String password) {
	        for (int i = 0; i < password.length() - 1; i++) {
	            if (password.charAt(i) == password.charAt(i + 1)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static boolean hasSequenceOfThree(String password) {
	        for (int i = 0; i < password.length() - 2; i++) {
	            if (password.charAt(i) == password.charAt(i + 1) - 1 && password.charAt(i) == password.charAt(i + 2) - 2) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static boolean hasAlphaNumericSpecial(String password) {
	        Pattern alphaPattern = Pattern.compile("[a-zA-Z]");
	        Pattern numPattern = Pattern.compile("[0-9]");
	        Pattern specialPattern = Pattern.compile("[^a-zA-Z0-9]");

	        Matcher alphaMatcher = alphaPattern.matcher(password);
	        Matcher numMatcher = numPattern.matcher(password);
	        Matcher specialMatcher = specialPattern.matcher(password);

	        return alphaMatcher.find() && numMatcher.find() && specialMatcher.find();
	    }
	}



