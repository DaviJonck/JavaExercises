package entities;

public class Student {
	public String name;
	public double noteA ,noteB ,noteC;
	
	public double allNotes() {
		return noteA + noteB + noteC;
	}
	
	public double missingNote() {
		if(allNotes() < 60.0) {
			return 60. - allNotes();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "Final Grade = " + allNotes();
	
	}
		
}
