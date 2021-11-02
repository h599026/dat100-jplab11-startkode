package no.hvl.dat100.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab11.oppgave2.*;

public class TestTekst {
	
	@Test
	public void testConstructor1() {
		Text tekst = new Text(1,"Ole Olsen", "23-10","en tekst");
		
		assertEquals("Ole Olsen",tekst.getBruker());
		assertEquals(1,tekst.getId());
		assertEquals(0,tekst.getLikes());
		assertEquals("23-10",tekst.getDato());
		assertEquals("en tekst",tekst.getTekst());
	}

	@Test
	public void testConstructor2() {
		Text tekst = new Text(1,"Ole Olsen", "23-10",7,"en tekst");
		
		assertEquals("Ole Olsen",tekst.getBruker());
		assertEquals(1,tekst.getId());
		assertEquals(7,tekst.getLikes());
		assertEquals("23-10",tekst.getDato());
		assertEquals("en tekst",tekst.getTekst());
	}
	
	@Test
	public void testSet() {
		Text tekst = new Text(1,"Ole Olsen", "23-10","en tekst");
		
		tekst.setTekst("ny tekst");

		assertEquals("ny tekst",tekst.getTekst());

	}
	
	@Test
	public void testToString() {
		Text tekst = new Text(1,"Ole Olsen", "23-10","en tekst");
		
		String str = "TEXT\n1\nOle Olsen\n23-10\n0\nen tekst\n";
		
		assertEquals(str,tekst.toString());
	}
	
}
