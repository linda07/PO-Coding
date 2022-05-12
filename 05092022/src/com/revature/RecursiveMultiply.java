package com.revature;

import java.util.Scanner;

public class RecursiveMultiply {
	public int recurMult(int x, int y) {
		if (y == 0) {
			return 0;
		}
		if (y > 0) {
			return x+recurMult(x, y-1);
		}
		if (y < 0) {
			return -(recurMult(x, -y));
		}
		return -1;
	}
	public static void main(String[] args) {
		RecursiveMultiply rec = new RecursiveMultiply();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input first integer to multiply: ");
		int x = scan.nextInt();
		System.out.print("Input second integer to multiply: ");
		int y = scan.nextInt();
		scan.close();
		
		System.out.print("The product is " + rec.recurMult(x, y));
	}
}
