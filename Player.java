package Project1;

import java.util.Random;

public class Player extends NeveraDullMoment {

	// need to have instance variables for my character attributes. Make sure I use public Getters and Setters
	private int potential;
	private int honesty;
	private int competence;


	public Player(int potential, int honesty, int competence) { //Constructor with my arguments
		this.potential = potential;
		this.competence = competence;
		this.honesty = honesty;

	}

	public  Player SelectedEmployee() { //This method is for my employees
		String[]  employeeList = {"Charlie","Amber","Samantha"};

		Random random = new Random();// using this to generate a random selection of the characters instead of just letting the user pick the player
		int index = random.nextInt(employeeList.length);

		String SelectedEmployee =  employeeList[index];

		System.out.println(" You are: " +  SelectedEmployee); 

		Player selectedEmployee = new Player();

		if (SelectedEmployee.equalsIgnoreCase("Charlie")) { // if there is a space before the name of the character in the parenthesis, it will not show my points for the character
			System.out.println( " The procrastinator. You either wait until the last minute to complete tasks, suggest that you have no idea what happened or try to get other "
					+ " employees to help you");

			selectedEmployee.setPotential(19);
			selectedEmployee.setCompetence(17);
			selectedEmployee.setHonesty(14);

			System.out.println();

		} else if (SelectedEmployee.equalsIgnoreCase("Amber")) {
			System.out.println( " The Average Worker. You do the job that is required and nothing more. ");

			selectedEmployee.setPotential(16);
			selectedEmployee.setCompetence(13);
			selectedEmployee.setHonesty(21);

			System.out.println();

		} else if (SelectedEmployee.equalsIgnoreCase( "Samantha")) {
			System.out.println( " You go above and beyond your job and will volunteer for everything if asked.");

			selectedEmployee.setPotential(21);
			selectedEmployee.setCompetence(10);
			selectedEmployee.setHonesty(19);

			System.out.println();
		}
		return selectedEmployee;

	}	

	public Player () {} // this will be my player constructor. I will be calling this in my main method

	
	public void updatePotential(int amount) {
		this.potential = amount;
	}

	
	public void updateCompetence(int amount) {
		this.competence = amount;
	}

	
	public void updateHonesty(int amount) {
		this.honesty = amount;
	}

	public int getPotential() {
		return this.potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

	public int getHonesty() {
		return this.honesty;
	}

	public void setHonesty(int honesty) {
		this.honesty = honesty;
	}

	public int getCompetence() {
		return this.competence;
	}

	public void setCompetence(int competence) {
		this.competence = competence;
	}

}




