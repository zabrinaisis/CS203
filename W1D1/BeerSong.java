public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle"; // singular
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall,");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				if (beerNum == 1) {						// Singular. Added from Original.
					word = "bottle"; 					// Singular. Added from Original.
				}
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				System.out.println("***");				// Separation. Added from Original.
			} else {
				System.out.println("No more bottles of beer on the wall.");
			} // end of else
		} // end of while
	} // end of main method
} // end class