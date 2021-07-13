// Author: Saleman Anwari
// Project Name: *Resume Builder*
// ResumeBuilder.java

public class ResumeBuilder{

	public static void main(String[] args){
		
		// create GUI object using constructor
		GUI gui = new GUI(1100, 1100);
		
		// call setUpGUI method on GUI object
		gui.setUpGUI();
		
		// call setUpButtonListeners method on GUI object
		gui.setUpButtonListeners();		
	}
}