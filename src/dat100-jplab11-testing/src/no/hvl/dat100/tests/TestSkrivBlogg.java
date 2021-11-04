package no.hvl.dat100.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab11.oppgave2.Image;
import no.hvl.dat100.jplab11.oppgave2.Text;
import no.hvl.dat100.jplab11.oppgave3.*;
import no.hvl.dat100.jplab11.oppgave4.*;

public class TestSkrivBlogg {

	private static String FILNAVN = "blogg.dat";
	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/tests/";

	@Test
	public void testskriv() {
		
		Text innlegg1 = new Text(1,"Ole Olsen","23-10","en tekst");
		Image innlegg2 = new Image(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");
		
		Blogg samling = new Blogg();
		
		samling.add(innlegg1);
		samling.add(innlegg2);
		
		assertTrue(WriteBlogg.write(samling, MAPPE, FILNAVN));
	}	
}
