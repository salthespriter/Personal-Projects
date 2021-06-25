// Author: Saleman Anwari
// Project Name: *Champions League Simulator*
// ChampionsLeagueSimulator.java


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ChampionsLeagueSimulator {

	// main method
	public static void main(String[] args) {
		
		System.out.println("Welcome to the UEFA Champions League Simulator!" + "\n");
		System.out.println("\n" + "Type 'start' to begin the simulation of this season's Champions League campaign." + "\n");
		menu();
	}
		
	// wait method to allow pauses between simulations
	public static void wait(int ms) {
		
		try {
			Thread.sleep(ms);
	    }
	    catch(InterruptedException ex) {
	    	Thread.currentThread().interrupt();
	    }
	}
	
	// menu method
	public static void menu() {
		
		// creates empty ArrayLists for Seed 1 clubs and Seed 2 Clubs
		ArrayList<FootballClub> Seed1 = new ArrayList<FootballClub>();
		ArrayList<FootballClub> Seed2 = new ArrayList<FootballClub>();
	
		
		// creates list of seed1 clubs
		String[] seed1clubs = {"Bayern Munich", "Sevilla", "Real Madrid", "Liverpool", "Juventus", "Paris Saint-Germain", "FC Barcelona", "Atletico Madrid", 
				"Manchester City", "Manchester United", "Borussia Dortmund", "Chelsea", "Ajax", "Inter Milan", "RB Leipzig", "Atalanta"};
		
		// creates list of seed2 clubs
		String[] seed2clubs = {"Zenit", "Porto", "Shakhtar Donetsk", "Dynamo Kiev", "Red Bull Salzburg", "Olympiacos", "Lazio", "Krasnodar", 
				"Lokomotiv Moscow", "Marseille", "Club Brugge", "Borussia Monchengladbach", "Istanbul Basaksehir", "FC Midtjylland", "Rennes", "Ferencvaros"};
		
		// creates list of seed1 leagues
		String[] seed1leagues = {"Germany", "Spain", "Spain", "England", "Italy", "France", "Spain", "Spain", 
				"England", "England", "Germany", "England", "Netherlands", "Italy", "Germany", "Italy"};
		
		// creates list of seed2 leagues
		String[] seed2leagues = {"Russia", "Portugal", "Ukraine", "Ukraine", "Austria", "Greece", "Italy", "Russia", 
				"Russia", "France", "Belgium", "Germany", "Turkey", "Denmark", "France", "Hungary"};
			
		// creates list of seed1 ratings
		Integer[] seed1ratings = {95, 86, 95, 93, 92, 94, 95, 89, 94, 89, 86, 92, 86, 86, 85, 84};
		
		// creates list of seed2 ratings
		Integer[] seed2ratings = {80, 82, 81, 79, 78, 75, 82, 75, 78, 81, 77, 81, 76, 75, 77, 75};
		

		// *Creates Seed1 and Seed2 groups*
		// for loop goes through length of seed1 clubs list (16)
		for (int i = 0; i < seed1clubs.length; i++) {
			
			// creates a new FootballClub object for Seed 1
			FootballClub club1 = new FootballClub();
			
			// sets club object name to current index of seed1clubs list
			club1.setName(seed1clubs[i]);
			// sets club object league to current index of seed1leagues list
			club1.setLeague(seed1leagues[i]);
			// sets club object rating name to current index of seed1ratings list
			club1.setRating(seed1ratings[i]);
			
			// add club object to Seed1 Arraylist
			Seed1.add(club1);
			
			
			// creates new FootballClub object for Seed 2
			FootballClub club2 = new FootballClub();
			
			// sets club object name to current index of seed2clubs list
			club2.setName(seed2clubs[i]);
			// sets club object league to current index of seed2leagues list
			club2.setLeague(seed2leagues[i]);
			// sets club object rating name to current index of seed2ratings list
			club2.setRating(seed2ratings[i]);
			
			// add club object to Seed2 Arraylist
			Seed2.add(club2);			
		}
		

		
		
		// creates ArrayLists for every group
		ArrayList<FootballClub> Group1 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group2 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group3 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group4 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group5 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group6 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group7 = new ArrayList<FootballClub>(4);
		ArrayList<FootballClub> Group8 = new ArrayList<FootballClub>(4);

		
		
		// *Draws to create Groups A - H*
		
		// draw for group 1: 2 clubs from Seed 1 and 2 clubs from Seed 2
		// chooses a random number from 0-15 as the index
		int Seed1_index = (int)(Math.random() * Seed1.size());
		// adds object that is in random index from Seed1 ArrayList into Group 1 ArrayList
		Group1.add(Seed1.get(Seed1_index));
		// remove random index from Seed1 ArrayList
		Seed1.remove(Seed1_index);
				
		
		// chooses a random number from 0-15 as the index
		int Seed1_index2 = (int)(Math.random() * Seed1.size());
		// adds object that is in random index from Seed1 ArrayList into Group 1 ArrayList
		Group1.add(Seed1.get(Seed1_index2));
		// remove random index from Seed1 ArrayList
		Seed1.remove(Seed1_index2);

		
		// chooses a random number from 0-15 as the index
		int Seed2_index = (int)(Math.random() * Seed2.size());
		// adds object that is in random index from Seed2 ArrayList into Group 1 ArrayList
		Group1.add(Seed2.get(Seed2_index));
		// remove random index from Seed2 ArrayList
		Seed2.remove(Seed2_index);
			
		
		// chooses a random number from 0-15 as the index
		int Seed2_index2 = (int)(Math.random() * Seed2.size());
		// adds object that is in random index from Seed2 ArrayList into Group 1 ArrayList
		Group1.add(Seed2.get(Seed2_index2));
		// remove random index from Seed2 ArrayList
		Seed2.remove(Seed2_index2);
		
		
		
		
		// draw for group 2
		int Seed1_index3 = (int)(Math.random() * Seed1.size());
		Group2.add(Seed1.get(Seed1_index3));
		Seed1.remove(Seed1_index3);
				
		int Seed1_index4 = (int)(Math.random() * Seed1.size());
		Group2.add(Seed1.get(Seed1_index4));
		Seed1.remove(Seed1_index4);

		int Seed2_index3 = (int)(Math.random() * Seed2.size());
		Group2.add(Seed2.get(Seed2_index3));
		Seed2.remove(Seed2_index3);
			
		int Seed2_index4 = (int)(Math.random() * Seed2.size());
		Group2.add(Seed2.get(Seed2_index4));
		Seed2.remove(Seed2_index4);
		

		
		
		// draw for group 3
		int Seed1_index5 = (int)(Math.random() * Seed1.size());
		Group3.add(Seed1.get(Seed1_index5));
		Seed1.remove(Seed1_index5);
				
		int Seed1_index6 = (int)(Math.random() * Seed1.size());
		Group3.add(Seed1.get(Seed1_index6));
		Seed1.remove(Seed1_index6);

		int Seed2_index5 = (int)(Math.random() * Seed2.size());
		Group3.add(Seed2.get(Seed2_index5));
		Seed2.remove(Seed2_index5);
			
		int Seed2_index6 = (int)(Math.random() * Seed2.size());
		Group3.add(Seed2.get(Seed2_index6));
		Seed2.remove(Seed2_index6);
		
		
		
		
		// draw for group 4
		int Seed1_index7 = (int)(Math.random() * Seed1.size());
		Group4.add(Seed1.get(Seed1_index7));
		Seed1.remove(Seed1_index7);
				
		int Seed1_index8 = (int)(Math.random() * Seed1.size());
		Group4.add(Seed1.get(Seed1_index8));
		Seed1.remove(Seed1_index8);

		int Seed2_index7 = (int)(Math.random() * Seed2.size());
		Group4.add(Seed2.get(Seed2_index7));
		Seed2.remove(Seed2_index7);
			
		int Seed2_index8 = (int)(Math.random() * Seed2.size());
		Group4.add(Seed2.get(Seed2_index8));
		Seed2.remove(Seed2_index8);
		
		
		
		
		// draw for group 5
		int Seed1_index9 = (int)(Math.random() * Seed1.size());
		Group5.add(Seed1.get(Seed1_index9));
		Seed1.remove(Seed1_index9);
				
		int Seed1_index10 = (int)(Math.random() * Seed1.size());
		Group5.add(Seed1.get(Seed1_index10));
		Seed1.remove(Seed1_index10);

		int Seed2_index9 = (int)(Math.random() * Seed2.size());
		Group5.add(Seed2.get(Seed2_index9));
		Seed2.remove(Seed2_index9);
			
		int Seed2_index10 = (int)(Math.random() * Seed2.size());
		Group5.add(Seed2.get(Seed2_index10));
		Seed2.remove(Seed2_index10);
		
		
			
		
		// draw for group 6
		int Seed1_index11 = (int)(Math.random() * Seed1.size());
		Group6.add(Seed1.get(Seed1_index11));
		Seed1.remove(Seed1_index11);
				
		int Seed1_index12 = (int)(Math.random() * Seed1.size());
		Group6.add(Seed1.get(Seed1_index12));
		Seed1.remove(Seed1_index12);

		int Seed2_index11 = (int)(Math.random() * Seed2.size());
		Group6.add(Seed2.get(Seed2_index11));
		Seed2.remove(Seed2_index11);
			
		int Seed2_index12 = (int)(Math.random() * Seed2.size());
		Group6.add(Seed2.get(Seed2_index12));
		Seed2.remove(Seed2_index12);
		
		
		
		
		// draw for group 7
		int Seed1_index13 = (int)(Math.random() * Seed1.size());
		Group7.add(Seed1.get(Seed1_index13));
		Seed1.remove(Seed1_index13);
				
		int Seed1_index14 = (int)(Math.random() * Seed1.size());
		Group7.add(Seed1.get(Seed1_index14));
		Seed1.remove(Seed1_index14);

		int Seed2_index13 = (int)(Math.random() * Seed2.size());
		Group7.add(Seed2.get(Seed2_index13));
		Seed2.remove(Seed2_index13);
			
		int Seed2_index14 = (int)(Math.random() * Seed2.size());
		Group7.add(Seed2.get(Seed2_index14));
		Seed2.remove(Seed2_index14);
		
			
			
		
		// draw for group 8
		int Seed1_index15 = (int)(Math.random() * Seed1.size());
		Group8.add(Seed1.get(Seed1_index15));
		Seed1.remove(Seed1_index15);
				
		int Seed1_index16 = (int)(Math.random() * Seed1.size());
		Group8.add(Seed1.get(Seed1_index16));
		Seed1.remove(Seed1_index16);

		int Seed2_index15 = (int)(Math.random() * Seed2.size());
		Group8.add(Seed2.get(Seed2_index15));
		Seed2.remove(Seed2_index15);
			
		int Seed2_index16 = (int)(Math.random() * Seed2.size());
		Group8.add(Seed2.get(Seed2_index16));
		Seed2.remove(Seed2_index16);
			
		
		
		// *Display for Creating Group Stage groups*
		// while true
		while (true) {
			
			// create scanner object
			Scanner scan = new Scanner(System.in);
			
			// next user input set to variable input
			String input = scan.nextLine();
						
			// if user input is "start"
			if (input.equals("start")) {
								
				// prints out messages for creating the groups
				
				System.out.println("\n" + "Creating Groups using Pot 1, Pot 2, Pot 3, and Pot 4..." + "\n");
				wait(1500);

				System.out.println("\n" + "Group A: " + "\n" + Group1.get(0) + ", " + Group1.get(1) + ", " + Group1.get(2) + ", " + Group1.get(3) + "\n");
				wait(1500);

				System.out.println("Group B: " + "\n" + Group2.get(0) + ", " + Group2.get(1) + ", " + Group2.get(2) + ", " + Group2.get(3) + "\n");
				wait(1500);

				System.out.println("Group C: " + "\n" + Group3.get(0) + ", " + Group3.get(1) + ", " + Group3.get(2) + ", " + Group3.get(3) + "\n");
				wait(1500);

				System.out.println("Group D: " + "\n" + Group4.get(0) + ", " + Group4.get(1) + ", " + Group4.get(2) + ", " + Group4.get(3) + "\n");
				wait(1500);

				System.out.println("Group E: " + "\n" + Group5.get(0) + ", " + Group5.get(1) + ", " + Group5.get(2) + ", " + Group5.get(3) + "\n");
				wait(1500);

				System.out.println("Group F: " + "\n" + Group6.get(0) + ", " + Group6.get(1) + ", " + Group6.get(2) + ", " + Group6.get(3) + "\n");
				wait(1500);

				System.out.println("Group G: " + "\n" + Group7.get(0) + ", " + Group7.get(1) + ", " + Group7.get(2) + ", " + Group7.get(3) + "\n");
				wait(1500);

				System.out.println("Group H: " + "\n" + Group8.get(0) + ", " + Group8.get(1) + ", " + Group8.get(2) + ", " + Group8.get(3) + "\n");
				wait(1000);

				// break
				break;
				
			}
			// else
			else {
				
				// invalid input
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
	
		
		
		// lists that has probabilities for goals for each team depending on the rating - in the Group Stage
		Integer[] ratings90to95_goalprob = {0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8};
		Integer[] ratings85to89_goalprob = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5};
		Integer[] ratings80to84_goalprob = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 5};
		Integer[] ratings75to79_goalprob = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4};

		
		
		// create Round of 16 ArrayLists for first place and second place teams
		ArrayList<FootballClub> ro16_group1 = new ArrayList<FootballClub>(8);
		ArrayList<FootballClub> ro16_group2 = new ArrayList<FootballClub>(8);

		
		
		
		// *Group A matches simulation*
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");
		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group A... " + "\n");

				// for loop through group 1 size (4)
				for (int i = 0; i < Group1.size(); i++) {
							
					// for loop through group 1 size (4) again
					for (int j = 0; j < Group1.size(); j++) {
				
						// if index (i) of group 1 is not equal to index (j) of group 1 - meaning it's not the same club against itself
						if (Group1.get(i) != Group1.get(j)) {
						
							// create FootballClub object with variable name 'home' and set it equal to index (i) in Group 1 ArrayList		
							FootballClub home = Group1.get(i);
							// create FootballClub object with variable name 'away' and set it equal to index (j) in Group 1 ArrayList		
							FootballClub away = Group1.get(j);
							
							// create variables for home team goals and away team goals and set to 0
							int home_goals = 0;
							int away_goals = 0;
							
							
							// if rating of home club is 90 or above
							if (home.getRating() >= 90) {
								
								// generate random number from 0-25 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								
								// set home_goals to ratings list with random index (goal_index)
								home_goals = ratings90to95_goalprob[goal_index];

							}
							// else if rating of home club is between 85 and 89
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								// generate random number from 0-13 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								
								// set home_goals to ratings list with random index (goal_index)
								home_goals = ratings85to89_goalprob[goal_index];
							}
							// else if rating of home club is between 80 and 84
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								// generate random number from 0-13 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								
								// set home_goals to ratings list with random index (goal_index)
								home_goals = ratings80to84_goalprob[goal_index];
							}
							// else if rating of home club is less than 80
							else if (home.getRating() < 80) {
								
								// generate random number from 0-21 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								
								// set home_goals to ratings list with random index (goal_index)
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							
							// if rating of away club is 90 or above
							if (away.getRating() >= 90) {
								
								// generate random number from 0-25 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								
								// set away_goals to ratings list with random index (goal_index)
								away_goals = ratings90to95_goalprob[goal_index];

							}
							// else if rating of away club is between 85 and 89
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								// generate random number from 0-13 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								
								// set away_goals to ratings list with random index (goal_index)
								away_goals = ratings85to89_goalprob[goal_index];
							}
							// else if rating of away club is between 80 and 84
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								// generate random number from 0-13 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								
								// set away_goals to ratings list with random index (goal_index)
								away_goals = ratings80to84_goalprob[goal_index];
							}
							// else if rating of away club is less than 80
							else if (away.getRating() < 80) {
								
								// generate random number from 0-21 and set to goal_index
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								
								// set away_goals to ratings list with random index (goal_index)
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							// print out format showing score of match
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							// set home club's goals scored setter to (getter goals scored + home goals scored in match)
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							// set away club's goals scored setter to (getter goals scored + away goals scored in match)
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							// set home club's goals conceded setter to (getter goals conceded + away goals scored in match)
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							// set away club's goals conceded setter to (getter goals conceded + home goals scored in match)
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							
							// set home club's matches played setter to (getter matches played + 1)
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							// set away club's matches played setter to (getter matches played + 1)
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

						
						
							// if home goals scored in match is more than away goals scored in match
							if (home_goals > away_goals) {
							
								// set home club points setter to (getter points + 3)
								home.setPoints(home.getPoints()+3);
								// set home club win count setter to (getter win count + 1)
								home.setWinCount(home.getWinCount()+1);
								
								// set away club loss count setter to (getter loss count + 1)
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							// else if away goals scored in match is more than home goals scored in match
							else if (away_goals > home_goals) {
								
								// set away club points setter to (getter points + 3)
								away.setPoints(away.getPoints()+3);
								// set away club win count setter to (getter win count + 1)
								away.setWinCount(away.getWinCount()+1);
								
								// set home club loss count setter to (getter loss count + 1)
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							// else (draw)
							else {
								
								// set home club points setter to (getter points + 1)
								home.setPoints(home.getPoints()+1);
								// set away club points setter to (getter points + 1)
								away.setPoints(away.getPoints()+1);
								
								// set home club draw count setter to (getter draw count + 1)
								home.setDrawCount(home.getDrawCount()+1);
								// set away club draw count setter to (getter draw count + 1)
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group A*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group A." + "\n");

		while (true) {
					
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group A Standings: " + "\n");
				// Use CustomComparator created to sort Group A in order of points (and then goal difference)
				Collections.sort(Group1, new CustomComparator());

				for (int i = 0; i < Group1.size(); i++) {
				
					// print out format of standings
					System.out.println("Club: " + Group1.get(i).getName() + "	MP: " + Group1.get(i).getMatchesPlayed() + ", W: " + 
							Group1.get(i).getWinCount() + ", D: " + Group1.get(i).getDrawCount() + ", L: " + Group1.get(i).getDefeatCount() + 
							", GF: " + Group1.get(i).getScoredGoalsCount() + ", GA: " + Group1.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group1.get(i).getScoredGoalsCount() - Group1.get(i).getReceivedGoalsCount()) + ", Pts: " + Group1.get(i).getPoints());
				}
			
				// add the first place club t ro16_group1 ArrayList and the second place club to ro16_group2 ArrayList
				ro16_group1.add(Group1.get(0));
				ro16_group2.add(Group1.get(1));

				// print out the 2 clubs that advance to the Round of 16
				System.out.println("\n" + Group1.get(0).getName() + " and " + Group1.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group B matches simulation*
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group B... " + "\n");

				for (int i = 0; i < Group2.size(); i++) {
							
					for (int j = 0; j < Group2.size(); j++) {
				
						if (Group2.get(i) != Group2.get(j)) {
						
							FootballClub home = Group2.get(i);
							FootballClub away = Group2.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);	
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

						
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}

		
		// *Display Group Standings for Group B*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group B." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group B Standings: " + "\n");
				Collections.sort(Group2, new CustomComparator());

				for (int i = 0; i < Group2.size(); i++) {
				
					System.out.println("Club: " + Group2.get(i).getName() + "	MP: " + Group2.get(i).getMatchesPlayed() + ", W: " + 
							Group2.get(i).getWinCount() + ", D: " + Group2.get(i).getDrawCount() + ", L: " + Group2.get(i).getDefeatCount() + 
							", GF: " + Group2.get(i).getScoredGoalsCount() + ", GA: " + Group2.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group2.get(i).getScoredGoalsCount() - Group2.get(i).getReceivedGoalsCount()) + ", Pts: " + Group2.get(i).getPoints());
				}
			
				ro16_group1.add(Group2.get(0));
				ro16_group2.add(Group2.get(1));
				
				System.out.println("\n" + Group2.get(0).getName() + " and " + Group2.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group C matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group C... " + "\n");

				for (int i = 0; i < Group3.size(); i++) {
							
					for (int j = 0; j < Group3.size(); j++) {
				
						if (Group3.get(i) != Group3.get(j)) {
						
							FootballClub home = Group3.get(i);
							FootballClub away = Group3.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

						
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group C*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group C." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group C Standings: " + "\n");
				Collections.sort(Group3, new CustomComparator());

				for (int i = 0; i < Group3.size(); i++) {
				
					System.out.println("Club: " + Group3.get(i).getName() + "	MP: " + Group3.get(i).getMatchesPlayed() + ", W: " + 
							Group3.get(i).getWinCount() + ", D: " + Group3.get(i).getDrawCount() + ", L: " + Group3.get(i).getDefeatCount() + 
							", GF: " + Group3.get(i).getScoredGoalsCount() + ", GA: " + Group3.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group3.get(i).getScoredGoalsCount() - Group3.get(i).getReceivedGoalsCount()) + ", Pts: " + Group3.get(i).getPoints());
				}
			
				ro16_group1.add(Group3.get(0));
				ro16_group2.add(Group3.get(1));
				
				System.out.println("\n" + Group3.get(0).getName() + " and " + Group3.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group D matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group D... " + "\n");

				for (int i = 0; i < Group4.size(); i++) {
							
					for (int j = 0; j < Group4.size(); j++) {
				
						if (Group4.get(i) != Group4.get(j)) {
						
							FootballClub home = Group4.get(i);
							FootballClub away = Group4.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

						
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group D*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group D." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group D Standings: " + "\n");
				Collections.sort(Group4, new CustomComparator());

				for (int i = 0; i < Group4.size(); i++) {
				
					System.out.println("Club: " + Group4.get(i).getName() + "	MP: " + Group4.get(i).getMatchesPlayed() + ", W: " + 
							Group4.get(i).getWinCount() + ", D: " + Group4.get(i).getDrawCount() + ", L: " + Group4.get(i).getDefeatCount() + 
							", GF: " + Group4.get(i).getScoredGoalsCount() + ", GA: " + Group4.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group4.get(i).getScoredGoalsCount() - Group4.get(i).getReceivedGoalsCount()) + ", Pts: " + Group4.get(i).getPoints());
				}
			
				ro16_group1.add(Group4.get(0));
				ro16_group2.add(Group4.get(1));
				
				System.out.println("\n" + Group4.get(0).getName() + " and " + Group4.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group E matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group E... " + "\n");

				for (int i = 0; i < Group5.size(); i++) {
							
					for (int j = 0; j < Group5.size(); j++) {
				
						if (Group5.get(i) != Group5.get(j)) {
						
							FootballClub home = Group5.get(i);
							FootballClub away = Group5.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

						
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group E*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group E." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group E Standings: " + "\n");
				Collections.sort(Group5, new CustomComparator());

				for (int i = 0; i < Group5.size(); i++) {
				
					System.out.println("Club: " + Group5.get(i).getName() + "	MP: " + Group5.get(i).getMatchesPlayed() + ", W: " + 
							Group5.get(i).getWinCount() + ", D: " + Group5.get(i).getDrawCount() + ", L: " + Group5.get(i).getDefeatCount() + 
							", GF: " + Group5.get(i).getScoredGoalsCount() + ", GA: " + Group5.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group5.get(i).getScoredGoalsCount() - Group5.get(i).getReceivedGoalsCount()) + ", Pts: " + Group5.get(i).getPoints());
				}
			
				ro16_group1.add(Group5.get(0));
				ro16_group2.add(Group5.get(1));
				
				System.out.println("\n" + Group5.get(0).getName() + " and " + Group5.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group F matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group F... " + "\n");

				for (int i = 0; i < Group6.size(); i++) {
							
					for (int j = 0; j < Group6.size(); j++) {
				
						if (Group6.get(i) != Group6.get(j)) {
						
							FootballClub home = Group6.get(i);
							FootballClub away = Group6.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

											
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group F*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group F." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group F Standings: " + "\n");
				Collections.sort(Group6, new CustomComparator());

				for (int i = 0; i < Group6.size(); i++) {
				
					System.out.println("Club: " + Group6.get(i).getName() + "	MP: " + Group6.get(i).getMatchesPlayed() + ", W: " + 
							Group6.get(i).getWinCount() + ", D: " + Group6.get(i).getDrawCount() + ", L: " + Group6.get(i).getDefeatCount() + 
							", GF: " + Group6.get(i).getScoredGoalsCount() + ", GA: " + Group6.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group6.get(i).getScoredGoalsCount() - Group6.get(i).getReceivedGoalsCount()) + ", Pts: " + Group6.get(i).getPoints());
				}
			
				ro16_group1.add(Group6.get(0));
				ro16_group2.add(Group6.get(1));
				
				System.out.println("\n" + Group6.get(0).getName() + " and " + Group6.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group G matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group G... " + "\n");

				for (int i = 0; i < Group7.size(); i++) {
							
					for (int j = 0; j < Group7.size(); j++) {
				
						if (Group7.get(i) != Group7.get(j)) {
						
							FootballClub home = Group7.get(i);
							FootballClub away = Group7.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

											
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group G*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group G." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group G Standings: " + "\n");
				Collections.sort(Group7, new CustomComparator());

				for (int i = 0; i < Group7.size(); i++) {
				
					System.out.println("Club: " + Group7.get(i).getName() + "	MP: " + Group7.get(i).getMatchesPlayed() + ", W: " + 
							Group7.get(i).getWinCount() + ", D: " + Group7.get(i).getDrawCount() + ", L: " + Group7.get(i).getDefeatCount() + 
							", GF: " + Group7.get(i).getScoredGoalsCount() + ", GA: " + Group7.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group7.get(i).getScoredGoalsCount() - Group7.get(i).getReceivedGoalsCount()) + ", Pts: " + Group7.get(i).getPoints());
				}
			
				ro16_group1.add(Group7.get(0));
				ro16_group2.add(Group7.get(1));
				
				System.out.println("\n" + Group7.get(0).getName() + " and " + Group7.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		// *Group H matches simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for each club in Group H... " + "\n");

				for (int i = 0; i < Group8.size(); i++) {
							
					for (int j = 0; j < Group8.size(); j++) {
				
						if (Group8.get(i) != Group8.get(j)) {
						
							FootballClub home = Group8.get(i);
							FootballClub away = Group8.get(j);
						
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								home_goals = ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								home_goals = ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								home_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(26);
								away_goals = ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(14);
								away_goals = ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(22);
								away_goals = ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							home.setRecievedGoalsCount(home.getReceivedGoalsCount() + away_goals);
							away.setRecievedGoalsCount(away.getReceivedGoalsCount() + home_goals);
							home.setMatchesPlayed(home.getMatchesPlayed()+1);
							away.setMatchesPlayed(away.getMatchesPlayed()+1);

									
							if (home_goals > away_goals) {
							
								home.setPoints(home.getPoints()+3);
								home.setWinCount(home.getWinCount()+1);
								away.setDefeatCount(away.getDefeatCount()+1);
							
							}
							else if (away_goals > home_goals) {
								away.setPoints(away.getPoints()+3);
								away.setWinCount(away.getWinCount()+1);
								home.setDefeatCount(home.getDefeatCount()+1);
							}
							else {
								home.setPoints(home.getPoints()+1);
								away.setPoints(away.getPoints()+1);
								home.setDrawCount(home.getDrawCount()+1);
								away.setDrawCount(away.getDrawCount()+1);
							}
						}			
					}			
				}
				
				break;		
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display Group Standings for Group H*
		wait(1000);
		System.out.println("\n" + "Type 'next' to see the Group Standings for Group H." + "\n");

		while (true) {
						
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Group H Standings: " + "\n");
				Collections.sort(Group8, new CustomComparator());

				for (int i = 0; i < Group8.size(); i++) {
				
					System.out.println("Club: " + Group8.get(i).getName() + "	MP: " + Group8.get(i).getMatchesPlayed() + ", W: " + 
							Group8.get(i).getWinCount() + ", D: " + Group8.get(i).getDrawCount() + ", L: " + Group8.get(i).getDefeatCount() + 
							", GF: " + Group8.get(i).getScoredGoalsCount() + ", GA: " + Group8.get(i).getReceivedGoalsCount() + ", GD: " + 
							(Group8.get(i).getScoredGoalsCount() - Group8.get(i).getReceivedGoalsCount()) + ", Pts: " + Group8.get(i).getPoints());
				}
			
				ro16_group1.add(Group8.get(0));
				ro16_group2.add(Group8.get(1));
				
				System.out.println("\n" + Group8.get(0).getName() + " and " + Group8.get(1).getName() + " " + "advance to the Round of 16!" + "\n");
				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		
		
		// ArrayLists for RO16 draws created
		ArrayList<FootballClub> RO16_D1 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D2 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D3 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D4 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D5 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D6 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D7 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> RO16_D8 = new ArrayList<FootballClub>(2);
		
		
		
		// *Draws to create Round of 16 Ties*
		// clubs cannot be from the same league

		// draw for tie 1: 1 club from Group 1 and 1 club from Group 2		
		// chooses a random number from 0-7 as the index
		int g1_index = (int)(Math.random() * ro16_group1.size());
		// adds object that is in random index (g1_index) from ro16_group1 ArrayList into RO16_D1 ArrayList
		RO16_D1.add(ro16_group1.get(g1_index));				
				
		// while true
		while (true) {
			
			// chooses a random number from 0-7 as the index
			int g2_index = (int)(Math.random() * ro16_group2.size());

			// if league of club in random index (g2_index) of ro16_group2 ArrayList is not equal to league of club in random index (g1_index) of ro16_group1
			if (ro16_group2.get(g2_index).getLeague() != ro16_group1.get(g1_index).getLeague()) {

				// remove club in random index (g1_index) from ro16_group1 ArrayList
				ro16_group1.remove(g1_index);

				// adds object that is in random index (g2_index) from ro16_group2 ArrayList into RO16_D1 ArrayList
				RO16_D1.add(ro16_group2.get(g2_index));
				// remove club in random index (g2_index) from ro16_group2 ArrayList
				ro16_group2.remove(g2_index);
				
				// break
				break;
			}
		}
		
		
		
		// draw for tie 2
		int g3_index = (int)(Math.random() * ro16_group1.size());
		RO16_D2.add(ro16_group1.get(g3_index));
						
		while (true) {
			
			int g4_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g4_index).getLeague() != ro16_group1.get(g3_index).getLeague()) {

				ro16_group1.remove(g3_index);

				RO16_D2.add(ro16_group2.get(g4_index));
				ro16_group2.remove(g4_index);
				
				break;
			}
		}
		

		
		// draw for tie 3
		int g5_index = (int)(Math.random() * ro16_group1.size());
		RO16_D3.add(ro16_group1.get(g5_index));
				
		while (true) {
			
			int g6_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g6_index).getLeague() != ro16_group1.get(g5_index).getLeague()) {

				ro16_group1.remove(g5_index);

				RO16_D3.add(ro16_group2.get(g6_index));
				ro16_group2.remove(g6_index);
				
				break;
			}
		}
				
		
		
		// draw for tie 4
		int g7_index = (int)(Math.random() * ro16_group1.size());
		RO16_D4.add(ro16_group1.get(g7_index));
				
		while (true) {
			
			int g8_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g8_index).getLeague() != ro16_group1.get(g7_index).getLeague()) {

				ro16_group1.remove(g7_index);

				RO16_D4.add(ro16_group2.get(g8_index));
				ro16_group2.remove(g8_index);
				
				break;
			}
		}
				
		
		
		// draw for tie 5
		int g9_index = (int)(Math.random() * ro16_group1.size());
		RO16_D5.add(ro16_group1.get(g9_index));				
				
		while (true) {
			
			int g10_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g10_index).getLeague() != ro16_group1.get(g9_index).getLeague()) {

				ro16_group1.remove(g9_index);

				RO16_D5.add(ro16_group2.get(g10_index));
				ro16_group2.remove(g10_index);
				
				break;
			}
		}
		
		
		
		// draw for tie 6
		int g11_index = (int)(Math.random() * ro16_group1.size());
		RO16_D6.add(ro16_group1.get(g11_index));
					
		while (true) {
			
			int g12_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g12_index).getLeague() != ro16_group1.get(g11_index).getLeague()) {

				ro16_group1.remove(g11_index);

				RO16_D6.add(ro16_group2.get(g12_index));
				ro16_group2.remove(g12_index);
				
				break;
			}
		}
		
		
		
		// draw for tie 7
		int g13_index = (int)(Math.random() * ro16_group1.size());
		RO16_D7.add(ro16_group1.get(g13_index));
					
		while (true) {
			
			int g14_index = (int)(Math.random() * ro16_group2.size());

			if (ro16_group2.get(g14_index).getLeague() != ro16_group1.get(g13_index).getLeague()) {

				ro16_group1.remove(g13_index);

				RO16_D7.add(ro16_group2.get(g14_index));
				ro16_group2.remove(g14_index);
				
				break;
			}
		}
		
		
		
		// draw for tie 8	
		int g15_index = (int)(Math.random() * ro16_group1.size());
		RO16_D8.add(ro16_group1.get(g15_index));	
		ro16_group1.remove(g15_index);

		int g16_index = (int)(Math.random() * ro16_group2.size());
		RO16_D8.add(ro16_group2.get(g16_index));
		ro16_group2.remove(g16_index);
		
		
		
		
		// *Display for Creating Round of 16 ties*
		System.out.println("\n" + "Type 'next' to draw the Round of 16 match-ups." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Round of 16 Fixtures: " + "\n");
				wait(1000);

				System.out.println("\n" + RO16_D1.get(0).getName() + " vs " + RO16_D1.get(1).getName() + "\n");	
				wait(1000);

				System.out.println(RO16_D2.get(0).getName() + " vs " + RO16_D2.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D3.get(0).getName() + " vs " + RO16_D3.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D4.get(0).getName() + " vs " + RO16_D4.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D5.get(0).getName() + " vs " + RO16_D5.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D6.get(0).getName() + " vs " + RO16_D6.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D7.get(0).getName() + " vs " + RO16_D7.get(1).getName() + "\n");
				wait(1000);

				System.out.println(RO16_D8.get(0).getName() + " vs " + RO16_D8.get(1).getName() + "\n");
				wait(1000);

				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		// lists that has probabilities for goals for each team depending on the rating - in the Knockout Stages
		Integer[] KO_ratings90to95_goalprob = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 6};
		Integer[] KO_ratings85to89_goalprob = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
		Integer[] KO_ratings80to84_goalprob = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 3};
		Integer[] KO_ratings75to79_goalprob = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2};
		
		
		
		// reset goals scored for each club remaining	
		for (int i = 0; i < RO16_D1.size(); i++) {
			
			RO16_D1.get(i).setScoredGoalsCount(0);
			RO16_D2.get(i).setScoredGoalsCount(0);
			RO16_D3.get(i).setScoredGoalsCount(0);
			RO16_D4.get(i).setScoredGoalsCount(0);
			RO16_D5.get(i).setScoredGoalsCount(0);
			RO16_D6.get(i).setScoredGoalsCount(0);
			RO16_D7.get(i).setScoredGoalsCount(0);
			RO16_D8.get(i).setScoredGoalsCount(0);
		}
		
		
				
		// create ArrayList for QF clubs
		ArrayList<FootballClub> QF_Clubs = new ArrayList<FootballClub>(8);
		
		
		
		
		
		// *Round of 16 Tie 1 match simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		// everything is the same as the group stage matches except it loops through 2 teams instead of 4
		// also the away goals rule is implemented
		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D1.get(0).getName() + " vs " + RO16_D1.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D1.size(); i++) {
							
					for (int j = 0; j < RO16_D1.size(); j++) {
				
						if (RO16_D1.get(i) != RO16_D1.get(j)) {
						
							FootballClub home = RO16_D1.get(i);
							FootballClub away = RO16_D1.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							// set away club's away goals scored setter to (getter away goals scored + away goals scored in match)
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
						
		
		// *Display which club advances to the Quarter-finals from Tie 1*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D1.get(0).getName() + " " + RO16_D1.get(0).getScoredGoalsCount() + " - " + RO16_D1.get(1).getScoredGoalsCount() + " " + RO16_D1.get(1).getName() + "\n");
				
		wait(1000);

		// if club 1 scored more goals than club 2 in total
		if (RO16_D1.get(0).getScoredGoalsCount() > RO16_D1.get(1).getScoredGoalsCount()) {
					
			// club 1 advances to the quarter-finals
			System.out.println("\n" + RO16_D1.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
	
			// add club 1 to ArrayList QF_Clubs
			QF_Clubs.add(RO16_D1.get(0));
		}
		// else if club 1 scored less goals than club 2 in total
		else if (RO16_D1.get(0).getScoredGoalsCount() < RO16_D1.get(1).getScoredGoalsCount()) {
					
			// club 2 advances to the quarter-finals
			System.out.println("\n" + RO16_D1.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			// add club 2 to ArrayList QF_Clubs
			QF_Clubs.add(RO16_D1.get(1));
		}
		// else they are tied on aggregate
		else {
					
//			// if club 1 scored more away goals than club 2
//			if (RO16_D1.get(0).getScoredAwayGoals() > RO16_D1.get(1).getScoredAwayGoals()) {
//						
//				// club 1 advances to the quarter-finals
//				System.out.println("\n" + RO16_D1.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//
//				// add club 1 to ArrayList QF_Clubs
//				QF_Clubs.add(RO16_D1.get(0));
//			}
//			// else if club 1 scored less away goals than club 2
//			else if (RO16_D1.get(0).getScoredAwayGoals() < RO16_D1.get(1).getScoredAwayGoals()) {
//						
//				// club 2 advances to the quarter-finals
//				System.out.println("\n" + RO16_D1.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				// add club 2 to ArrayList QF_Clubs
//				QF_Clubs.add(RO16_D1.get(1));
//			}
//			// else they both have the same amount of away goals
//			else {
				
				// choose a random number between 0 and 1 (50% chance)
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				// the club that advances to the quarter-finals is randomly chosen using the random index (pen_index)
				System.out.println("\n" + RO16_D1.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				// add random club to ArrayList QF_Clubs
				QF_Clubs.add(RO16_D1.get(pen_index));	
			//}
		}
			
			
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 2 match simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D2.get(0).getName() + " vs " + RO16_D2.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D2.size(); i++) {
							
					for (int j = 0; j < RO16_D2.size(); j++) {
				
						if (RO16_D2.get(i) != RO16_D2.get(j)) {
						
							FootballClub home = RO16_D2.get(i);
							FootballClub away = RO16_D2.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);	
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);	
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Quarter-finals from Tie 2*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D2.get(0).getName() + " " + RO16_D2.get(0).getScoredGoalsCount() + " - " + RO16_D2.get(1).getScoredGoalsCount() + " " + RO16_D2.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D2.get(0).getScoredGoalsCount() > RO16_D2.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D2.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D2.get(0));
		}
		else if (RO16_D2.get(0).getScoredGoalsCount() < RO16_D2.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D2.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D2.get(1));
		}
		else {
					
//			if (RO16_D2.get(0).getScoredAwayGoals() > RO16_D2.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D2.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D2.get(0));
//			}
//			else if (RO16_D2.get(0).getScoredAwayGoals() < RO16_D2.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D2.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D2.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D2.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D2.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		

		// *Round of 16 Tie 3 match simulation*	
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D3.get(0).getName() + " vs " + RO16_D3.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D3.size(); i++) {
							
					for (int j = 0; j < RO16_D3.size(); j++) {
				
						if (RO16_D3.get(i) != RO16_D3.get(j)) {
						
							FootballClub home = RO16_D3.get(i);
							FootballClub away = RO16_D3.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);	
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display which club advances to the Quarter-finals from Tie 3*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D3.get(0).getName() + " " + RO16_D3.get(0).getScoredGoalsCount() + " - " + RO16_D3.get(1).getScoredGoalsCount() + " " + RO16_D3.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D3.get(0).getScoredGoalsCount() > RO16_D3.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D3.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D3.get(0));
		}
		else if (RO16_D3.get(0).getScoredGoalsCount() < RO16_D3.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D3.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D3.get(1));
		}
		else {
					
//			if (RO16_D3.get(0).getScoredAwayGoals() > RO16_D3.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D3.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D3.get(0));
//			}
//			else if (RO16_D3.get(0).getScoredAwayGoals() < RO16_D3.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D3.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D3.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D3.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D3.get(pen_index));	
			//}
		}
	
		
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 4 match simulation*
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D4.get(0).getName() + " vs " + RO16_D4.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D4.size(); i++) {
							
					for (int j = 0; j < RO16_D4.size(); j++) {
				
						if (RO16_D4.get(i) != RO16_D4.get(j)) {
						
							FootballClub home = RO16_D4.get(i);
							FootballClub away = RO16_D4.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);		
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
				
		
		// *Display which club advances to the Quarter-finals from Tie 4*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D4.get(0).getName() + " " + RO16_D4.get(0).getScoredGoalsCount() + " - " + RO16_D4.get(1).getScoredGoalsCount() + " " + RO16_D4.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D4.get(0).getScoredGoalsCount() > RO16_D4.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D4.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D4.get(0));
		}
		else if (RO16_D4.get(0).getScoredGoalsCount() < RO16_D4.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D4.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D4.get(1));
		}
		else {
					
//			if (RO16_D4.get(0).getScoredAwayGoals() > RO16_D4.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D4.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D4.get(0));
//			}
//			else if (RO16_D4.get(0).getScoredAwayGoals() < RO16_D4.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D4.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D4.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D4.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D4.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 5 match simulation*
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D5.get(0).getName() + " vs " + RO16_D5.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D5.size(); i++) {
							
					for (int j = 0; j < RO16_D5.size(); j++) {
				
						if (RO16_D5.get(i) != RO16_D5.get(j)) {
						
							FootballClub home = RO16_D5.get(i);
							FootballClub away = RO16_D5.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);	
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);					
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Quarter-finals from Tie 5*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D5.get(0).getName() + " " + RO16_D5.get(0).getScoredGoalsCount() + " - " + RO16_D5.get(1).getScoredGoalsCount() + " " + RO16_D5.get(1).getName() + "\n");

		wait(1000);
		
		if (RO16_D5.get(0).getScoredGoalsCount() > RO16_D5.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D5.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D5.get(0));
		}
		else if (RO16_D5.get(0).getScoredGoalsCount() < RO16_D5.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D5.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D5.get(1));
		}
		else {
					
//			if (RO16_D5.get(0).getScoredAwayGoals() > RO16_D5.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D5.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D5.get(0));
//			}
//			else if (RO16_D5.get(0).getScoredAwayGoals() < RO16_D5.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D5.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D5.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D5.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D5.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 6 match simulation*
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D6.get(0).getName() + " vs " + RO16_D6.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D6.size(); i++) {
							
					for (int j = 0; j < RO16_D6.size(); j++) {
				
						if (RO16_D6.get(i) != RO16_D6.get(j)) {
						
							FootballClub home = RO16_D6.get(i);
							FootballClub away = RO16_D6.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);			
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
//							away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);				
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Quarter-finals from Tie 6*
		wait(1000);

		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D6.get(0).getName() + " " + RO16_D6.get(0).getScoredGoalsCount() + " - " + RO16_D6.get(1).getScoredGoalsCount() + " " + RO16_D6.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D6.get(0).getScoredGoalsCount() > RO16_D6.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D6.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D6.get(0));
		}
		else if (RO16_D6.get(0).getScoredGoalsCount() < RO16_D6.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D6.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D6.get(1));
		}
		else {
					
//			if (RO16_D6.get(0).getScoredAwayGoals() > RO16_D6.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D6.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D6.get(0));
//			}
//			else if (RO16_D6.get(0).getScoredAwayGoals() < RO16_D6.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D6.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D6.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D6.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D6.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 7 match simulation*		
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D7.get(0).getName() + " vs " + RO16_D7.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D7.size(); i++) {
							
					for (int j = 0; j < RO16_D7.size(); j++) {
				
						if (RO16_D7.get(i) != RO16_D7.get(j)) {
						
							FootballClub home = RO16_D7.get(i);
							FootballClub away = RO16_D7.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);			
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);				
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Quarter-finals from Tie 7*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D7.get(0).getName() + " " + RO16_D7.get(0).getScoredGoalsCount() + " - " + RO16_D7.get(1).getScoredGoalsCount() + " " + RO16_D7.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D7.get(0).getScoredGoalsCount() > RO16_D7.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D7.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D7.get(0));
		}
		else if (RO16_D7.get(0).getScoredGoalsCount() < RO16_D7.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D7.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D7.get(1));
		}
		else {
					
//			if (RO16_D7.get(0).getScoredAwayGoals() > RO16_D7.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D7.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D7.get(0));
//			}
//			else if (RO16_D7.get(0).getScoredAwayGoals() < RO16_D7.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D7.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D7.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D7.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D7.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Round of 16 Tie 8 match simulation*		
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + RO16_D8.get(0).getName() + " vs " + RO16_D8.get(1).getName() + "... \n");

				for (int i = 0; i < RO16_D8.size(); i++) {
							
					for (int j = 0; j < RO16_D8.size(); j++) {
				
						if (RO16_D8.get(i) != RO16_D8.get(j)) {
						
							FootballClub home = RO16_D8.get(i);
							FootballClub away = RO16_D8.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);						
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Quarter-finals from Tie 8*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + RO16_D8.get(0).getName() + " " + RO16_D8.get(0).getScoredGoalsCount() + " - " + RO16_D8.get(1).getScoredGoalsCount() + " " + RO16_D8.get(1).getName() + "\n");

		wait(1000);

		if (RO16_D8.get(0).getScoredGoalsCount() > RO16_D8.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D8.get(0).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D8.get(0));
		}
		else if (RO16_D8.get(0).getScoredGoalsCount() < RO16_D8.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + RO16_D8.get(1).getName() + " advances to the Quarter-finals on total aggregate score!" + "\n");
			
			QF_Clubs.add(RO16_D8.get(1));
		}
		else {
					
//			if (RO16_D8.get(0).getScoredAwayGoals() > RO16_D8.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D8.get(0).getName() + " advances to the Quarter-finals on away goals!" +"\n");
//				
//				QF_Clubs.add(RO16_D8.get(0));
//			}
//			else if (RO16_D8.get(0).getScoredAwayGoals() < RO16_D8.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + RO16_D8.get(1).getName() + " advances to the Quarter-finals on away goals!" + "\n");
//				
//				QF_Clubs.add(RO16_D8.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + RO16_D8.get(pen_index).getName() + " advances to the Quarter-finals on penalties!" + "\n");
				
				QF_Clubs.add(RO16_D8.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		
		// ArrayLists for the 4 Quarter-final draws created
		ArrayList<FootballClub> QF_D1 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> QF_D2 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> QF_D3 = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> QF_D4 = new ArrayList<FootballClub>(2);
		
		
		
		// *Draws to create Quarter-final Ties*
		
		// draw for tie 1: 2 clubs from QF_Clubs ArrayList				
		// chooses a random number from 0-7 as the index
		int QF1_index = (int)(Math.random() * QF_Clubs.size());
		// adds object that is in random index (QF1_index) from QF_Clubs ArrayList into QF_D1 ArrayList
		QF_D1.add(QF_Clubs.get(QF1_index));				
		// remove club in random index (QF1_index) from QF_Clubs ArrayList
		QF_Clubs.remove(QF1_index);

		int QF2_index = (int)(Math.random() * QF_Clubs.size());
		QF_D1.add(QF_Clubs.get(QF2_index));				
		QF_Clubs.remove(QF2_index);
		
		
		
		// draw for tie 2	
		int QF3_index = (int)(Math.random() * QF_Clubs.size());
		QF_D2.add(QF_Clubs.get(QF3_index));				
		QF_Clubs.remove(QF3_index);

		int QF4_index = (int)(Math.random() * QF_Clubs.size());
		QF_D2.add(QF_Clubs.get(QF4_index));				
		QF_Clubs.remove(QF4_index);
		
		
		// draw for tie 3		
		int QF5_index = (int)(Math.random() * QF_Clubs.size());
		QF_D3.add(QF_Clubs.get(QF5_index));				
		QF_Clubs.remove(QF5_index);

		int QF6_index = (int)(Math.random() * QF_Clubs.size());
		QF_D3.add(QF_Clubs.get(QF6_index));				
		QF_Clubs.remove(QF6_index);
		
		
		// draw for tie 4	
		int QF7_index = (int)(Math.random() * QF_Clubs.size());
		QF_D4.add(QF_Clubs.get(QF7_index));				
		QF_Clubs.remove(QF7_index);

		int QF8_index = (int)(Math.random() * QF_Clubs.size());
		QF_D4.add(QF_Clubs.get(QF8_index));				
		QF_Clubs.remove(QF8_index);
		
		
		
		
		// *Display for Creating Quarter-final ties*
		System.out.println("\n" + "Type 'next' to draw the Quarter-final match-ups." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Quarter-final Fixtures: " + "\n");
				wait(1000);

				System.out.println("\n" + "Left side of the bracket: " + "\n");	
				wait(1000);

				System.out.println(QF_D1.get(0).getName() + " vs " + QF_D1.get(1).getName() + "\n");	
				wait(1000);

				System.out.println(QF_D2.get(0).getName() + " vs " + QF_D2.get(1).getName() + "\n");
				wait(1000);

				System.out.println("\n" + "Right side of the bracket: " + "\n");
				wait(1000);

				System.out.println(QF_D3.get(0).getName() + " vs " + QF_D3.get(1).getName() + "\n");
				wait(1000);

				System.out.println(QF_D4.get(0).getName() + " vs " + QF_D4.get(1).getName() + "\n");
				wait(1000);

				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		// reset goals scored and away goals scored for each club remaining	
		for (int i = 0; i < QF_D1.size(); i++) {
			
			QF_D1.get(i).setScoredGoalsCount(0);
			QF_D2.get(i).setScoredGoalsCount(0);
			QF_D3.get(i).setScoredGoalsCount(0);
			QF_D4.get(i).setScoredGoalsCount(0);

//			QF_D1.get(i).setScoredAwayGoals(0);
//			QF_D2.get(i).setScoredAwayGoals(0);
//			QF_D3.get(i).setScoredAwayGoals(0);
//			QF_D4.get(i).setScoredAwayGoals(0);
		}
		
		
		
		// create ArrayLists created for Semi-finals left side fixture and right side fixture	
		ArrayList<FootballClub> SF_Left = new ArrayList<FootballClub>(2);
		ArrayList<FootballClub> SF_Right = new ArrayList<FootballClub>(2);
		
		
		
		
		// *Quarter-final Tie 1 match simulation*				
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		// everything is the same as the round of 16 matches
		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + QF_D1.get(0).getName() + " vs " + QF_D1.get(1).getName() + "... \n");

				for (int i = 0; i < QF_D1.size(); i++) {
							
					for (int j = 0; j < QF_D1.size(); j++) {
				
						if (QF_D1.get(i) != QF_D1.get(j)) {
						
							FootballClub home = QF_D1.get(i);
							FootballClub away = QF_D1.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);						
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);					
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display which club advances to the Semi-finals from Tie 1*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + QF_D1.get(0).getName() + " " + QF_D1.get(0).getScoredGoalsCount() + " - " + QF_D1.get(1).getScoredGoalsCount() + " " + QF_D1.get(1).getName() + "\n");
				
		wait(1000);

		if (QF_D1.get(0).getScoredGoalsCount() > QF_D1.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D1.get(0).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Left.add(QF_D1.get(0));
		}
		else if (QF_D1.get(0).getScoredGoalsCount() < QF_D1.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D1.get(1).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Left.add(QF_D1.get(1));
		}
		else {
					
//			if (QF_D1.get(0).getScoredAwayGoals() > QF_D1.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D1.get(0).getName() + " advances to the Semi-finals on away goals!" +"\n");
//				
//				SF_Left.add(QF_D1.get(0));
//			}
//			else if (QF_D1.get(0).getScoredAwayGoals() < QF_D1.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D1.get(1).getName() + " advances to the Semi-finals on away goals!" + "\n");
//				
//				SF_Left.add(QF_D1.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + QF_D1.get(pen_index).getName() + " advances to the Semi-finals on penalties!" + "\n");
				
				SF_Left.add(QF_D1.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Quarter-final Tie 2 match simulation*						
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + QF_D2.get(0).getName() + " vs " + QF_D2.get(1).getName() + "... \n");

				for (int i = 0; i < QF_D2.size(); i++) {
							
					for (int j = 0; j < QF_D2.size(); j++) {
				
						if (QF_D2.get(i) != QF_D2.get(j)) {
						
							FootballClub home = QF_D2.get(i);
							FootballClub away = QF_D2.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);					
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Semi-finals from Tie 2*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + QF_D2.get(0).getName() + " " + QF_D2.get(0).getScoredGoalsCount() + " - " + QF_D2.get(1).getScoredGoalsCount() + " " + QF_D2.get(1).getName() + "\n");
				
		wait(1000);

		if (QF_D2.get(0).getScoredGoalsCount() > QF_D2.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D2.get(0).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Left.add(QF_D2.get(0));
		}
		else if (QF_D2.get(0).getScoredGoalsCount() < QF_D2.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D2.get(1).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Left.add(QF_D2.get(1));
		}
		else {
					
//			if (QF_D2.get(0).getScoredAwayGoals() > QF_D2.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D2.get(0).getName() + " advances to the Semi-finals on away goals!" +"\n");
//				
//				SF_Left.add(QF_D2.get(0));
//			}
//			else if (QF_D2.get(0).getScoredAwayGoals() < QF_D2.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D2.get(1).getName() + " advances to the Semi-finals on away goals!" + "\n");
//				
//				SF_Left.add(QF_D2.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + QF_D2.get(pen_index).getName() + " advances to the Semi-finals on penalties!" + "\n");
				
				SF_Left.add(QF_D2.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Quarter-final Tie 3 match simulation*								
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + QF_D3.get(0).getName() + " vs " + QF_D3.get(1).getName() + "... \n");

				for (int i = 0; i < QF_D3.size(); i++) {
							
					for (int j = 0; j < QF_D3.size(); j++) {
				
						if (QF_D3.get(i) != QF_D3.get(j)) {
						
							FootballClub home = QF_D3.get(i);
							FootballClub away = QF_D3.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							
							
							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);			
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display which club advances to the Semi-finals from Tie 3*
		wait(1000);

		System.out.println("\n" + "\n" + "Final Aggregate Score: " + QF_D3.get(0).getName() + " " + QF_D3.get(0).getScoredGoalsCount() + " - " + QF_D3.get(1).getScoredGoalsCount() + " " + QF_D3.get(1).getName() + "\n");
				
		wait(1000);

		if (QF_D3.get(0).getScoredGoalsCount() > QF_D3.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D3.get(0).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Right.add(QF_D3.get(0));
		}
		else if (QF_D3.get(0).getScoredGoalsCount() < QF_D3.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D3.get(1).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Right.add(QF_D3.get(1));
		}
		else {
					
//			if (QF_D3.get(0).getScoredAwayGoals() > QF_D3.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D3.get(0).getName() + " advances to the Semi-finals on away goals!" +"\n");
//				
//				SF_Right.add(QF_D3.get(0));
//			}
//			else if (QF_D3.get(0).getScoredAwayGoals() < QF_D3.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D3.get(1).getName() + " advances to the Semi-finals on away goals!" + "\n");
//				
//				SF_Right.add(QF_D3.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + QF_D3.get(pen_index).getName() + " advances to the Semi-finals on penalties!" + "\n");
				
				SF_Right.add(QF_D3.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Quarter-final Tie 4 match simulation*										
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + QF_D4.get(0).getName() + " vs " + QF_D4.get(1).getName() + "... \n");

				for (int i = 0; i < QF_D4.size(); i++) {
							
					for (int j = 0; j < QF_D4.size(); j++) {
				
						if (QF_D4.get(i) != QF_D4.get(j)) {
						
							FootballClub home = QF_D4.get(i);
							FootballClub away = QF_D4.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);		
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display which club advances to the Semi-finals from Tie 4*
		wait(1000);

		System.out.println("\n" + "\n" + "Final Aggregate Score: " + QF_D4.get(0).getName() + " " + QF_D4.get(0).getScoredGoalsCount() + " - " + QF_D4.get(1).getScoredGoalsCount() + " " + QF_D4.get(1).getName() + "\n");
				
		wait(1000);

		if (QF_D4.get(0).getScoredGoalsCount() > QF_D4.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D4.get(0).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Right.add(QF_D4.get(0));
		}
		else if (QF_D4.get(0).getScoredGoalsCount() < QF_D4.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + QF_D4.get(1).getName() + " advances to the Semi-finals on total aggregate score!" + "\n");
			
			SF_Right.add(QF_D4.get(1));
		}
		else {
					
//			if (QF_D4.get(0).getScoredAwayGoals() > QF_D4.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D4.get(0).getName() + " advances to the Semi-finals on away goals!" +"\n");
//				
//				SF_Right.add(QF_D4.get(0));
//			}
//			else if (QF_D4.get(0).getScoredAwayGoals() < QF_D4.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + QF_D4.get(1).getName() + " advances to the Semi-finals on away goals!" + "\n");
//				
//				SF_Right.add(QF_D4.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + QF_D4.get(pen_index).getName() + " advances to the Semi-finals on penalties!" + "\n");
				
				SF_Right.add(QF_D4.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		
		// *Display for Creating Semi-finals ties*	
		System.out.println("\n" + "Type 'next' to see the Semi-final match-ups." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				System.out.println("\n" + "Semi-final Fixtures: " + "\n");
				wait(1000);

				System.out.println("\n" + "Left side of the bracket: " + "\n");
				wait(1000);

				System.out.println(SF_Left.get(0).getName() + " vs " + SF_Left.get(1).getName() + "\n");
				wait(1000);

				
				System.out.println("\n" + "Right side of the bracket: " + "\n");
				wait(1000);

				System.out.println(SF_Right.get(0).getName() + " vs " + SF_Right.get(1).getName() + "\n");
				wait(1000);

				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		
		// reset goals scored and away goals scored for each club remaining
		for (int i = 0; i < SF_Left.size(); i++) {
			
			SF_Left.get(i).setScoredGoalsCount(0);
			SF_Right.get(i).setScoredGoalsCount(0);

//			SF_Left.get(i).setScoredAwayGoals(0);
//			SF_Right.get(i).setScoredAwayGoals(0);
		}
		
		
		
		// create ArrayList for Final clubs
		ArrayList<FootballClub> Final = new ArrayList<FootballClub>(2);
		
		
		
		
		// *Semi-final left side match simulation*											
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		// everything is the same as the round of 16 and quarter-final matches
		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + SF_Left.get(0).getName() + " vs " + SF_Left.get(1).getName() + "... \n");

				for (int i = 0; i < SF_Left.size(); i++) {
							
					for (int j = 0; j < SF_Left.size(); j++) {
				
						if (SF_Left.get(i) != SF_Left.get(j)) {
						
							FootballClub home = SF_Left.get(i);
							FootballClub away = SF_Left.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);				
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club advances to the Final from left side of bracket*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + SF_Left.get(0).getName() + " " + SF_Left.get(0).getScoredGoalsCount() + " - " + SF_Left.get(1).getScoredGoalsCount() + " " + SF_Left.get(1).getName() + "\n");
				
		wait(1000);

		if (SF_Left.get(0).getScoredGoalsCount() > SF_Left.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + SF_Left.get(0).getName() + " advances to the Final on total aggregate score!" + "\n");
			
			Final.add(SF_Left.get(0));
		}
		else if (SF_Left.get(0).getScoredGoalsCount() < SF_Left.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + SF_Left.get(1).getName() + " advances to the Final on total aggregate score!" + "\n");
			
			Final.add(SF_Left.get(1));
		}
		else {
					
//			if (SF_Left.get(0).getScoredAwayGoals() > SF_Left.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + SF_Left.get(0).getName() + " advances to the Final on away goals!" +"\n");
//				
//				Final.add(SF_Left.get(0));
//			}
//			else if (SF_Left.get(0).getScoredAwayGoals() < SF_Left.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + SF_Left.get(1).getName() + " advances to the Final on away goals!" + "\n");
//				
//				Final.add(SF_Left.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + SF_Left.get(pen_index).getName() + " advances to the Final on penalties!" + "\n");
				
				Final.add(SF_Left.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// *Semi-final right side match simulation*													
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating match results for both legs of " + SF_Right.get(0).getName() + " vs " + SF_Right.get(1).getName() + "... \n");

				for (int i = 0; i < SF_Right.size(); i++) {
							
					for (int j = 0; j < SF_Right.size(); j++) {
				
						if (SF_Right.get(i) != SF_Right.get(j)) {
						
							FootballClub home = SF_Right.get(i);
							FootballClub away = SF_Right.get(j);
							
							int home_goals = 0;
							int away_goals = 0;
							
							if (home.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								home_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								home_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								home_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (home.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								home_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							if (away.getRating() >= 90) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(23);
								away_goals = KO_ratings90to95_goalprob[goal_index];

							}
							else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(15);
								away_goals = KO_ratings85to89_goalprob[goal_index];
							}
							else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(17);
								away_goals = KO_ratings80to84_goalprob[goal_index];
							}
							else if (away.getRating() < 80) {
								
								Random rand = new Random();
								int goal_index = rand.nextInt(18);
								away_goals = KO_ratings75to79_goalprob[goal_index];
							}
							
							
							wait(1500);					
							System.out.println("\n" + home + " " + home_goals + " - " + away_goals + " " + away);
							

							home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
							away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
							
							//away.setScoredAwayGoals(away.getScoredAwayGoals() + away_goals);						
						}
					}
				}
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
		// *Display which club advances to the Final from right side of bracket*
		wait(1000);
		System.out.println("\n" + "\n" + "Final Aggregate Score: " + SF_Right.get(0).getName() + " " + SF_Right.get(0).getScoredGoalsCount() + " - " + SF_Right.get(1).getScoredGoalsCount() + " " + SF_Right.get(1).getName() + "\n");
				
		wait(1000);

		if (SF_Right.get(0).getScoredGoalsCount() > SF_Right.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + SF_Right.get(0).getName() + " advances to the Final on total aggregate score!" + "\n");
			
			Final.add(SF_Right.get(0));
		}
		else if (SF_Right.get(0).getScoredGoalsCount() < SF_Right.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + SF_Right.get(1).getName() + " advances to the Final on total aggregate score!" + "\n");
			
			Final.add(SF_Right.get(1));
		}
		else {
//					
//			if (SF_Right.get(0).getScoredAwayGoals() > SF_Right.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + SF_Right.get(0).getName() + " advances to the Final on away goals!" +"\n");
//				
//				Final.add(SF_Right.get(0));
//			}
//			else if (SF_Right.get(0).getScoredAwayGoals() < SF_Right.get(1).getScoredAwayGoals()) {
//						
//				System.out.println("\n" + SF_Right.get(1).getName() + " advances to the Final on away goals!" + "\n");
//				
//				Final.add(SF_Right.get(1));
//			}
//			else {
				
				Random rand = new Random();
				int pen_index = rand.nextInt(2);
					
				System.out.println("\n" + SF_Right.get(pen_index).getName() + " advances to the Final on penalties!" + "\n");
				
				Final.add(SF_Right.get(pen_index));	
			//}
		}
		
		
		wait(1000);
		
		
		
		
		// lists that has probabilities for goals for each team depending on the rating - in the Final
		Integer[] Final_ratings90to95_goalprob = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5};
		Integer[] Final_ratings85to89_goalprob = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3};
		Integer[] Final_ratings80to84_goalprob = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2};
		Integer[] Final_ratings75to79_goalprob = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2};
		
		
		
		// *Display for Creating Final*	
		System.out.println("\n" + "Type 'next' to see the Final match-up." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("next")) {
				
				wait(1000);
				System.out.println("\n" + "The Final of this season's UEFA Champions League campaign is " + Final.get(0).getName() + " vs " + Final.get(1).getName() + "!\n");
				wait(1000);

				break;
			}
			else {
				
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
		
		
			
		// reset goals scored for each club remaining
		for (int i = 0; i < Final.size(); i++) {
			
			Final.get(i).setScoredGoalsCount(0);
		}
		
		
		
			
		// *Final match simulation*													
		System.out.println("\n" + "Type 'next' to continue the simulation." + "\n");

		while (true) {
			
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
					
			if (input.equals("next")) {
			
				System.out.println("\n" + "Generating the match result for the Champions League Final fixture of " + Final.get(0).getName() + " vs " + Final.get(1).getName() + "... \n");
										
				FootballClub home = Final.get(0);
				FootballClub away = Final.get(1);
							
				int home_goals = 0;
				int away_goals = 0;
							
				if (home.getRating() >= 90) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(24);
					home_goals = Final_ratings90to95_goalprob[goal_index];

				}
				else if (home.getRating() <= 89 && home.getRating() >= 85) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(17);
					home_goals = Final_ratings85to89_goalprob[goal_index];
				}
				else if (home.getRating() <= 84 && home.getRating() >= 80) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(16);
					home_goals = Final_ratings80to84_goalprob[goal_index];
				}
				else if (home.getRating() < 80) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(18);
					home_goals = Final_ratings75to79_goalprob[goal_index];
				}
							
							
				if (away.getRating() >= 90) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(24);
					away_goals = Final_ratings90to95_goalprob[goal_index];

				}
				else if (away.getRating() <= 89 && away.getRating() >= 85) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(17);
					away_goals = Final_ratings85to89_goalprob[goal_index];
				}
				else if (away.getRating() <= 84 && away.getRating() >= 80) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(16);
					away_goals = Final_ratings80to84_goalprob[goal_index];
				}
				else if (away.getRating() < 80) {
								
					Random rand = new Random();
					int goal_index = rand.nextInt(18);
					away_goals = Final_ratings75to79_goalprob[goal_index];
				}
				
				
				home.setScoredGoalsCount(home.getScoredGoalsCount() + home_goals);
				away.setScoredGoalsCount(away.getScoredGoalsCount() + away_goals);
					
				
				break;
			}			
			else {
							
				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
			
		
		// *Display which club wins the Champions League this season*
		wait(4000);
		System.out.println("\n" + "Final Score: " + Final.get(0).getName() + " " + Final.get(0).getScoredGoalsCount() + " - " + Final.get(1).getScoredGoalsCount() + " " + Final.get(1).getName() + "\n");
		
		wait(2000);

		if (Final.get(0).getScoredGoalsCount() > Final.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + Final.get(0).getName() + " is the winner of this season's Champions League campaign!" + "\n");		
		}
		else if (Final.get(0).getScoredGoalsCount() < Final.get(1).getScoredGoalsCount()) {
					
			System.out.println("\n" + Final.get(1).getName() + " is the winner of this season's Champions League campaign!" + "\n");		
		}
		else {
				
			Random rand = new Random();
			int pen_index = rand.nextInt(2);
					
			System.out.println("\n" + Final.get(pen_index).getName() + " is the winner of this season's Champions League campaign on penalties!" + "\n");				
		}		
	}
}