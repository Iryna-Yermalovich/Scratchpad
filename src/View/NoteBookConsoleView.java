package View;

import Entity.Note;
import Entity.NoteBook;

public class NoteBookConsoleView {

	public void print(Note note) {
		System.out.println(note.toString());
	}

	public void print(NoteBook noteBook, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(noteBook.getNoteBook().get(i).toString());
		}
	}

	public void print(NoteBook noteBook) {
		System.out.println(noteBook.toString());
	}
}
