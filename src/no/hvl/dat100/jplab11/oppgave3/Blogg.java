package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Text;

/**
 * Oppgave 3
 * https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md#oppgave-3---objektsamling
 */
public class Blogg {

	String n = "\n";
	Post[] posts;
	int count;

	public Blogg() {
		posts = new Post[20];
	}

	public Blogg(int legth) {
		posts = new Post[legth];
	}

	public int getCount() {
		return count;
	}

	public Post[] getPosts() {
		return posts;
	}

	public int findPost(Post post) {
		for (int i = 0; i <= count; i++) {
			if (post.erLik(posts[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean exists(Post post) {
		for (int i = 0; i <= count; i++) {
			if (post.erLik(posts[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean freeSpace() {
		return count < posts.length;
	}

	public boolean add(Post post) {
		if(!freeSpace() || exists(post)) return false;
		posts[count++] = post;
		return true;
	}

	public String toString() {
		String s = count + n;
		for (int i = 0; i < count; i++){
			if(posts[i] != null)
				s += posts[i].toString();
		}
		return s;
	}

	// valgfrie oppgaver nedenfor

	public void expand() {
		Post[] newPosts = new Post[posts.length * 2];
		for (int i = 0; i < count; i++){
			newPosts[i] = posts[i];
		}
		posts = newPosts;
	}

	public boolean addExpand(Post post) {
		if (exists(post)) return false;
		if (!freeSpace()) expand();
		posts[count++] = post;
		return true;
	}

	public boolean delete(Post post) {

		if(!exists(post)) return false;
		int i = findPost(post) + 1;
		while(i < count){
			posts[i - 1] = posts[i++];
		}
		posts[--count] = null;
		return true;
	}

	public int[] search(String keyword) {
		int[] results = new int[count];
		int hits = 0;
		for (int i = 0; i <= count; i++){
			if(!(posts[0] instanceof Text)) continue;
			if(((Text)posts[i]).getTekst().contains(keyword)){
				results[hits++] = posts[i].getId();
			}
		}
		int[] shortResults = new int[hits];
		for(int i = 0; i <= hits; i++){
			shortResults[i] = results[i];
		}
		return shortResults;
	}

    public String toHTML() {
		String s = "";
		for(int i = 0; i < count; i++){
			s += posts[i].toHTML() + "<hr>";
		}
		return s;
    }
}