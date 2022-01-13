package GuessIT;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int key;
		int choose;
		int numberOfTries = 0;
		Random r = new Random();
		key = r.nextInt(100) + 1;
		while (true) {
			System.out.print("Please guess a number between 1-100: ");
			choose = scan.nextInt();
			Objects.requireNonNull(choose, "number can not be null");
			numberOfTries++;
			if (choose < key) {
				System.out.println("GUESS GREATER!");
			} else if (choose > key) {
				System.out.println("GUESS LOWER!");
			} else if (choose == key) {
				System.out.println("Secret number was " + key + ", CONGRATULATIONS!");
				System.out.println("It took " + numberOfTries + " tries.");
				if (numberOfTries == 1) {
					System.err.println("GODLIKE!");
				}
				else if(numberOfTries <= 5 && numberOfTries != 1) {
					System.err.println("WELL DONE!");
					
				}
				else if(numberOfTries > 5 && numberOfTries < 10) {
					System.err.println("IT WAS DECENT...");
					
				}
				else if (choose == key && numberOfTries >= 10) {
					System.err.println("I'M NOT IMPRESSED :(");
					System.out.println("Secret number was " + key);
					
				}
				break;
				
			}
		}

	}

}
