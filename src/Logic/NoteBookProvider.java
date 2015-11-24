package Logic;

import Entity.NoteBook;

public class NoteBookProvider {

	private static NoteBook noteBook = null;
	
	public static NoteBook getInstance() {
		if(noteBook == null) {
			noteBook = new NoteBook();
		}
		return noteBook;
	}
}
