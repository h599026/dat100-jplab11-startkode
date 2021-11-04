package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

/**
 * Oppgave 4
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-4-skrive-blogg-til-fil
 */

public class WriteBlogg {

	public static boolean write(Blogg collection, String path, String filename) {
		
		FileWriter writer = null;
		PrintWriter printWriter = null;
		boolean success;
		
		try {

			writer = new FileWriter(path + filename);
			printWriter = new PrintWriter(writer);

			printWriter.print(collection.toString());
			success = true;

		}catch(IOException e){

			System.out.println("Da e ein skrivefeil her");
			e.printStackTrace();
			success = false;

		}finally{

			printWriter.close();

		}
		
		return success;
	}
}
