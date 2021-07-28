// Author: Saleman Anwari
// Project Name: *Champions League Simulator*
// CustomComparator.java

import java.util.Comparator;

public class CustomComparator implements Comparator<FootballClub> {

	// Custom Comparator created to order clubs by the amount of points they have from most to least
	// if both clubs have equal points, it will order the clubs by whichever has a greater goal difference
	@Override
	public int compare(FootballClub c, FootballClub c1) {

		// if football club has more points than other football club
		if (c.getPoints() > c1.getPoints()) {

			// return -1
			return -1;
		}
		// else
		else {

			// if football club has less points than other football club
			if (c.getPoints() < c1.getPoints()) {

				// return 1
				return 1;
			}
			// else
			else {

				// set variable equal to goal difference for both clubs
				int goalDiff = c.getScoredGoalsCount() - c.getReceivedGoalsCount();
				int goalDiff2 = c1.getScoredGoalsCount() - c1.getReceivedGoalsCount();

				// if goal difference for club 1 is greater than goal difference for club 2
				if(goalDiff > goalDiff2) {

					// return -1
					return -1;
				}
				// else
				else {

					// if goal difference for club 1 is less than goal difference for club 2
					if(goalDiff < goalDiff2) {

						// return 1
						return 1;
					}
					// else
					else {

						// return 0
						return 0;
					}
				}
			}   
		}
	}
}