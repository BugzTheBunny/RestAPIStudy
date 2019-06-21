package com.slava.RestStudy;

import java.util.ArrayList;
import java.util.List;

public class AliensRepository {

	List<Alien> aliens = new ArrayList();

	private void smallDB() {
		String[] names = { "Tom", "Bob", "Bob2", "Patrick", "Kulo" };
		int id = 0;
		for (String name : names) {
			Alien alien = new Alien();
			id++;
			alien.setId(id);
			alien.setName(name);
			alien.setScore((int) (Math.random() * 100));
			alien.setTech((int) (Math.random() * 9000));
			aliens.add(alien);
		}
	}

	public AliensRepository() {
		smallDB();
	}

	public List<Alien> getAliens() {
		for (Alien alien : aliens) {
			System.out.println(alien.toString());
		}
		return this.aliens;
	}

	public Alien getAlien(int id) {
		System.out.println(aliens.get(id).toString());
		return aliens.get(id);
	}

	public void create(Alien alien) {
		System.out.println("NEW ALIEN!" + alien.toString());
		aliens.add(alien);
	}

}
