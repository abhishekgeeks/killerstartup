package Problems;
public class Euler1 {
	public static void main(String[] Args) {
		int sum = 0;
		for (int currNum = 0; currNum < 1000; currNum++) {         // Here currNum is the number we are checking
			if ((currNum % 3 == 0) || (currNum % 5 == 0)) {     // Checking wether its divisble by 3 or 5 or not
				sum += currNum;                                  // if divisible adding the num to the sum

			}

		}
		System.out.println("The sum of  multiples of 3 or 5 below 1000 is: \n" + sum);
	}

}
