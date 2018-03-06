package elevensArray;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test1=new Card("K","spades", 13);
		Card test2=new Card("K","spades",13);
		Card test3=new Card("K","clubs",13);
		
		System.out.println(test1.matches(test2));
		System.out.println(test2.matches(test3));
		System.out.println(test1.matches(test3));
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);

	}
}
