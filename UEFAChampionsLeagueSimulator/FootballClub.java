// Author: Saleman Anwari
// Project Name: *Champions League Simulator*
// FootballClub.java


// class FootballClub that extends the Club class and allows to calculate the number of wins, draws, losses,
// goals scored, goals conceded, points, matches played, and away goals scored
// create FootballClub objects using this class
public class FootballClub extends Club {

	// private variables for this class
	private int winCount;
	private int drawCount;
	private int defeatCount;
	private int scoredGoalsCount;
	private int receivedGoalsCount;
	private int points;
	private int matchesPlayed;
	//private int scoredAwayGoals;
	    
	// getter for number of wins
	public int getWinCount() {
		return winCount;
	}

	// getter for number of draws
	public int getDrawCount() {	
		return drawCount;
	}
	 
	// getter for number of losses
	public int getDefeatCount() {
		return defeatCount;
	}

	// getter for number of goals scored
	public int getScoredGoalsCount() {
		return scoredGoalsCount;
	}
	    
	// getter for number of goals conceded
	public int getReceivedGoalsCount() {
		return receivedGoalsCount;
	}
	    
	// getter for number of points
	public int getPoints() {
	    return points;
	}
	
	// getter for number of matches played
	public int getMatchesPlayed() {
	    return matchesPlayed;
	}
	    
//	// getter for number of away goals scored
//	public int getScoredAwayGoals() {
//		return scoredAwayGoals;
//	}
	    
	// setter for number of wins
	public void setWinCount(int i) {
		winCount = i;
	}
	
	// setter for number of draws
	public void setDrawCount(int i) {
		drawCount = i;
	}
	    
	// setter for number of losses
	public void setDefeatCount(int i) {
		defeatCount = i;
	}
	 
	// setter for number of goals scored
	public void setScoredGoalsCount(int i) {
		scoredGoalsCount = i;
	}
	 
	// setter for number of goals conceded
	public void setRecievedGoalsCount(int i) {
		receivedGoalsCount = i;
	}
	     
	// setter for number of points
	public void setPoints(int i) {
		points = i;
	}
	
	// setter for number of matches played    
	public void setMatchesPlayed(int i) {
		matchesPlayed = i;
	}
	     
//	// setter for number of away goals scored
//	public void setScoredAwayGoals(int i) {
//		scoredAwayGoals = i;
//	}
}