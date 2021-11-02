package no.hvl.dat100.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import no.hvl.dat100.jplab11.oppgave2.Image;
import no.hvl.dat100.jplab11.oppgave2.Text;
import no.hvl.dat100.jplab11.oppgave4.SkrivBlogg;
import no.hvl.dat100.jplab11.oppgave6.HtmlBlogg;

class TestHtmlBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/tests/";
	private static String FILNAVN = "blogg.html";
	
	@Test
	public void testskriv() {
		
		Text innlegg1 = new Text(1,"Ole Olsen","23-10","DAT100 oppgave 6");
		Image innlegg2 = new Image(2,"Oline Olsen","24-10","HVL logo","https://www.west-norway.no/wp-content/uploads/2018/05/HVL-nettside.jpg");
		
		HtmlBlogg samling = new HtmlBlogg();
		
		samling.add(innlegg1);
		samling.add(innlegg2);
		
		assertTrue(SkrivBlogg.skriv(samling, MAPPE, FILNAVN));
	}	
}
