package com;
import java.util.Scanner;

public class Demo10 
{
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int sum = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (Character.isDigit(c)) {
	                sum += Character.getNumericValue(c);
	            }
	        }

	        System.out.println("Sum of digits in the string: " + sum);
	        scanner.close();
	    }
	}



