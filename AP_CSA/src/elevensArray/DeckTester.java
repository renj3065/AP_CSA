package elevensArray;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r={"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] s={"Clubs","Hearts","Spades","Diamonds"};
		int[] v={1,2,3,4,5,6,7,8,9,10,10,10,10,1};
		DeckArray test1=new DeckArray(r,s,v);
		
		System.out.println("Is empty? "+test1.isEmpty());
		System.out.println(test1.deal());
		System.out.println(test1.deal());
		System.out.println(test1.deal());

		String[] r1={"1","2","3"};
		String[] s1={"Clubs","Hearts","Spades","Diamonds"};
		int[] v1={1,2,3};
		Deck test2=new Deck(r1,s1,v1);
		
		}
	
}
