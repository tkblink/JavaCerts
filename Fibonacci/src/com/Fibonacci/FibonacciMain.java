/**
 * @author Tyson Bowers
 * User inputs a number, program creates 
 * the Fibonacci Sequence up to that number.
 */
package com.Fibonacci;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		int k=0,a=1,b=1;
		Scanner sc = null;
		try{
			sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			if(k>=n) {
				break;
			}
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		}
		//Close scanner to avoid resource leak
		finally {
			if(sc!=null)
				sc.close();
		}
	}

}
