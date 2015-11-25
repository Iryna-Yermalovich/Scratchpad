package Main;

import java.util.ArrayList;

import Entity.Note;
import Entity.NoteBook;
import View.NoteBookConsoleView;

public class Scratchpad {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();
		NoteBookConsoleView  view = new NoteBookConsoleView();
		
		Note note = new Note();
		note.setNoteText("111");
		view.print(note);
		System.out.println();
		
		ArrayList<Note> list = new ArrayList<>();
		list.add(note);

		Note note1 = new Note();
		note1.setNoteText("222");
		list.add(note1);

		Note note2 = new Note();
		note2.setNoteText("333");
		list.add(note2);
		
		Note note3 = new Note();
		note3.setNoteText("444");
		list.add(note3);
		
		noteBook.setNoteBook(list);
		view.print(noteBook);
		System.out.println();

		view.print(noteBook, 2);
	}

}
