package studio2;

import java.util.Scanner;

public class studio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount, winLimit;
		double winChance;
		int simulation = 0;
		int round = 1;
		int ruin = 0;
		boolean status;
		System.out.print("Input starting amount of money: ");
		startAmount = in.nextInt();

		winLimit = 50;

		while (simulation < 500) {
			System.out.println("NEW SIMULATION STARTING");
			round = 1;
			while (startAmount < winLimit && startAmount != 0) {
				System.out.println(round);
				if (Math.random() >= 0.5) {
					startAmount++;
					System.out.println("won money");
					round++;
				} else {
					startAmount--;
					System.out.println("lost money");
					round++;
				}
			}

			if (startAmount == winLimit) {
				simulation++;
				System.out.println("won");
				// break;
			} else if (startAmount == 0) {
				simulation++;
				System.out.println("lose");
				// break;
			}
//			if (startAmount == winLimit) {
//				simulation++;
//				System.out.println("Simulation " + simulation + ": " + round + " WIN " + startAmount);
//			}
//			else if (startAmount == 0) {	
//				simulation ++;
//				System.out.println("Simulation " + simulation + ": " + round + " LOSE " + startAmount);
//				ruin++;
//			}

		}
	}

}
