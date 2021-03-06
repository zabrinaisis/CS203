public class FizzBuzz {
	public static void main (String[] args) {
		for (int num = 1; num <=100; num++) {
			
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("Fizz Buzz!");					// prints if divisible by both 3 and 5
			} else {
				if (num % 3 == 0) {
					System.out.println("Fizz!");					// prints if divisible by 3
				}
				if (num % 5 == 0) {
					System.out.println("Buzz!");					// prints if divisible by 5
				}
				if (num % 3 != 0 && num % 5 != 0) {
					System.out.println(num);						// prints all other numbers
				}
			}	
		} // end for
	} // end main
} // end class

/* 
public class FizzBuzz {
	public static void main (String[] args) {
		int num = 1;
		while (num <= 100) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("Fizz Buzz!");					// prints if divisible by both 3 and 5
			} else {
				if (num % 3 == 0) {
					System.out.println("Fizz!");					// prints if divisible by 3
				}
				if (num % 5 == 0) {
					System.out.println("Buzz!");					// prints if divisible by 5
				}
				if (num % 3 != 0 && num % 5 != 0) {
					System.out.println(num);						// prints all other numbers
				}
			}
			num = num + 1;											// keeps numbers moving toward 100
		} // end while
	} // end main
} // end class
*/