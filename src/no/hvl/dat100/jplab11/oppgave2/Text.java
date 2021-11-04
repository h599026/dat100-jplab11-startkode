package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.oppgave1.*;

/**
 * Oppgave 2
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-2---subklasser
 */

public class Text extends Post {
	
	private String text;
	
	public Text () { }
	
	public Text(int id, String userName, String date, String text) {
		super(id, userName, date);
		this.text = text;
	}
	
	public Text(int id, String userName, String date, int likes, String text) {
		super(id, userName, date, likes);
		this.text = text;
	}
	
	public String getTekst() {
		return text;
	}

	public void setTekst(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TEXT\n" + super.toString() + text + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		return super.toHTML() + "<p>" + text + "</p>\n";		
	}
}
