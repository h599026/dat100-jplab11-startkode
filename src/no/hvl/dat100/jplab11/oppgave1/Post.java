package no.hvl.dat100.jplab11.oppgave1;

/**
 * Oppgave 1:
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-1---abstrakt-klasse
 */

public abstract class Post {

	private int id;
	private String userName;
	private String date;
	private int likes;
	
	public Post() {
		
	}
	
	public Post(int id, String userName, String date) {
		this.id = id;
		this.userName = userName;
		this.date = date;
	}

	public Post(int id, String userName, String date, int likes) {
		this.id = id;
		this.userName = userName;
		this.date = date;
		this.likes = likes;
	}
	
	public String getBruker() {
		return userName;
	}

	public void setBruker(String userName) {
		this.userName = userName;
	}

	public String getDato() {
		return date;
	}

	public void setDato(String date) {
		this.date = date;
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
	
	public boolean erLik(Post other) {
		return other != null && id == other.id;
	}
	
	@Override
	public String toString() {
		return id + "\n" + userName + "\n" + date + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		return "<h2>" + userName + "@" + date + " [" + likes + "]</h2>\n";	
	}
}
