package com;
import java.util.Scanner;
public class Demo3 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int alphaCount = 0;
        int numCount = 0;
        int specialCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphaCount++;
            } else if (Character.isDigit(ch)) {
                numCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Alphabetic characters: " + alphaCount);
        System.out.println("Numeric characters: " + numCount);
        System.out.println("Special characters: " + specialCount);
    }
}


