package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicIndex {
	public int magic(int total, int[] A) {
		//if values are not distinct, the duplicate values may become the magic index.
		//the assumption here is that the values are distinct.
		for (int i=0; i<total; i++) {
			if (A[i] == i) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		MagicIndex m = new MagicIndex();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input total number of integers: ");
		int total = scan.nextInt();
		
		System.out.println("Input numbers: ");
		int[] A = new int[total];
		for (int i=0; i<total; i++) {
			A[i] = scan.nextInt();
		}
		
		scan.close();
		Arrays.sort(A);
		if (m.magic(total, A) == -1) {
			System.out.println("Magic index does not exist");
		}
		else {
			System.out.println("Magic index is " + m.magic(total, A));
		}
	}
}
