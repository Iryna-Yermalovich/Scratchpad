package Entity;

import java.util.ArrayList;

public class NoteBook {

	ArrayList<Note> noteBook;
	
	public NoteBook() {
		noteBook = new ArrayList<>();
	}

///-------- Overrides -------- ///
	@Override
	public int hashCode() {
		return 0;
		/*int hash = 37;
        hash = hash * 17 + noteBook.hashCode();
		return hash;*/
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		/*if (getClass() != object.getClass())
			return false;*/
		if(!(object instanceof NoteBook)) 
			return false;
		NoteBook other = (NoteBook) object;
		if (noteBook != other.noteBook)
			return false;
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Note note : noteBook) {
			builder.append("[Text : " + note.getNoteText() + "; Priority : " + note.getNotePriority() + "; Date : "
					+ note.getNoteDate() + "]\n");
		}
		return builder.toString();
	}

/// -------- getters and setters -------- ///
	public ArrayList<Note> getNoteBook() {
		return noteBook;
	}

	public void setNoteBook(ArrayList<Note> noteBook) {
		this.noteBook = noteBook;
	}
/// ------------------------------------///

}


