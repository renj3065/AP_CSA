package elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r={"1","2","3"};
		String[] s={"Clubs","Hearts","Spades","Diamonds"};
		int[] v={1,2,3};
		Deck test1=new Deck(r,s,v);
		System.out.println(test1.deal());
		System.out.println(test1.deal());

		System.out.println(test1.deal());

		System.out.println(test1.deal());

		System.out.println(test1.deal());

		
		}
	
}
