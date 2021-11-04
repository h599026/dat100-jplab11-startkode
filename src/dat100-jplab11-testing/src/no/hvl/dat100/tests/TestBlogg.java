package no.hvl.dat100.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;


public class TestBlogg {

	@Test
	public void testStandardConstructor() {
		Blogg samling = new Blogg();
		
		assertEquals(samling.getCount(),0);
		assertEquals(samling.getPosts().length,20);
		
	}

	@Test
	public void testConstructor() {
		Blogg samling = new Blogg(40);
		
		assertEquals(samling.getCount(),0);
		assertEquals(samling.getPosts().length,40);
	}
	
	
	@Test 
	public void testleggTil() {
		Blogg samling = new Blogg(40);
	
		TInnlegg innlegg1 = new TInnlegg(1,"Ole Olsen","23-10");
		TInnlegg innlegg2 = new TInnlegg(2,"Oline Olsen","24-10");
		TInnlegg innlegg3 = new TInnlegg(3,"Oda Olsen","24-10");
		
		assertTrue(samling.add(innlegg1));
		assertTrue(samling.add(innlegg2));
		
		assertEquals(samling.getCount(),2);
		
		assertTrue(samling.findPost(innlegg1) >= 0);
		assertTrue(samling.findPost(innlegg3) < 0);
		
		assertTrue(samling.exists(innlegg1));
		assertTrue(samling.exists(innlegg2));
		assertFalse(samling.exists(innlegg3));
		
	}
	
	@Test
	public void testledigPlass() {
		Blogg samling1 = new Blogg(40);
		Blogg samling2 = new Blogg(2);
		
		TInnlegg innlegg1 = new TInnlegg(1,"Ole Olsen","23-10");
		TInnlegg innlegg2 = new TInnlegg(2,"Oline Olsen","24-10");
		
		samling1.add(innlegg1);
		samling1.add(innlegg2);
		
		samling2.add(innlegg1);
		samling2.add(innlegg2);
		
		assertTrue(samling1.freeSpace());
		assertFalse(samling2.freeSpace());
	}
	
	@Test
	public void testutvid() {
		Blogg samling = new Blogg(2);
		
		TInnlegg innlegg1 = new TInnlegg(1,"Ole Olsen","23-10");
		TInnlegg innlegg2 = new TInnlegg(2,"Oline Olsen","24-10");

		samling.add(innlegg1);
		samling.add(innlegg2);
		
		assertEquals(samling.getCount(),2);
		assertFalse(samling.freeSpace());
		
		samling.expand();
		
		assertTrue(samling.exists(innlegg1));
		assertTrue(samling.exists(innlegg2));
		assertEquals(samling.getCount(),2);
		assertTrue(samling.freeSpace());	
	}
	
	@Test
	public void testslett() {
	
		Blogg samling = new Blogg(2);
		
		TInnlegg innlegg1 = new TInnlegg(1,"Ole Olsen","23-10");
		TInnlegg innlegg2 = new TInnlegg(2,"Oline Olsen","24-10");

		samling.add(innlegg1);
		samling.add(innlegg2);
		
		assertEquals(2,samling.getCount());
		assertTrue(samling.exists(innlegg1));
		assertTrue(samling.exists(innlegg2));
		
		samling.delete(innlegg2);
		
		assertEquals(1,samling.getCount());
		assertTrue(samling.exists(innlegg1));
		assertFalse(samling.exists(innlegg2));
	}
	
	@Test
	public void testtoString() {
		Blogg samling = new Blogg(2);
		
		Text innlegg1 = new Text(1,"Ole Olsen","23-10","en tekst");
		Image innlegg2 = new Image(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");

		samling.add(innlegg1);
		samling.add(innlegg2);
		
		String str = "2\n" + 
				"TEXT\n1\nOle Olsen\n23-10\n0\nen tekst\n" + 
				"IMAGE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";
		
		assertEquals(str,samling.toString());
		
	}
}
