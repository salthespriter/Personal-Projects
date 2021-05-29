// Author: Saleman Anwari
// Project Name: *Champions League Simulator*
// Club.java

// abstract class Club that is extended/used by FootballClub class
// cannot create objects of this class
public abstract class Club {

	// private variables for this class
	private String name;
	private String league;
	private Integer rating;
	
    
	// getter for club name
    public String getName() {  	
        return name;
    }
    
	// getter for league club is in
    public String getLeague() {	
        return league;
    }
    
	// getter for club rating
    public Integer getRating() {	
    	return rating;
    }
    
    // setter for club name
    public void setName(String s) {	
        this.name = s;
    }  
    
    // setter for league club is in
    public void setLeague(String s) {	
        this.league = s;
    }
    
    // setter for club rating
    public void setRating(Integer i) {
    	this.rating = i;
    }
    
    // toString method to be able to print objects in the String form below
    // in this case just the name of the club
    public String toString() {
        return name;
    }
}