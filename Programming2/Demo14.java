package com;
import java.util.Scanner;
public class Demo14 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the distance in kilometers: ");
	        int distance = scanner.nextInt();
	        scanner.close();

	        int fare = calculateFare(distance);
	        System.out.println("The fare for the journey is: " + fare + " Rs");
	    }

	    public static int calculateFare(int distance) {
	        int totalFare = 0;
	        if (distance <= 2) {
	            totalFare = 25;
	        } else if (distance <= 7) {
	            totalFare = 25 + (distance - 2) * 15;
	        } else if (distance <= 12) {
	            totalFare = 25 + 5 * 15 + (distance - 7) * 20;
	        } else {
	            totalFare = 25 + 5 * 15 + 5 * 20 + (distance - 12) * 25;
	        }
	        return totalFare;
	    }
	}



