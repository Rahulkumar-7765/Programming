package com;
import java.util.*;
public class Class2 
{
	public static void main(String[] args) {
        int[] arr = {1,4,6,9,2,5,8,11,23,5,9};
        int target=10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
            	if(arr[i]+arr[j]==target)
                System.out.println(arr[i] + " " + arr[j]);  
            }
        }
	}
}



