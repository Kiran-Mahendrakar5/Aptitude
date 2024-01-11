package com.xworkz.patterns;

public class Eight {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (j == 1 || j == 5 || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || i == 5 || (i == 2 & j == 1) || (i == 4 & j == 5)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 2 && j == 4)
						|| (i == 1 && j == 5)) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3 || i == 1 || i == 5) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || i == 1 || i == 3 || (i == 2 && j == 5) || (i == 4 && j == 3) || (i == 5 && j == 4)) {
					System.out.print(" *");
				} else {
					System.out.print("  "); // Adjust the space to maintain proper spacing
				}
			}
			System.out.println();
		}
		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
//	                if (i==5&&j==1||(i==3&&j==2)||(i==1&&j==3)||(i==3&&j==4)||i==5&&j==5||(i==3&&j==3) ) {
				if (i == 1 || j == 1 || j == 5 || i == 3) {
					System.out.print(" *");
				} else {
					System.out.print("  "); // Adjust the space to maintain proper spacing
				}
			}
			System.out.println();
		}

		System.out.println("================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || j == 5 ||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4)) {
					System.out.print(" *");
				} else {
					System.out.print("  "); // Adjust the space to maintain proper spacing
				}
			}
			System.out.println();
		}

	}
}
