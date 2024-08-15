package com;
import java.util.Scanner;
public class Demo4 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder alphabets = new StringBuilder();
        StringBuilder numerics = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                numerics.append(ch);
            } else {
                specials.append(ch);
            }
        }

        System.out.println("Output: " + alphabets.toString() + numerics.toString() + specials.toString());
    }
}


