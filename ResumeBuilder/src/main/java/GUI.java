// Author: Saleman Anwari
// Project Name: *Resume Builder*
// GUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.Leading;
import com.itextpdf.layout.property.Property;
import com.itextpdf.layout.property.TabAlignment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GUI {	

	// private field of a JFrame object
	private JFrame frame;

	// private field of width
	private int width;
	// private field of height
	private int height;

	// private field of JFileChooser object
	private JFileChooser chooser;

	// private fields of JLabel objects
	private JLabel personalinfotitle;
	private JLabel firstname;
	private JLabel lastname;
	private JLabel address;
	private JLabel city;
	private JLabel state;
	private JLabel zip;
	private JLabel email;
	private JLabel phone;

	private JLabel objectivetitle;
	private JLabel objective;

	private JLabel educationtitle;
	private JLabel university;
	private JLabel university_city;
	private JLabel university_state;
	private JLabel university_graduationdate;
	private JLabel university_gpa;
	private JLabel university_degree;
	private JLabel highschool;
	private JLabel highschool_city;
	private JLabel highschool_state;
	private JLabel highschool_graduationdate;
	private JLabel highschool_gpa;
	private JLabel highschool_diploma;

	private JLabel worktitle;
	private JLabel workdesc;
	private JLabel workdesc2;
	private JLabel jobs;
	private JLabel positions;
	private JLabel workdone;
	private JLabel dates;
	private JLabel workcity;
	private JLabel workstate;

	private JLabel skillstitle;
	private JLabel skillsdesc;
	private JLabel technologyskills;
	private JLabel languageskills;
	private JLabel otherskills;

	// private fields of JTextField objects
	private static JTextField input_firstname;
	private static JTextField input_lastname;
	private static JTextField input_address;
	private static JTextField input_city;
	private static JTextField input_state;
	private static JTextField input_zip;
	private static JTextField input_email;
	private static JTextField input_phone;
	private static JTextField input_objective;

	private static JTextField input_university;
	private static JTextField input_university_city;
	private static JTextField input_university_state;
	private static JTextField input_university_graduationdate;
	private static JTextField input_university_gpa;
	private static JTextField input_university_degree;
	private static JTextField input_highschool;
	private static JTextField input_highschool_city;
	private static JTextField input_highschool_state;
	private static JTextField input_highschool_graduationdate;
	private static JTextField input_highschool_gpa;
	private static JTextField input_highschool_diploma;

	// private fields of JTextArea and JScrollPane objects
	private static JTextArea input_jobs;
	private static JScrollPane scroll1;

	private static JTextArea input_positions;
	private static JScrollPane scroll2;

	private static JTextArea input_workdone;
	private static JScrollPane scroll3;

	private static JTextArea input_dates;
	private static JScrollPane scroll4;

	private static JTextArea input_workcity;
	private static JScrollPane scroll5;

	private static JTextArea input_workstate;
	private static JScrollPane scroll6;


	private static JTextArea input_technologyskills;
	private static JScrollPane scroll7;


	private static JTextArea input_languageskills;
	private static JScrollPane scroll8;

	private static JTextArea input_otherskills;
	private static JScrollPane scroll9;

	// private fields of JButton objects
	private JButton button1;
	private JButton button2;


	// GUI constructor
	public GUI(int w, int h) {

		// set width to width given in constructor
		width = w;
		// set height to height given in constructor
		height = h;		

		// set frame to new JFrame object created
		frame = new JFrame();

		// set chooser to new JFileChooser object created
		chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.SAVE_DIALOG);



		// JLabel for personal info TITLE
		personalinfotitle = new JLabel("PERSONAL INFORMATION");
		personalinfotitle.setBounds(80, 20, 200, 20);
		personalinfotitle.setFont(new Font("Gotham", Font.BOLD, 15));

		// JLabels for personal information
		firstname = new JLabel("First name:");
		firstname.setBounds(50, 50, 200, 20);
		firstname.setFont(new Font("Open Sans", Font.BOLD, 12));

		lastname = new JLabel("Last name:");
		lastname.setBounds(50, 80, 200, 20);
		lastname.setFont(new Font("Open Sans", Font.BOLD, 12));

		address = new JLabel("Address:");
		address.setBounds(50, 110, 200, 20);
		address.setFont(new Font("Open Sans", Font.BOLD, 12));

		city = new JLabel("City:");
		city.setBounds(50, 140, 200, 20);
		city.setFont(new Font("Open Sans", Font.BOLD, 12));

		state = new JLabel("State:");
		state.setBounds(50, 170, 200, 20);
		state.setFont(new Font("Open Sans", Font.BOLD, 12));

		zip = new JLabel("Zip Code:");
		zip.setBounds(50, 200, 200, 20);
		zip.setFont(new Font("Open Sans", Font.BOLD, 12));

		email = new JLabel("Email:");
		email.setBounds(50, 230, 200, 20);
		email.setFont(new Font("Open Sans", Font.BOLD, 12));

		phone = new JLabel("Phone Number:");
		phone.setBounds(50, 260, 200, 20);
		phone.setFont(new Font("Open Sans", Font.BOLD, 12));


		// JLabel for objective TITLE
		objectivetitle = new JLabel("OBJECTIVE");
		objectivetitle.setBounds(150, 310, 200, 20);
		objectivetitle.setFont(new Font("Gotham", Font.BOLD, 15));

		// JLabel for objective
		objective = new JLabel("Objective:");
		objective.setBounds(50, 340, 200, 20);
		objective.setFont(new Font("Open Sans", Font.BOLD, 12));


		// JLabel for education TITLE
		educationtitle = new JLabel("EDUCATION");
		educationtitle.setBounds(590, 20, 200, 20);
		educationtitle.setFont(new Font("Gotham", Font.BOLD, 15));

		// JLabels for education
		university = new JLabel("University:");
		university.setBounds(400, 50, 200, 20);
		university.setFont(new Font("Open Sans", Font.BOLD, 12));

		university_city = new JLabel("City:");
		university_city.setBounds(400, 80, 200, 20);
		university_city.setFont(new Font("Open Sans", Font.BOLD, 12));

		university_state = new JLabel("State:");
		university_state.setBounds(670, 80, 200, 20);
		university_state.setFont(new Font("Open Sans", Font.BOLD, 12));

		university_graduationdate = new JLabel("Date of Graduation:");
		university_graduationdate.setBounds(400, 120, 200, 20);
		university_graduationdate.setFont(new Font("Open Sans", Font.BOLD, 12));

		university_gpa = new JLabel("GPA:");
		university_gpa.setBounds(400, 150, 200, 20);
		university_gpa.setFont(new Font("Open Sans", Font.BOLD, 12));

		university_degree = new JLabel("Degree:");
		university_degree.setBounds(670, 120, 200, 20);
		university_degree.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool = new JLabel("High School:");
		highschool.setBounds(400, 220, 200, 20);
		highschool.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool_city = new JLabel("City:");
		highschool_city.setBounds(400, 250, 200, 20);
		highschool_city.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool_state = new JLabel("State:");
		highschool_state.setBounds(670, 250, 200, 20);
		highschool_state.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool_graduationdate = new JLabel("Date of Graduation:");
		highschool_graduationdate.setBounds(400, 290, 200, 20);
		highschool_graduationdate.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool_diploma = new JLabel("Diploma Type:");
		highschool_diploma.setBounds(670, 290, 200, 20);
		highschool_diploma.setFont(new Font("Open Sans", Font.BOLD, 12));

		highschool_gpa = new JLabel("GPA:");
		highschool_gpa.setBounds(400, 320, 200, 20);
		highschool_gpa.setFont(new Font("Open Sans", Font.BOLD, 12));


		// JLabel for work TITLE
		worktitle = new JLabel("WORK EXPERIENCE");
		worktitle.setBounds(470, 400, 200, 20);
		worktitle.setFont(new Font("Gotham", Font.BOLD, 15));

		// JLabels for work desc TITLE
		workdesc = new JLabel("*Type information for different jobs each on a new line*");
		workdesc.setBounds(410, 420, 320, 20);
		workdesc.setFont(new Font("Open Sans", Font.ITALIC, 10));

		// JLabels for work desc2 TITLE
		workdesc2 = new JLabel("*Seperate work done for each job with commas*");
		workdesc2.setBounds(445, 435, 320, 20);
		workdesc2.setFont(new Font("Open Sans", Font.ITALIC, 8));

		// JLabels for work
		jobs = new JLabel("JOBS");
		jobs.setBounds(100, 460, 200, 20);
		jobs.setFont(new Font("Open Sans", Font.BOLD, 12));

		positions = new JLabel("POSITIONS");
		positions.setBounds(245, 460, 200, 20);
		positions.setFont(new Font("Open Sans", Font.BOLD, 12));

		workdone = new JLabel("WORK DONE");
		workdone.setBounds(430, 460, 200, 20);
		workdone.setFont(new Font("Open Sans", Font.BOLD, 12));

		dates = new JLabel("DATES FROM - TO");
		dates.setBounds(630, 460, 200, 20);
		dates.setFont(new Font("Open Sans", Font.BOLD, 12));

		workcity = new JLabel("CITY");
		workcity.setBounds(855, 460, 200, 20);
		workcity.setFont(new Font("Open Sans", Font.BOLD, 12));

		workstate = new JLabel("STATE");
		workstate.setBounds(980, 460, 200, 20);
		workstate.setFont(new Font("Open Sans", Font.BOLD, 12));


		// JLabel for skills TITLE
		skillstitle = new JLabel("SKILLS");
		skillstitle.setBounds(515, 600, 200, 20);
		skillstitle.setFont(new Font("Gotham", Font.BOLD, 15));

		// JLabels for work desc TITLE
		skillsdesc = new JLabel("*Type each skill on a new line*");
		skillsdesc.setBounds(470, 620, 320, 20);
		skillsdesc.setFont(new Font("Open Sans", Font.ITALIC, 10));

		// JLabels for skills
		technologyskills = new JLabel("TECHNOLOGY SKILLS");
		technologyskills.setBounds(220, 650, 200, 20);
		technologyskills.setFont(new Font("Open Sans", Font.BOLD, 12));

		languageskills = new JLabel("LANGUAGE SKILLS");
		languageskills.setBounds(480, 650, 200, 20);
		languageskills.setFont(new Font("Open Sans", Font.BOLD, 12));

		otherskills = new JLabel("OTHER SKILLS");
		otherskills.setBounds(740, 650, 200, 20);
		otherskills.setFont(new Font("Open Sans", Font.BOLD, 12));



		// JTextFields for personal information
		input_firstname = new JTextField(10);
		input_firstname.setBounds(150, 50, 150, 20);

		input_lastname = new JTextField(10);
		input_lastname.setBounds(150, 80, 150, 20);

		input_address = new JTextField(10);
		input_address.setBounds(150, 110, 150, 20);

		input_city = new JTextField(10);
		input_city.setBounds(150, 140, 150, 20);

		input_state = new JTextField(10);
		input_state.setBounds(150, 170, 150, 20);

		input_zip = new JTextField(10);
		input_zip.setBounds(150, 200, 150, 20);

		input_email = new JTextField(10);
		input_email.setBounds(150, 230, 150, 20);

		input_phone = new JTextField(10);
		input_phone.setBounds(150, 260, 150, 20);


		// JTextField for objective
		input_objective = new JTextField(10);
		input_objective.setBounds(115, 340, 200, 20);		


		// JTextFields for education
		input_university = new JTextField(10);
		input_university.setBounds(470, 50, 170, 20);

		input_university_city = new JTextField(10);
		input_university_city.setBounds(470, 80, 170, 20);

		input_university_state = new JTextField(10);
		input_university_state.setBounds(720, 80, 80, 20);

		input_university_graduationdate = new JTextField(10);
		input_university_graduationdate.setBounds(530, 120, 90, 20);

		input_university_gpa = new JTextField(10);
		input_university_gpa.setBounds(450, 150, 50, 20);

		input_university_degree = new JTextField(10);
		input_university_degree.setBounds(720, 120, 170, 20);

		input_highschool = new JTextField(10);
		input_highschool.setBounds(480, 220, 170, 20);

		input_highschool_city = new JTextField(10);
		input_highschool_city.setBounds(480, 250, 170, 20);

		input_highschool_state = new JTextField(10);
		input_highschool_state.setBounds(720, 250, 80, 20);

		input_highschool_graduationdate = new JTextField(10);
		input_highschool_graduationdate.setBounds(530, 290, 90, 20);

		input_highschool_diploma = new JTextField(10);
		input_highschool_diploma.setBounds(760, 290, 110, 20);

		input_highschool_gpa = new JTextField(10);
		input_highschool_gpa.setBounds(450, 320, 50, 20);



		// JTextAreas for work
		input_jobs = new JTextArea(5, 15);
		scroll1 = new JScrollPane(input_jobs, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll1.setBounds(50, 490, 140, 100);

		input_positions = new JTextArea(5, 15);
		scroll2 = new JScrollPane(input_positions, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll2.setBounds(210, 490, 140, 100);

		input_workdone = new JTextArea(5, 15);
		scroll3 = new JScrollPane(input_workdone, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll3.setBounds(370, 490, 200, 100);

		input_dates = new JTextArea(5, 15);
		scroll4 = new JScrollPane(input_dates, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll4.setBounds(590, 490, 200, 100);

		input_workcity = new JTextArea(5, 15);
		scroll5 = new JScrollPane(input_workcity, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll5.setBounds(810, 490, 120, 100);

		input_workstate = new JTextArea(5, 15);
		scroll6 = new JScrollPane(input_workstate, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll6.setBounds(950, 490, 100, 100);


		// JTextAreas for skills
		input_technologyskills = new JTextArea(5, 15);
		scroll7 = new JScrollPane(input_technologyskills, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll7.setBounds(215, 670, 140, 100);

		input_languageskills = new JTextArea(5, 15);
		scroll8 = new JScrollPane(input_languageskills, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll8.setBounds(470, 670, 140, 100);

		input_otherskills = new JTextArea(5, 15);
		scroll9 = new JScrollPane(input_otherskills, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll9.setBounds(720, 670, 140, 100);



		// JButtons for reset and generate
		button1 = new JButton("Reset");
		button1.setBounds(950, 110, 90, 80);
		button1.setBackground(Color.DARK_GRAY);
		button1.setOpaque(true);
		button1.setForeground(Color.CYAN);
		button1.setFont(new Font("Open Sans", Font.BOLD, 16));


		button2 = new JButton("Generate");
		button2.setBounds(950, 210, 90, 80);
		button2.setBackground(Color.DARK_GRAY);
		button2.setOpaque(true);
		button2.setForeground(Color.CYAN);
		button2.setFont(new Font("Open Sans", Font.BOLD, 16));
	}


	// setUpGUI method - sets up the GUI
	public void setUpGUI() {

		// sets size of frame created in constructor
		frame.setSize(width, height);
		// set title of frame created in constructor
		frame.setTitle("Resume Builder");


		// creates container object and 
		// sets to getContentPane method from the JFrame "frame"
		Container cp = frame.getContentPane();

		// content pane calls method setLayout and sets it to null - no layout is used
		cp.setLayout(null);

		// content pane sets background color
		cp.setBackground(Color.LIGHT_GRAY);



		// adds labels to content pane
		cp.add(personalinfotitle);
		cp.add(firstname);
		cp.add(lastname);
		cp.add(address);
		cp.add(city);
		cp.add(state);
		cp.add(zip);
		cp.add(email);
		cp.add(phone);

		cp.add(objectivetitle);
		cp.add(objective);

		cp.add(educationtitle);
		cp.add(university);
		cp.add(university_city);
		cp.add(university_state);
		cp.add(university_graduationdate);
		cp.add(university_gpa);
		cp.add(university_degree);
		cp.add(highschool);
		cp.add(highschool_city);
		cp.add(highschool_state);
		cp.add(highschool_graduationdate);
		cp.add(highschool_diploma);
		cp.add(highschool_gpa);

		cp.add(worktitle);
		cp.add(workdesc);
		cp.add(workdesc2);
		cp.add(jobs);
		cp.add(positions);
		cp.add(workdone);
		cp.add(dates);
		cp.add(workcity);
		cp.add(workstate);

		cp.add(skillstitle);
		cp.add(skillsdesc);
		cp.add(technologyskills);
		cp.add(languageskills);
		cp.add(otherskills);

		// adds textfields to content pane
		cp.add(input_firstname);
		cp.add(input_lastname);
		cp.add(input_address);
		cp.add(input_city);
		cp.add(input_state);
		cp.add(input_zip);
		cp.add(input_email);
		cp.add(input_phone);

		cp.add(input_objective);

		cp.add(input_university);
		cp.add(input_university_city);
		cp.add(input_university_state);
		cp.add(input_university_graduationdate);
		cp.add(input_university_gpa);
		cp.add(input_university_degree);
		cp.add(input_highschool);
		cp.add(input_highschool_city);
		cp.add(input_highschool_state);
		cp.add(input_highschool_graduationdate);
		cp.add(input_highschool_diploma);
		cp.add(input_highschool_gpa);

		// adds textareas and scrollpanes to content pane
		cp.add(scroll1);
		cp.add(scroll2);
		cp.add(scroll3);
		cp.add(scroll4);
		cp.add(scroll5);
		cp.add(scroll6);

		cp.add(scroll7);
		cp.add(scroll8);
		cp.add(scroll9);

		// adds buttons to content pane
		cp.add(button1);
		cp.add(button2);	



		// ends program when it is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	


		// allows the GUI to be visible
		// always do this last, after everything else is set
		frame.setVisible(true);
	}


	// setUpButtonListeners method - sets up what happens when the buttons are clicked
	public void setUpButtonListeners(){

		// creates an ActionListener object
		ActionListener buttonListener = new ActionListener() {

			// actionPerformed method - what happens when a button is clicked
			public void actionPerformed(ActionEvent ae) {

				// EventSource - which button was clicked
				Object o = ae.getSource();

				// if button clicked was reset button
				if (o == button1) {

					// call resetInput method
					resetInput();
				}
				// else if button clicked was generate button
				else if (o == button2) {			

					// call writeToPDF method
					try {
						writeToPDF();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}			
		};


		// button calls the method addActionListener and uses the ActionListener object created above
		// so when an action is performed on the button, it uses the actionPerformed method above
		button1.addActionListener(buttonListener);	

		// add bustonListener to button2
		button2.addActionListener(buttonListener);		
	}


	// resetInput method - resets all input fields
	private void resetInput() {

		// sets all input fields to blank
		input_firstname.setText("");
		input_lastname.setText("");
		input_address.setText("");
		input_city.setText("");
		input_state.setText("");
		input_zip.setText("");
		input_email.setText("");
		input_phone.setText("");
		input_objective.setText("");
		input_university.setText("");
		input_university_city.setText("");
		input_university_state.setText("");
		input_university_graduationdate.setText("");
		input_university_degree.setText("");
		input_university_gpa.setText("");
		input_highschool.setText("");
		input_highschool_city.setText("");
		input_highschool_state.setText("");
		input_highschool_graduationdate.setText("");
		input_highschool_diploma.setText("");
		input_highschool_gpa.setText("");
		input_jobs.setText("");
		input_positions.setText("");
		input_workdone.setText("");
		input_dates.setText("");
		input_workcity.setText("");
		input_workstate.setText("");
		input_technologyskills.setText("");
		input_languageskills.setText("");
		input_otherskills.setText("");	
	}


	// writeToPDF method - creates PDF filed based on user inputs
	private void writeToPDF() throws IOException {

		// destination to save PDF file
		//String dest = "/Users/salemananwari/desktop/testpdf.pdf";

		// initialize PDF writer
		//PdfWriter writer = new PdfWriter((new File(dest)));

		// adds JFileChooser object to JFrame
		// uses JFileChooser to be able to choose destination of where to save file
		int userSelection = chooser.showSaveDialog(frame);
		if (userSelection == JFileChooser.APPROVE_OPTION) {

			File fileToSave = chooser.getSelectedFile();

			try {

				// initialize PDF writer with file selected from JFileChooser (and add automatic .pdf extension to it)
				PdfWriter writer = new PdfWriter(new FileOutputStream(fileToSave + ".pdf"));
				// initialize PDF document
				PdfDocument pdfDocument = new PdfDocument(writer);
				// initialize document
				Document document = new Document(pdfDocument);

				// set line spacing for entire document
				document.setProperty(Property.LEADING, new Leading(Leading.MULTIPLIED, 0f));
				// set font for entire document
				PdfFont docFont = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
				document.setFont(docFont);

				// style for entire document except title
				Style style = new Style();
				style.setFontSize(11);



				// title being added
				Style titlestyle = new Style();
				titlestyle.setFontSize(16).setBold();

				Paragraph title1 = new Paragraph();
				title1.add(new Text(input_firstname.getText() + " " + input_lastname.getText())).addStyle(titlestyle);
				document.add(title1);

				Paragraph title2 = new Paragraph();
				title2.add(new Text(input_email.getText()).addStyle(style));
				document.add(title2);

				if (input_address.getText().isEmpty() == false) {

					Paragraph title3 = new Paragraph();
					addEmptyLine(title3, 1);
					title3.add(new Text("Current Address: ").addStyle(style).setBold());
					title3.add(new Text(input_address.getText() + " • " + 
							input_city.getText() + ", " + input_state.getText() + " " + input_zip.getText() + 
							" • " + input_phone.getText()).addStyle(style));
					document.add(title3);

					Paragraph title4 = new Paragraph();
					title4.add(new Text("----------------------------------------------------------------------------------------------------------------------------------").setBold());
					document.add(title4);
				}



				// objective being added      
				// if they know what their objective is
				if (input_objective.getText().isEmpty() == false) {

					Paragraph objective = new Paragraph();
					addEmptyLine(objective, 1);
					objective.add(new Text("OBJECTIVE").addStyle(style).setBold());
					objective.add(new Tab());
					objective.addTabStops(new TabStop(125, TabAlignment.LEFT));
					objective.add(new Text(input_objective.getText()).addStyle(style));
					document.add(objective);
				}



				// education being added    
				// if they haven't went to university but have gone to high school
				if (input_university.getText().isEmpty() == true && input_highschool.getText().isEmpty() == false) {

					// high school being added
					Paragraph education4 = new Paragraph();
					addEmptyLine(education4, 1);
					education4.add(new Text("EDUCATION").addStyle(style).setBold());					
					education4.add(new Tab());
					education4.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education4.add(new Text(input_highschool.getText()).addStyle(style).setBold());
					education4.add(new Text(", " + input_highschool_city.getText() + ", " + input_highschool_state.getText()).addStyle(style));
					education4.add(new Tab());
					education4.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
					education4.add(new Text(input_highschool_graduationdate.getText()).addStyle(style));
					document.add(education4);    

					Paragraph education5 = new Paragraph();
					education5.add(new Tab());
					education5.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education5.add(new Text(input_highschool_diploma.getText() + " Diploma").addStyle(style).setItalic());
					document.add(education5); 

					Paragraph education6 = new Paragraph();
					education6.add(new Tab());
					education6.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education6.add(new Text("GPA: " + input_highschool_gpa.getText()).addStyle(style));
					document.add(education6); 		
				}
				// if they went to university but didn't go to high school
				else if (input_university.getText().isEmpty() == false && input_highschool.getText().isEmpty() == true) {

					// university being added
					Paragraph education1 = new Paragraph();
					addEmptyLine(education1, 1);
					education1.add(new Text("EDUCATION").addStyle(style).setBold());
					education1.add(new Tab());
					education1.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education1.add(new Text(input_university.getText()).addStyle(style).setBold());
					education1.add(new Text(", " + input_university_city.getText() + ", " + input_university_state.getText()).addStyle(style));
					education1.add(new Tab());
					education1.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
					education1.add(new Text(input_university_graduationdate.getText()).addStyle(style));
					document.add(education1);   

					Paragraph education2 = new Paragraph();
					education2.add(new Tab());
					education2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education2.add(new Text(input_university_degree.getText()).addStyle(style)).setItalic();
					document.add(education2);

					Paragraph education3 = new Paragraph();
					education3.add(new Tab());
					education3.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education3.add(new Text("GPA: " + input_university_gpa.getText()).addStyle(style));
					document.add(education3);	
				}
				// if they went to both university and high school
				else if (input_university.getText().isEmpty() == false && input_highschool.getText().isEmpty() == false) {

					// university being added
					Paragraph education1 = new Paragraph();
					addEmptyLine(education1, 1);
					education1.add(new Text("EDUCATION").addStyle(style).setBold());
					education1.add(new Tab());
					education1.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education1.add(new Text(input_university.getText()).addStyle(style).setBold());
					education1.add(new Text(", " + input_university_city.getText() + ", " + input_university_state.getText()).addStyle(style));
					education1.add(new Tab());
					education1.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
					education1.add(new Text(input_university_graduationdate.getText()).addStyle(style));
					document.add(education1);   

					Paragraph education2 = new Paragraph();
					education2.add(new Tab());
					education2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education2.add(new Text(input_university_degree.getText()).addStyle(style)).setItalic();
					document.add(education2);

					Paragraph education3 = new Paragraph();
					education3.add(new Tab());
					education3.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education3.add(new Text("GPA: " + input_university_gpa.getText()).addStyle(style));
					document.add(education3);	

					// high school being added
					Paragraph education4 = new Paragraph();
					addEmptyLine(education4, 1);
					education4.add(new Tab());
					education4.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education4.add(new Text(input_highschool.getText()).addStyle(style).setBold());
					education4.add(new Text(", " + input_highschool_city.getText() + ", " + input_highschool_state.getText()).addStyle(style));
					education4.add(new Tab());
					education4.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
					education4.add(new Text(input_highschool_graduationdate.getText()).addStyle(style));
					document.add(education4);    

					Paragraph education5 = new Paragraph();
					education5.add(new Tab());
					education5.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education5.add(new Text(input_highschool_diploma.getText() + " Diploma").addStyle(style).setItalic());
					document.add(education5); 

					Paragraph education6 = new Paragraph();
					education6.add(new Tab());
					education6.addTabStops(new TabStop(125, TabAlignment.LEFT));
					education6.add(new Text("GPA: " + input_highschool_gpa.getText()).addStyle(style));
					document.add(education6);
				}



				// splitting job info textareas line by line
				String[] jobs = input_jobs.getText().split("\\n");
				String[] cities = input_workcity.getText().split("\\n");
				String[] states = input_workstate.getText().split("\\n");
				String[] dates = input_dates.getText().split("\\n");
				String[] positions = input_positions.getText().split("\\n");
				String[] workdone = input_workdone.getText().split("\\n");


				// work being added    
				// if they have worked before
				if (input_jobs.getText().isEmpty() == false) {

					// first job being added
					Paragraph work = new Paragraph();
					addEmptyLine(work, 1);
					work.add(new Text("WORK").addStyle(style).setBold());
					work.add(new Tab());
					work.addTabStops(new TabStop(125, TabAlignment.LEFT));
					work.add(new Text(jobs[0]).addStyle(style).setBold());
					work.add(new Text(", " + cities[0] + ", " + states[0]).addStyle(style));
					work.add(new Tab());
					work.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
					work.add(new Text(dates[0]).addStyle(style));
					document.add(work);

					Paragraph work2 = new Paragraph();
					work2.add(new Text("EXPERIENCE").addStyle(style).setBold());
					work2.add(new Tab());
					work2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					work2.add(new Text(positions[0]).addStyle(style).setItalic());
					document.add(work2); 

					Paragraph work3 = new Paragraph();    
					String[] workcomplete = workdone[0].split("\\, ");        
					for (int i = 0; i < workcomplete.length; i++) {

						work3 = new Paragraph();
						work3.add(new Tab());
						work3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						work3.add(new Text(" • " + workcomplete[i]));
						document.add(work3);
					}

					// rest of jobs being added
					Paragraph restofjobs = new Paragraph();
					Paragraph restofjobs2 = new Paragraph();
					Paragraph restofjobs3 = new Paragraph();
					for (int i = 1; i < jobs.length; i++) {

						restofjobs = new Paragraph();
						addEmptyLine(restofjobs, 1);
						restofjobs.add(new Tab());
						restofjobs.addTabStops(new TabStop(125, TabAlignment.LEFT));
						restofjobs.add(new Text(jobs[i]).addStyle(style).setBold());
						restofjobs.add(new Text(", " + cities[i] + ", " + states[i]).addStyle(style));
						restofjobs.add(new Tab());
						restofjobs.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
						restofjobs.add(new Text(dates[i]).addStyle(style));
						document.add(restofjobs);

						restofjobs2 = new Paragraph();
						restofjobs2.add(new Tab());
						restofjobs2.addTabStops(new TabStop(125, TabAlignment.LEFT));
						restofjobs2.add(new Text(positions[i]).addStyle(style).setItalic());
						document.add(restofjobs2); 

						String[] restofjobscomplete = workdone[i].split("\\, ");
						for (int j = 0; j < restofjobscomplete.length; j++) {

							restofjobs3 = new Paragraph();
							restofjobs3.add(new Tab());
							restofjobs3.addTabStops(new TabStop(125, TabAlignment.LEFT));
							restofjobs3.add(new Text("• " + restofjobscomplete[j]));
							document.add(restofjobs3);
						}      
					}
				}



				// splitting skills info textareas line by line
				String[] technologyskills = input_technologyskills.getText().split("\\n");
				String[] languageskills = input_languageskills.getText().split("\\n");
				String[] otherskills = input_otherskills.getText().split("\\n");


				// skills being added         
				// if they have technology skills, language skills, and other skills
				if (input_technologyskills.getText().isEmpty() == false && input_languageskills.getText().isEmpty() == false && input_otherskills.getText().isEmpty() == false) {

					// technology skills being added
					Paragraph techskills = new Paragraph();
					addEmptyLine(techskills, 1);
					techskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					techskills.add(new Tab());
					techskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills.add(new Text("Technology Skills -").addStyle(style).setBold());
					document.add(techskills);

					Paragraph techskills2 = new Paragraph();
					techskills2.add(new Text("SKILLS").addStyle(style).setBold());
					techskills2.add(new Tab());
					techskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(techskills2);

					// all tech skills being added
					Paragraph techskills3 = new Paragraph();   
					for (int i = 0; i < technologyskills.length; i++) {

						techskills3 = new Paragraph();
						techskills3.add(new Tab());
						techskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						techskills3.add(new Text(" - " + technologyskills[i]).addStyle(style));
						document.add(techskills3);
					}



					// language skills being added    
					Paragraph langskills = new Paragraph();
					addEmptyLine(langskills, 1);
					langskills.add(new Tab());
					langskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills.add(new Text("Language Skills -").addStyle(style).setBold());
					document.add(langskills);

					Paragraph langskills2 = new Paragraph();
					langskills2.add(new Tab());
					langskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(langskills2);

					// all lang skills being added
					Paragraph langskills3 = new Paragraph();
					for (int i = 0; i < languageskills.length; i++) {

						langskills3 = new Paragraph();
						langskills3.add(new Tab());
						langskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						langskills3.add(new Text(" - " + languageskills[i]).addStyle(style));
						document.add(langskills3);
					}



					// other skills being added    
					Paragraph other_skills = new Paragraph();
					addEmptyLine(other_skills, 1);
					other_skills.add(new Tab());
					other_skills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills.add(new Text("Other Skills -").addStyle(style).setBold());
					document.add(other_skills);

					Paragraph other_skills2 = new Paragraph();
					other_skills2.add(new Tab());
					other_skills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(other_skills2);

					// all other skills being added
					Paragraph other_skills3 = new Paragraph();
					for (int i = 0; i < otherskills.length; i++) {

						other_skills3 = new Paragraph();
						other_skills3.add(new Tab());
						other_skills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						other_skills3.add(new Text(" - " + otherskills[i]).addStyle(style));
						document.add(other_skills3);
					}
				}
				// if they have technology skills and language skills but no other skills
				else if (input_technologyskills.getText().isEmpty() == false && input_languageskills.getText().isEmpty() == false && input_otherskills.getText().isEmpty() == true) {

					// technology skills being added
					Paragraph techskills = new Paragraph();
					addEmptyLine(techskills, 1);
					techskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					techskills.add(new Tab());
					techskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills.add(new Text("Technology Skills -").addStyle(style).setBold());
					document.add(techskills);

					Paragraph techskills2 = new Paragraph();
					techskills2.add(new Text("SKILLS").addStyle(style).setBold());
					techskills2.add(new Tab());
					techskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(techskills2);

					// all tech skills being added
					Paragraph techskills3 = new Paragraph();   
					for (int i = 0; i < technologyskills.length; i++) {

						techskills3 = new Paragraph();
						techskills3.add(new Tab());
						techskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						techskills3.add(new Text(" - " + technologyskills[i]).addStyle(style));
						document.add(techskills3);
					}



					// language skills being added    
					Paragraph langskills = new Paragraph();
					addEmptyLine(langskills, 1);
					langskills.add(new Tab());
					langskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills.add(new Text("Language Skills -").addStyle(style).setBold());
					document.add(langskills);

					Paragraph langskills2 = new Paragraph();
					langskills2.add(new Tab());
					langskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(langskills2);

					// all lang skills being added
					Paragraph langskills3 = new Paragraph();
					for (int i = 0; i < languageskills.length; i++) {

						langskills3 = new Paragraph();
						langskills3.add(new Tab());
						langskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						langskills3.add(new Text(" - " + languageskills[i]).addStyle(style));
						document.add(langskills3);
					}
				}
				// if they have technology skills only
				else if (input_technologyskills.getText().isEmpty() == false && input_languageskills.getText().isEmpty() == true && input_otherskills.getText().isEmpty() == true) {

					// technology skills being added
					Paragraph techskills = new Paragraph();
					addEmptyLine(techskills, 1);
					techskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					techskills.add(new Tab());
					techskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills.add(new Text("Technology Skills -").addStyle(style).setBold());
					document.add(techskills);

					Paragraph techskills2 = new Paragraph();
					techskills2.add(new Text("SKILLS").addStyle(style).setBold());
					techskills2.add(new Tab());
					techskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(techskills2);

					// all tech skills being added
					Paragraph techskills3 = new Paragraph();   
					for (int i = 0; i < technologyskills.length; i++) {

						techskills3 = new Paragraph();
						techskills3.add(new Tab());
						techskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						techskills3.add(new Text(" - " + technologyskills[i]).addStyle(style));
						document.add(techskills3);
					}
				}
				// if they have technology skills and other skills but no language skills
				else if (input_technologyskills.getText().isEmpty() == false && input_languageskills.getText().isEmpty() == true && input_otherskills.getText().isEmpty() == false) {

					// technology skills being added
					Paragraph techskills = new Paragraph();
					addEmptyLine(techskills, 1);
					techskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					techskills.add(new Tab());
					techskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills.add(new Text("Technology Skills -").addStyle(style).setBold());
					document.add(techskills);

					Paragraph techskills2 = new Paragraph();
					techskills2.add(new Text("SKILLS").addStyle(style).setBold());
					techskills2.add(new Tab());
					techskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					techskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(techskills2);

					// all tech skills being added
					Paragraph techskills3 = new Paragraph();   
					for (int i = 0; i < technologyskills.length; i++) {

						techskills3 = new Paragraph();
						techskills3.add(new Tab());
						techskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						techskills3.add(new Text(" - " + technologyskills[i]).addStyle(style));
						document.add(techskills3);
					}



					// other skills being added    
					Paragraph other_skills = new Paragraph();
					addEmptyLine(other_skills, 1);
					other_skills.add(new Tab());
					other_skills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills.add(new Text("Other Skills -").addStyle(style).setBold());
					document.add(other_skills);

					Paragraph other_skills2 = new Paragraph();
					other_skills2.add(new Tab());
					other_skills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(other_skills2);

					// all other skills being added
					Paragraph other_skills3 = new Paragraph();
					for (int i = 0; i < otherskills.length; i++) {

						other_skills3 = new Paragraph();
						other_skills3.add(new Tab());
						other_skills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						other_skills3.add(new Text(" - " + otherskills[i]).addStyle(style));
						document.add(other_skills3);
					}
				}
				// if they have language skills and other skills but no technology skills
				else if (input_technologyskills.getText().isEmpty() == true && input_languageskills.getText().isEmpty() == false && input_otherskills.getText().isEmpty() == false) {

					// language skills being added
					Paragraph langskills = new Paragraph();
					addEmptyLine(langskills, 1);
					langskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					langskills.add(new Tab());
					langskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills.add(new Text("Language Skills -").addStyle(style).setBold());
					document.add(langskills);

					Paragraph langskills2 = new Paragraph();
					langskills2.add(new Text("SKILLS").addStyle(style).setBold());
					langskills2.add(new Tab());
					langskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(langskills2);

					// all lang skills being added
					Paragraph langskills3 = new Paragraph();
					for (int i = 0; i < languageskills.length; i++) {

						langskills3 = new Paragraph();
						langskills3.add(new Tab());
						langskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						langskills3.add(new Text(" - " + languageskills[i]).addStyle(style));
						document.add(langskills3);
					}



					// other skills being added    
					Paragraph other_skills = new Paragraph();
					addEmptyLine(other_skills, 1);
					other_skills.add(new Tab());
					other_skills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills.add(new Text("Other Skills -").addStyle(style).setBold());
					document.add(other_skills);

					Paragraph other_skills2 = new Paragraph();
					other_skills2.add(new Tab());
					other_skills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(other_skills2);

					// all other skills being added
					Paragraph other_skills3 = new Paragraph();
					for (int i = 0; i < otherskills.length; i++) {

						other_skills3 = new Paragraph();
						other_skills3.add(new Tab());
						other_skills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						other_skills3.add(new Text(" - " + otherskills[i]).addStyle(style));
						document.add(other_skills3);
					}
				}
				// if they have language skills only
				else if (input_technologyskills.getText().isEmpty() == true && input_languageskills.getText().isEmpty() == false && input_otherskills.getText().isEmpty() == true) {

					// language skills being added
					Paragraph langskills = new Paragraph();
					addEmptyLine(langskills, 1);
					langskills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					langskills.add(new Tab());
					langskills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills.add(new Text("Language Skills -").addStyle(style).setBold());
					document.add(langskills);

					Paragraph langskills2 = new Paragraph();
					langskills2.add(new Text("SKILLS").addStyle(style).setBold());
					langskills2.add(new Tab());
					langskills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					langskills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(langskills2);

					// all lang skills being added
					Paragraph langskills3 = new Paragraph();
					for (int i = 0; i < languageskills.length; i++) {

						langskills3 = new Paragraph();
						langskills3.add(new Tab());
						langskills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						langskills3.add(new Text(" - " + languageskills[i]).addStyle(style));
						document.add(langskills3);
					}
				}
				// if they have other skills only
				else if (input_technologyskills.getText().isEmpty() == true && input_languageskills.getText().isEmpty() == true && input_otherskills.getText().isEmpty() == false) {

					// other skills being added
					Paragraph other_skills = new Paragraph();
					addEmptyLine(other_skills, 1);
					other_skills.add(new Text("PROFESSIONAL").addStyle(style).setBold());
					other_skills.add(new Tab());
					other_skills.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills.add(new Text("Other Skills -").addStyle(style).setBold());
					document.add(other_skills);

					Paragraph other_skills2 = new Paragraph();
					other_skills2.add(new Text("SKILLS").addStyle(style).setBold());
					other_skills2.add(new Tab());
					other_skills2.addTabStops(new TabStop(125, TabAlignment.LEFT));
					other_skills2.add(new Text("------------------------").addStyle(style).setBold());
					document.add(other_skills2);

					// all other skills being added
					Paragraph other_skills3 = new Paragraph();
					for (int i = 0; i < otherskills.length; i++) {

						other_skills3 = new Paragraph();
						other_skills3.add(new Tab());
						other_skills3.addTabStops(new TabStop(125, TabAlignment.LEFT));
						other_skills3.add(new Text(" - " + otherskills[i]).addStyle(style));
						document.add(other_skills3);
					}
				}



				// close document
				document.close();

				// JOptionPane success message
				JOptionPane.showMessageDialog(null, "Resume Generated!");
			}
			catch(Exception e) {
				
				// JOptionPane error message
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}


	// addEmptyLine method - adds empty lines to paragraphs
	private static void addEmptyLine(Paragraph paragraph, int number) {

		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph("\n"));
		}
	}
}