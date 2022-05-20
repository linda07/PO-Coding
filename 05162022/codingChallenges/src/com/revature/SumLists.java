package com.revature;

import java.util.LinkedList;
import java.util.Scanner;

public class SumLists {
	public LinkedList<Integer> reverseSum(LinkedList<Integer> lis, int len) {
		LinkedList<Integer> sum = new LinkedList<Integer>();
		int digit=0;
		int one=0;
		for (int i=0;i<len;i++) {
			int j=i+len;
			if (j>=lis.size()) {
				sum.addLast(lis.get(i));
			}
			else if (lis.get(i)+lis.get(j)<=9) {
				if (one==1 && lis.get(i)+lis.get(j)==9) {
					sum.addLast(0);
					one=1;
				}
				else {
					digit = lis.get(i)+lis.get(j)+one;
					sum.addLast(digit);
					one=0;
				}
			}
			else if (lis.get(i)+lis.get(j)>9) {
				digit = lis.get(i)+lis.get(j)+one;
				int rem = digit%10;
				sum.addLast(rem);
				one=1;
			}
			if (i==len-1 && one==1) {
				sum.addLast(1);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		SumLists ant = new SumLists();
		
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> lis = new LinkedList<Integer>();
		System.out.println("input two numbers where they have the same number of digits.");
		System.out.print("first number: ");
		String fir = scan.nextLine();
		System.out.print("second number: ");
		String sec = scan.nextLine();
		scan.close();
		
		int len=0;
		if (fir.length()>=sec.length()) {
			len = fir.length();
		}
		else {
			len = sec.length();
		}
		
		for (int i=0;i<fir.length();i++) {
			String str = String.valueOf(fir.charAt(i));
			int num = Integer.parseInt(str);
			lis.addFirst(num);
		}
		for (int i=0;i<sec.length();i++) {
			String str = String.valueOf(sec.charAt(i));
			int num = Integer.parseInt(str);
			lis.addFirst(num);
		}
		System.out.println(ant.reverseSum(lis, len));
	}
}
