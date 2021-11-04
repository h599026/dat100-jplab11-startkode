package no.hvl.dat100.jplab11.oppgave5;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

/**
 * Oppgave 5
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-5-lese-blogg-fra-fil---valgfri
 */

public class LesBlogg {

	public static Blogg read(String path, String filename) {

		Blogg blogg = new Blogg();

		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader(path + filename));
			int postCount = parseInt(reader.readLine());
			for (int i = 0; i < postCount; i++){
				String s = reader.readLine();
					switch(s){
						case "TEKST":
						blogg.add(readTextPost(reader));
						break;
						case "BILDE":
						blogg.add(readImagePost(reader));
						break;
						default:
						System.out.println("Ukjent blogg type: " + s);
						break;
					}
				}

		}catch(IOException e){

			e.printStackTrace();

		}catch(NumberFormatException e){

			e.printStackTrace();

		}
		finally{

			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return blogg;
	}

	private static Text readTextPost(BufferedReader reader) throws NumberFormatException, IOException{
		int id = parseInt(reader.readLine());
		String userName = reader.readLine();
		String date = reader.readLine();
		int likes = parseInt(reader.readLine());
		String text = reader.readLine();

		return new Text(id, userName, date, likes, text);
	}

	private static Image readImagePost(BufferedReader reader) throws NumberFormatException, IOException{
		int id = parseInt(reader.readLine());
		String userName = reader.readLine();
		String date = reader.readLine();
		int likes = parseInt(reader.readLine());
		String text = reader.readLine();
		String url = reader.readLine();

		return new Image(id, userName, date, likes, text, url);
	}

	
}
