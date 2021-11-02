package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

/**
 * Oppgave 2
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-2---subklasser
 */

public class Image extends Text {

	private String url;
	
	public Image(int id, String userName, String date, String text, String url) {
		super(id, userName, date, text);
		this.url = url;
	}

	public Image(int id, String userName, String date, int likes, String text, String url) {
		super(id, userName, date, likes, text);
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String n = "\n";
		return "IMAGE\n" + getId() + n + getBruker() + n + getDato() + n + getLikes() + n + getTekst() + n + url + n;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
