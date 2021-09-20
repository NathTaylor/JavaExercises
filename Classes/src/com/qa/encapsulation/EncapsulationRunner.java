package com.qa.encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		Encapsulation score = new Encapsulation();
		{
			score.setWins(20);
			score.setDamage(2000000);
			score.setKills(55.9f);
			score.setWinloss(5.5);
			score.setPlayer("Zeez");

			System.out.println(score.getDamage());
			System.out.println(score.getKills());
			System.out.println(score.getWins());
			System.out.println(score.getWinloss());
			System.out.println(score.getPlayer());

			System.out.println(score.toString());
			
		}

	}

}
