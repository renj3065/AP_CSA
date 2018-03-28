package elevensArray;

public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoardLab();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}