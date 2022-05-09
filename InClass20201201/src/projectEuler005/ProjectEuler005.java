/*
 * 2520 is the smallest number that can be divided by each of the numbers 1 to 10
 *  from 1 to 10 without any remainder
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 * https://projecteuler.net/problem=5
 */
package projectEuler005;

public class ProjectEuler005 {

	public static void main(String[] args) {
		int solution;
		final long startTime = System.currentTimeMillis();
		solution = problem005();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total Execution time: " + (endTime - startTime));
		System.out.println(solution);

	}

	public static int problem005() {
		int result = 0;
		result = 2521; // Smallest positive number that divides by 1 to 10
		while (true) { // Infinite looooooop
			Boolean found;
			found = true;
			// Check result to see if it is divisible by 1 to 20 evenly
			for (int i = 2; i <= 20; i++) {
				if (result % i != 0) {
					found = false; break;
				}
			}
			// Did I find a number?
			if (found == true) {
				break;
			}
			result++;
		}

		return result;
	}
}
