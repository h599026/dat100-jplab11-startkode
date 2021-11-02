package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	private int id;
	private String userName;
	private String date;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String userName, String date) {
		this.id = id;
		this.userName = userName;
		this.date = date;
	}

	public Innlegg(int id, String userName, String date, int likes) {
		this.id = id;
		this.userName = userName;
		this.date = date;
		this.likes = likes;
	}
	
	public String getBruker() {
		return userName;
	}

	public void setBruker(String newUserName) {
		userName = newUserName;
	}

	public String getDato() {
		return date;
	}

	public void setDato(String newDate) {
		date = newDate;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		return innlegg != null && id == innlegg.id;
	}
	
	@Override
	public String toString() {
		return id + "\n" + userName + "\n" + date + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
