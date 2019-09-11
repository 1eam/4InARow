package com.novi.minigames;

public class Player {
	private String name;
	private char token;
	private int score;
	
	public Player (String name, char token) {
		this.name = name;
		this.token = token;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public char getToken() {
		return token;
	}
	
	public int getScore() {
		return score;
	}
	
//	public void addScore
//	score ++;
}
