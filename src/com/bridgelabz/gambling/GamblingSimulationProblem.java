package com.bridgelabz.gambling;

public class GamblingSimulationProblem {
	public final static int STAKE = 100, BET = 1;
	public static int stake = 100, counterW = 0, counterL = 0;

	public static void twentyDays() {
		for (int i = 1; i <= 20; i++) {
			calculativeGambler();
		}
	}

	public static void calculativeGambler() {
		int fiftyPercent = STAKE * 50 / 100;
		while (stake > fiftyPercent && stake < (STAKE + fiftyPercent)) {
				winOrLoose();
		}
		System.out.println("the total value of the Stake is :" + stake);
		System.out.println(" the gambler won " + counterW + ":" + "\n" + " the gambler lost " + -counterL + ":");
	}

	public static void winOrLoose() {
		int random = (int) (Math.random() * 2);
		if (random == 0) {
			stake += 1;
			counterW += 1;
		} else {
			stake -= 1;
			counterL -= 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem");
		twentyDays();
		//calculativeGambler();
	}
}