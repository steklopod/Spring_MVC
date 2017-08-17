package ru.manager.mvc;

public class HitCounter {

	private int hits;

	public HitCounter() {
		System.out.println("Счетчик посещений установлен");
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
}
