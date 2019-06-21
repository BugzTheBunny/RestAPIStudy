package com.slava.RestStudy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	private int id;
	private int score;
	private String name;
	private int tech;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [ID:" + id + "score=" + score + ", name=" + name + ", tech=" + tech + "]";
	}

}
