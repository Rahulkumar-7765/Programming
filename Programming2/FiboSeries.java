package com;
public class FiboSeries{
	

public static void main(String[] args) {
    int n = 5; // Number of terms in the Fibonacci series
    fibonacci(n);
}

public static void fibonacci(int n) {
    int n1 = 0, n2 = 1,sum=0;
    int i=1,fp=100,ep=1000;
    System.out.print("Fibonacci Series up to " + n + " terms: ");
    
    while(n1>=fp) {
        System.out.print(n1+" ");}
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
	}

}

