package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
	public static ArrayList<int[]> myPower(int[] A){
		ArrayList<int[]> set = new ArrayList<int[]>();
		for (int i=0; i<A.length; i++) {
			for (int j=i+1; j<=A.length; j++) {
				set.add(Arrays.copyOfRange(A, i, j));
			}
		}
		
		System.out.println("Subsets include: ");
		for(int i=0; i<set.size(); i++) {
		     System.out.println(Arrays.toString(set.get(i)));
		}

		return set;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input total number of integers: ");
		int total = scan.nextInt();
		
		System.out.println("Input numbers: ");
		int[] A = new int[total];
		for (int i=0; i<total; i++) {
			A[i] = scan.nextInt();
		}
		
		scan.close();
		myPower(A);
	}
}
