package com;

public class Demo16 
{
	public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 0, 5, 1};
	        int[] arr2 = {1, 2, 4, 8, 7, 1, 2};

	        System.out.println("Index for arr1: " + findIndex(arr1));
	        System.out.println("Index for arr2: " + findIndex(arr2));
	    }

	    public static int findIndex(int[] arr) {
	        int totalSum = 0;
	        for (int num : arr) {
	            totalSum += num;
	        }

	        int leftSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            totalSum -= arr[i];
	            if (leftSum == totalSum) {
	                return i;
	            }
	            leftSum += arr[i];
	        }

	        return -1; // If no such index exists
	    }
	}



