package com;

public class Demo8 
{
	public static void main(String[] args) {
        String input = "a67JK&op#Hello";
        String output = toggleCase(input);
        System.out.println(output);
    }

    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}


