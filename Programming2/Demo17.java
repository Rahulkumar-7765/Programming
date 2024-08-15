package com;
import java.util.HashMap;
import java.util.Map;

public class Demo17 
{
	public static void main(String[] args) {
	        String input = "abhbbacdl";
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences of each character in the string
	        for (char c : input.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print the character counts
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + "->" + entry.getValue());
	        }
	    }
	}



