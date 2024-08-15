package com;
import java.util.Scanner;
public class Demo9 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2;
	        System.out.print("Enter first number: ");
	        num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        num2 = scanner.nextDouble();
	        System.out.println("Select operation (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        double result;
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;
	        }
	        System.out.println("Result: " + result);
	        scanner.close();
	    }
	}




