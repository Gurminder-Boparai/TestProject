package coreJavaConcepts;

import java.util.*;
public class Practice2_Armstrong {
	
	public static boolean checkArmstrong(int num) {
		int digits = 0;
		int result = 0;
		int originalNumber = num;

		// number of digits calculation
		while (originalNumber != 0) {
			originalNumber /= 10;
			digits++;
		}

		originalNumber = num;

		// result contains sum of nth power of its digits
		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, digits);
			originalNumber /= 10;
		}

		if (result == num)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Start Number: ");
		int low = sc.nextInt();

		System.out.println("Enter an End Number: ");
		int high = sc.nextInt();

		System.out.println("All Armstrong Number Between Intervals of " + low + " to " + high + " are:");

		for (int number = low ; number <= high; number++) {

			if (checkArmstrong(number))
				System.out.print(number + " ");
		}
	}

}




	