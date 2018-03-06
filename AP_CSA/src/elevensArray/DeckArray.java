package elevensArray;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class DeckArray {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;
	
	//Unit 9 - Array version of the Deck

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	private int fullSize;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */

	public DeckArray(String[] ranks, String[] suits, int[] values) {
		cards=new ArrayList<Card>();

		
		for (int x=0;x<ranks.length;x++){
			for(int y=0;y<suits.length;y++){
				
				cards.add(new Card(ranks[x],suits[y],values[x]));
			}
				
		}

		size=ranks.length*suits.length;
		fullSize=ranks.length*suits.length;
		System.out.println("Unshuffled Deck");
		System.out.println(this);
		
		shuffle();
		System.out.println("Shuffled Deck");

		System.out.println(this);

	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size==0)
				return true;
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		int[] indicesForCards=new int[cards.size()];
		for(int y=0;y<cards.size();y++){
			indicesForCards[y]=y;
		}
		
		ArrayList<Card> ryanHoward=new ArrayList<Card>();
		for(int z=0;z<cards.size();z++){
			ryanHoward.add(cards.get(z));
		}
		Shuffler.selectionShuffle(indicesForCards);
		for(int x=0;x<indicesForCards.length;x++){
			cards.set(x, ryanHoward.get(indicesForCards[x]));
		}
		size=fullSize;
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if(isEmpty())
			return null;
		size--;
		return cards.get(size);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";


		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		

		rtn = rtn + "\n";
		return rtn;
	}
}
