package vacuumcleaner2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Integer[][] array = { { 0, 1, 1, 1,1 }, { 1, 1, 1, 1,1 }, { 1, 1, 1, 1,1 },{ 1, 1, 1, 1,1 } };
		

		
		Robot robi = new Robot();
		robi.setX(0);
		robi.setY(0);

		try {
			while (array[robi.getY() + 1][robi.getX()] == 1) {
				array[robi.getY() + 1][robi.getX()] = 0;
				System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
				for (int i = 0; i < array.length; i++) { // this equals to the row in our matrix.
					for (int j = 0; j < array[i].length; j++) { // this equals to the column in each row.
						System.out.print(array[i][j] + " ");
					}
					System.out.println(); // change line on console as row comes to end in the matrix.
				}
				robi.setY(robi.getY() + 1);

			}

		} catch (Exception e) {
			try {
				while (array[robi.getY()][robi.getX() + 1] == 1) {
					array[robi.getY()][robi.getX() + 1] = 0;
					System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
					for (int i = 0; i < array.length; i++) { // this equals to the row in our matrix.
						for (int j = 0; j < array[i].length; j++) { // this equals to the column in each row.
							System.out.print(array[i][j] + " ");
						}
						System.out.println(); // change line on console as row comes to end in the matrix.
					}
					robi.setX(robi.getX() + 1);

				}
			} catch (Exception e1) {
				try {
					while (array[robi.getY() - 1][robi.getX()] == 1) {
						array[robi.getY() - 1][robi.getX()] = 0;
						System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
						for (int i = 0; i < array.length; i++) { // this equals to the row in our matrix.
							for (int j = 0; j < array[i].length; j++) { // this equals to the column in each row.
								System.out.print(array[i][j] + " ");
							}
							System.out.println(); // change line on console as row comes to end in the matrix.
						}
						robi.setY(robi.getY() - 1);

					}
				} catch (Exception e2) {

					while (array[robi.getY()][robi.getX() - 1] == 1) {
						array[robi.getY()][robi.getX() - 1] = 0;
						robi.setX(robi.getX() - 1);
						System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());

						for (int i = 0; i < array.length; i++) { // this equals to the row in our matrix.
							for (int j = 0; j < array[i].length; j++) { // this equals to the column in each row.
								System.out.print(array[i][j] + " ");
							}
							System.out.println(); // change line on console as row comes to end in the matrix.
						}

					}
					System.out.println("wall is over");
				}

				
				}

	

					
				

				}
		
		System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
		while (array[robi.getY()+1][robi.getX()] == 1) {
			array[robi.getY() + 1][robi.getX()] = 0;
			robi.setY(robi.getY() + 1);
			System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
			}
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i].length; j++) { 
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		while (array[robi.getY()][robi.getX()+1] == 1) {
			array[robi.getY()][robi.getX()+1] = 0;
			robi.setX(robi.getX() + 1);
			System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
			}
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i].length; j++) { 
				System.out.print(array[i][j] + " ");
			}
			System.out.println(); 
		}
		while (array[robi.getY()-1][robi.getX()] == 1) {
			array[robi.getY() - 1][robi.getX()] = 0;
			robi.setY(robi.getY() - 1);
			System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
			}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		while (array[robi.getY()][robi.getX()-1] == 1) {
			array[robi.getY()][robi.getX()-1] = 0;
			robi.setX(robi.getX() - 1);
			System.out.println("robot coordinates: " + robi.getX() + " " + robi.getY());
			}
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(); 
		}
		robi.setX(0);
		robi.setY(0);
	}

	}
