package no.hvl.dat100.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab11.oppgave2.Image;
import no.hvl.dat100.jplab11.oppgave2.Text;
import no.hvl.dat100.jplab11.oppgave3.Blogg;
import no.hvl.dat100.jplab11.oppgave5.LesBlogg;

public class TestLesBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/tests/";

	private static String FILNAVN = "bloggkorrect.dat";
	
	@Test
	public void testles() {
		
		Blogg samling = LesBlogg.read(MAPPE,FILNAVN);

		Text innlegg1 = new Text(1,"Ole Olsen","23-10","en tekst");
		Image innlegg2 = new Image(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");
		
		assertEquals(2,samling.getCount());
		assertTrue(samling.exists(innlegg1));
		assertTrue(samling.exists(innlegg2));
		
		System.out.println(samling.toString());
	}
	
}
