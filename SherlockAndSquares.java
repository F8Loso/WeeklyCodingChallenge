package com.revature;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		for (int i = 0; i < s; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
			int square = (int) Math.sqrt(a);
			int c = square * square;
			if (c < a) {
				square++;
				c = square * square;
			}
			while (c >= a && c <= b) {
				count++;
				square++;
				c = square * square;
			}

			System.out.println(count);
		}
		sc.close();
	}

}
