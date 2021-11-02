package no.hvl.dat100.tests;

import no.hvl.dat100.jplab11.oppgave1.Post;

public class TInnlegg extends Post {
	
	public TInnlegg(int id, String bruker, String dato) {
		super(id, bruker,dato);
	}

	public TInnlegg(int id, String bruker, String dato, int likes) {
		super(id, bruker,dato,likes);
	}

}
