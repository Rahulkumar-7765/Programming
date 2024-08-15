package com;

//import java.util.regex.Matcher;
import java.util.regex.*;

public class RegexDemo 
{
	 public static void main(String[] args) {
//	    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//	    Matcher matcher = pattern.matcher("Visit W3Schools!");
//	    boolean matchFound = matcher.find();
//	    if(matchFound) {
//	      System.out.println("Match found");
//	    } else {
//	      System.out.println("Match not found");
//	    }
		 
//		 String s="A45678dfghrytu";
//		 String regex="A.*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="ABCDEFZ";
//		 String regex=".*Z*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="kill";
//		 String regex=".i.*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="a,Ad";
//		 String regex=".[a,A].*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="E#k8Ahi";
//		 String regex="[A-Z,a-z].*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="8Ahi";
//		 String regex="[0-9].*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="#78&8Ahi";
//		 String regex="[^A-Z].*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="k9#8Ahi";
//		 String regex="[^a-z,^A-Z,^0-9].*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
//		 	 
		 
//		 String s="AAAAA";
//		 String regex="[a-z,A-Z]{5}.*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="Azde4567E";
//		 String regex="[a-z,A-Z] {4}[0-9] {3}.*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="#78&8Ahinc46482946mxb";
//		 String regex="[a-z,A-Z] {3,7}[0-9] {4,6}.*";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
//		 String s="8855641639";
//		 String regex="[6-9]{1}[0-9]{9}";
//		 boolean ans=Pattern.matches(regex, s);
//		 System.out.println(ans);
		 
		 String s="abc1234@gmailcom";
		 String regex="[a-z,A-Z] {3,5)#*[0-9] {2,4}@gmail[.]com";
		 boolean ans=Pattern.matches(regex, s);
		 System.out.println(ans);
		 	 
		 	 
		 	 
		 	 
		 	 
		 	 
	  }
	}


