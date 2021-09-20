package com.qa.encapsulation;

public class Encapsulation {
	private int wins;
	private double winloss;
	private String player;
	private float kills;
	private long damage;

	public Encapsulation(int wins, double winloss, String player, float kills, long damage) {
		this.wins = wins;
		this.winloss = winloss;
		this.player = player;
		this.kills = kills;
		this.damage = damage;
	}

	public Encapsulation() {
		super();
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public double getWinloss() {
		return winloss;
	}

	public void setWinloss(double winloss) {
		this.winloss = winloss;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public float getKills() {
		return kills;
	}

	public void setKills(float kills) {
		this.kills = kills;
	}

	public long getDamage() {
		return damage;
	}

	public void setDamage(long damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Encapsulation [player = " + player + ", wins = " + wins + ", winloss = " + winloss + ", kills = " + kills
				+ ", damage = " + damage + "]";
	}
	
	
}
