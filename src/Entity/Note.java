package Entity;

import java.util.Date;

public class Note {
	
	private String noteText;
	private Date noteDate;
	private String notePriority;

	public Note() {
		// TODO Auto-generated constructor stub
	}
	
	public Note(String noteText, Date noteDate, String notePriority) {
		this.noteText = noteText;
		this.noteDate = noteDate;
		this.notePriority = notePriority;
	}

///-------- Overrides -------- ///
	@Override
	public int hashCode() {
		int hash = 37;
        hash = hash * 17 + noteText.hashCode();
        hash = hash * 17 + notePriority.hashCode();
        hash = hash * 17 + noteDate.hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		// проверяет не равен ли object null
		if (object == null)
			return false;
	/*	if (getClass() != object.getClass())
			return false;*/
		// проверяет является ли object объектом Note
		if(!(object instanceof Note)) 
			return false;
		Note note = (Note) object;
		if (noteText != note.noteText)
			return false;
		if (notePriority != note.notePriority)
			return false;
		if (noteDate != note.noteDate)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return "[Text : " + noteText + "; Priority : " + notePriority + "; Date : " + noteDate + "]";
	}
	
///-------- getters and setters -------- ///
	public String getNoteText() {
		return noteText;
	}
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	public Date getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}
	public String getNotePriority() {
		return notePriority;
	}
	public void setNotePriority(String notePriority) {
		this.notePriority = notePriority;
	}
///------------------------------------///	
}
