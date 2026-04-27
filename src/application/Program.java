package application;

import java.util.Scanner;

public class Program {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int option;

		do {
			showMenu();
			option = readInt("Choose an option: ");

			switch (option) {
			case 1:
				handleEvenOrOdd();
				break;
			case 2:
				handleAverage();
				break;
			case 3:
				handleGreaterNumber();
				break;
			case 4:
				handleCount();
				break;
			case 5:
				handleSumUntilN();
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option!");
			}

			System.out.println("\n============================\n");

		} while (option != 0);

		sc.close();
	}

	// ================= MENU =================

	public static void showMenu() {
		System.out.println("===== MENU =====");
		System.out.println("1 - Even or Odd");
		System.out.println("2 - Average of 3 numbers");
		System.out.println("3 - Greater number");
		System.out.println("4 - Count to N");
		System.out.println("5 - Sum until N");
		System.out.println("0 - Exit");
	}

	// ================= HANDLERS =================

	public static void handleEvenOrOdd() {
		int n = readInt("Enter a number: ");
		System.out.println("Result: " + evenOrOdd(n));
	}

	public static void handleAverage() {
		double a = readDouble("Enter first grade: ");
		double b = readDouble("Enter second grade: ");
		double c = readDouble("Enter third grade: ");
		System.out.println("Average: " + average(a, b, c));
	}

	public static void handleGreaterNumber() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		System.out.println("Greater: " + greater(a, b));
	}

	public static void handleCount() {
		int limit = readInt("Count until: ");
		if (limit < 1) {
			System.out.println("Invalid value!");
			return;
		}
		count(limit);
	}

	public static void handleSumUntilN() {
		int n = readInt("Enter a number: ");
		if (n < 1) {
			System.out.println("Invalid value!");
			return;
		}
		System.out.println("Sum: " + sumUntilN(n));
	}

	// ================= BUSINESS RULES =================

	public static String evenOrOdd(int n) {
		return (n % 2 == 0) ? "Even" : "Odd";
	}

	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	public static int greater(int a, int b) {
		return Math.max(a, b);
	}

	public static void count(int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int sumUntilN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	// ================= INPUT UTILS =================

	public static int readInt(String message) {
		while (true) {
			try {
				System.out.print(message);
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, try again.");
			}
		}
	}

	public static double readDouble(String message) {
		while (true) {
			try {
				System.out.print(message);
				return Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, try again.");
			}
		}
	}
}