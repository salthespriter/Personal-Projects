// Author: Saleman Anwari
// Project Name: *Hangman*
// Game.java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	// private field counter - keeps track of how many wrong guesses
	private static int counter = 0;
	
	
	// main method
	public static void main(String[] args) {

		// call menu method with parameter args using args from main method parameter
		menu(args);
	}
	
	
	// wait method to allow pauses
	public static void wait(int ms) {

		try {
			Thread.sleep(ms);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	
	// menu method - Parameter (String[] args)
	private static void menu(String[] args) {

		// if the # of arguments entered is not equal to 1, exit the program
		if (args.length != 1) {

			System.out.println("Wrong number of arguments. \n" + "Proper Usage: {filename}.");
			System.exit(0);
		}


		// creates new File object that reads in the file entered
		File file = new File (args[0]);

		// creates new Scanner object
		Scanner reader = null;	

		// creates new ArrayList to store words from txt file in
		ArrayList<String> words = new ArrayList<>();


		// reads in the file that was entered and adds words from file into ArrayList
		// if file doesn't exist, exit the program
		try {

			reader = new Scanner(file);

			// while file has another line
			while (reader.hasNextLine()) {

				// add line to words ArrayList
				words.add(reader.nextLine());		
			}

		} catch (FileNotFoundException e) {

			System.out.println("File not found.");
			System.exit(0);
		}


		// new Random object created
		Random rand = new Random();
		// choose a random number between 0 and the size of the words ArrayList (number of words)
		int random = rand.nextInt(words.size());

		// use random number to select a word from the words ArrayList and save to variable 'word'
		String word = words.get(random);


		// create new ArrayList with same size of words ArrayList
		ArrayList<String> wordlist = new ArrayList<>(word.length());

		// loop through number of words in words ArrayList
		// so that I can store same number of _'s in new wordlist ArrayList
		for (int i = 0; i < word.length(); i++) {

			// store '_' in temp variable
			String temp = "_";

			// add '_' to new wordlist ArrayList
			wordlist.add(temp);
		}


		// Begin the game
		System.out.println("***************************************************");
		System.out.println("Welcome to the Hangman game!");
		System.out.println("***************************************************");
		System.out.println("\n" + "Type 'start' to begin playing." + "\n");


		// while true
		while (true) {

			// create new scanner object
			Scanner scanner = new Scanner(System.in);

			// next user input set to variable input
			String input = scanner.nextLine();

			// if user input is "start" - begin the game
			if (input.equals("start") || input.equals("Start") || input.equals("START")) {

				// create new ArrayList to store each guess in
				ArrayList<String> guessed = new ArrayList<String>();

				// create boolean game and set to true
				boolean game = true;

				// create int lives and start it with 8 lives
				int lives = 8;

				System.out.println("\n\n*YOU START WITH 8 LIVES*");

				// while game boolean is true
				while (game == true) {

					System.out.println("\n\n---------------------------------------------------");
					System.out.println("---------------------------------------------------");
					System.out.println("\nGuess a letter:");

					// create new scanner object
					Scanner scan = new Scanner(System.in);
					// next user input set to variable guess
					String guess = scan.nextLine();

					System.out.print("\n");

					// set random word selected from file to all lower case
					word = word.toLowerCase();
					// set user's letter guess to lower case
					guess = guess.toLowerCase();


					// while guessed ArrayList contains guess
					while (guessed.contains(guess) == true) {

						System.out.println("\nYou've already guessed this letter!");
						System.out.println("\n\n---------------------------------------------------");
						System.out.println("---------------------------------------------------");
						System.out.println("\nGuess a letter:");

						// scan for another user guess until it is a guess that hasn't been entered in yet
						guess = scan.nextLine();
					}


					// if user letter guess is 1 character only, continue
					if (guess.length() == 1) {

						// if random word contains the letter guess
						if (word.contains(guess)) {

							// find index in random word where the letter guess is located in
							int index = word.indexOf(guess);

							// while index is >= 0
							while (index >= 0) {

								// remove '_' that is in specific index of wordlist ArrayList
								wordlist.remove(index);
								// add letter guess to specific index of wordlist ArrayList
								wordlist.add(index, guess);

								// set index variable to find index in random word where the letter guess is located in
								// this starts at previous index + 1 position so that it can look for multiple of the same letter
								index = word.indexOf(guess, index+1);
							}


							System.out.println();

							wait(1000);


							// loop through number of letters in wordlist ArrayList
							for (int i = 0; i < wordlist.size(); i ++) {

								// print out each letter in wordlist ArrayList (whether it is '_' or a letter)
								// example: p _ z z _
								System.out.print(wordlist.get(i) + " ");				
							}


							// if wordlist ArrayList does not contain an '_' , that means the word is solved and you won the game
							if (wordlist.contains("_") == false) {

								wait(1000);

								System.out.println("\n\n********************************************************************************");
								System.out.println("Congratulations, you've figured out the word without dying! YOU WON THE GAME! :D");
								System.out.println("********************************************************************************");

								// exit program
								System.exit(0);
							}

							wait(1000);

							// add guess to guessed ArrayList
							guessed.add(guess);	
							System.out.println("\n\n\nLetter's Guessed: " + guessed);

							wait(1000);

							// call drawHangMan method
							drawHangMan();

							System.out.println("\nLIVES LEFT: " + lives);

							wait(1000);

							System.out.println("\n\nDo you want to guess the word?");

							// create new scanner object
							Scanner scan2 = new Scanner(System.in);
							// next user input set to variable yes_or_no
							String yes_or_no = scan2.nextLine();

							// create boolean run and set to true
							boolean run = true;


							// while run boolean is true
							while (run == true) {

								// if yes_or_no user input is 'yes'
								if (yes_or_no.equals("Yes") || yes_or_no.equals("yes") || yes_or_no.equals("YES") || yes_or_no.equals("YeS") || yes_or_no.equals("yeS") || yes_or_no.equals("yES") || yes_or_no.equals("yEs") || yes_or_no.equals("YEs")) {

									System.out.println("\nAnswer:");

									// create new scanner object
									Scanner scan3 = new Scanner(System.in);
									// next user input set to variable answer
									String answer = scan3.nextLine();

									// set answer to all lower case
									answer = answer.toLowerCase();

									// if answer is equal to the random word, you win the game
									if (answer.equals(word)) {

										wait(1000);

										System.out.println("\n\n*********************************************************************");
										System.out.println("Congratulations, you guessed the word correctly! YOU WON THE GAME! :D");
										System.out.println("*********************************************************************");

										// exit program
										System.exit(0);
									}
									// else answer is not equal to the random word, you lose a life
									else {

										wait(1000);

										System.out.println("\nThat is not the correct word, SORRY!");

										wait(1000);

										// increment counter variable
										counter++;
										// call drawHangMan method
										drawHangMan();

										// decrement lives variable
										lives--;		
										System.out.println("\nLIVES LEFT: " + lives);

										// if counter is equal to 8, you lose the game
										if (counter == 8) {

											wait(1000);

											System.out.println("\n\n***************************");
											System.out.println("GAME OVER! YOU ARE DEAD. D:");
											System.out.println("***************************");

											wait(1000);

											System.out.println("\n\nThe correct word was: " + word);

											// exit program
											System.exit(0);
										}

										// else set run boolean to false to exit the while loop
										run = false;
									}
								}
								// else if yes_or_no user input is 'no'
								else if (yes_or_no.equals("No") || yes_or_no.equals("no") || yes_or_no.equals("NO") || yes_or_no.equals("nO")) {

									// set run boolean to false to exit the while loop
									run = false;
								}
								// else
								else {

									System.out.println("\nNot an answer. Yes or No?");

									// scan for another user guess until it is 'yes' or 'no'
									yes_or_no = scan.nextLine();
								}
							}
						}
						// else random word does not contain the letter guess
						else {


							System.out.println();

							wait(1000);

							// loop through number of letters in wordlist ArrayList
							for (int i = 0; i < wordlist.size(); i ++) {

								// print out each letter in wordlist ArrayList (whether it is '_' or a letter)
								// example: p _ z z _
								System.out.print(wordlist.get(i) + " ");
							}

							wait(1000);

							// add guess to guessed ArrayList
							guessed.add(guess);	
							System.out.println("\n\n\nLetter's Guessed: " + guessed);

							wait(1000);

							// increment counter variable
							counter++;
							// call drawHangMan method
							drawHangMan();

							// decrement lives variable
							lives--;
							System.out.println("\nLIVES LEFT: " + lives);


							// if counter is equal to 8, you lose the game
							if (counter == 8) {

								wait(1000);

								System.out.println("\n\n***************************");
								System.out.println("GAME OVER! YOU ARE DEAD. D:");
								System.out.println("***************************");

								wait(1000);

								System.out.println("\n\nThe correct word was: " + word);

								// exit program
								System.exit(0);
							}

							wait(1000);

							System.out.println("\n\nDo you want to guess the word?");

							// create new scanner object
							Scanner scan2 = new Scanner(System.in);
							// next user input set to variable yes_or_no
							String yes_or_no = scan2.nextLine();

							// create boolean run and set to true
							boolean run = true;


							// while run boolean is true
							while (run == true) {

								// if yes_or_no user input is 'yes'
								if (yes_or_no.equals("Yes") || yes_or_no.equals("yes") || yes_or_no.equals("YES") || yes_or_no.equals("YeS") || yes_or_no.equals("yeS") || yes_or_no.equals("yES") || yes_or_no.equals("yEs") || yes_or_no.equals("YEs")) {

									System.out.println("\nAnswer:");

									// create new scanner object
									Scanner scan3 = new Scanner(System.in);
									// next user input set to variable answer
									String answer = scan3.nextLine();

									// set answer to all lower case
									answer = answer.toLowerCase();

									// if answer is equal to the random word, you win the game
									if (answer.equals(word)) {

										wait(1000);

										System.out.println("\n\n*********************************************************************");
										System.out.println("Congratulations, you guessed the word correctly! YOU WON THE GAME! :D");
										System.out.println("*********************************************************************");

										// exit program
										System.exit(0);
									}
									// else answer is not equal to the random word, you lose a life
									else {

										wait(1000);

										System.out.println("\nThat is not the correct word, SORRY!");

										wait(1000);

										// increment counter variable
										counter++;
										// call drawHangMan method
										drawHangMan();

										// decrement lives variable
										lives--;
										System.out.println("\nLIVES LEFT: " + lives);

										// if counter is equal to 8, you lose the game
										if (counter == 8) {

											wait(1000);

											System.out.println("\n\n***************************");
											System.out.println("GAME OVER! YOU ARE DEAD. D:");
											System.out.println("***************************");

											wait(1000);

											System.out.println("\n\nThe correct word was: " + word);

											// exit program
											System.exit(0);
										}

										// else set run boolean to false to exit the while loop
										run = false;
									}
								}
								// else if yes_or_no user input is 'no'
								else if (yes_or_no.equals("No") || yes_or_no.equals("no") || yes_or_no.equals("NO") || yes_or_no.equals("nO")) {

									// set run boolean to false to exit the while loop
									run = false;
								}
								// else
								else {

									System.out.println("\nNot an answer. Yes or No?");

									// scan for another user guess until it is 'yes' or 'no'
									yes_or_no = scan.nextLine();
								}
							}
						}
					}
					// else enter a new letter guess
					else {

						System.out.println("\nEnter ONLY 1 letter!");
					}
				}		
			}
			// else invalid input
			else {

				System.out.println("\n" + "Invalid command! Try again." + "\n");
			}
		}
	}

	// drawHangMan method - draws Hangman
	private static void drawHangMan() {

		System.out.println("\n_________"); 

		// if counter is > 0, draw noose
		if (counter > 0) {

			System.out.println("        |");
			System.out.println("        |");
		}

		// if counter is > 1, draw head
		if (counter > 1) {

			System.out.println("        O");
		}

		// if counter is > 2, draw upper body
		if (counter > 2) {

			System.out.println("        |");
		}

		// if counter is > 3, draw left arm
		if (counter > 3) {

			System.out.print("       /");
		}

		// if counter is > 4, draw right arm
		if (counter > 4) {

			System.out.print(" \\");
		}

		// if counter is > 5, draw lower body
		if (counter > 5) {

			System.out.println();
			System.out.println("        |");			
		}

		// if counter is > 6, draw left leg
		if (counter > 6) {

			System.out.print("       /");
		}

		// if counter is > 7, draw right leg
		if (counter > 7) {

			System.out.print(" \\");
		}

		System.out.println();
	}
}