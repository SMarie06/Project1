
package Project1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NeveraDullMoment {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean restart = true; 

		do	 {
			// Game logic goes here
			System.out.println(" Welcome to Never a Dull Moment!!");

			System.out.println();

			System.out.println(" Please enter your name! ");
			String name = in.nextLine();

			System.out.println();

			System.out.println(" Hello "  +  name  +  " it is nice to meet you!!!");

			System.out.println();


			Player pick = new Player();
			Player SelectedEmployee = pick.SelectedEmployee();
			System.out.println(" Potential: " + SelectedEmployee.getPotential());
			System.out.println(" Honesty: " + SelectedEmployee.getHonesty());
			System.out.println(" Competence: " + SelectedEmployee.getCompetence());

			System.out.println();

			System.out.println(" Press any key to continue..."); 
			String press = in.nextLine();

			TheScenes.scenario(in);

			ArrayList < Integer > scenes = new ArrayList < Integer > (); // This helped to not see the same scene twice when playing the whole game once 
			Random random = new Random();// 

			while  (scenes.size() < 5) {  //adds random numbers into list I made and checks if I already used it so I do not use again
				int rand = random.nextInt(5);
				if (!scenes.contains(rand)) {
					scenes.add(rand);
				}
			}

			for(int i: scenes) {

				System.out.println(" Your scene is: " + i); 

				if (i == 0 ) {
					TheScenes.theReport(in, SelectedEmployee);

					System.out.println();

				} else if (i == 1 )  {
					TheScenes.theMeeting(in, SelectedEmployee);

					System.out.println();

				} else if (i == 2 )  {
					TheScenes.theOvertime(in, SelectedEmployee);

					System.out.println();

				} else if (i == 3 )  {
					TheScenes.farewellLunch(in, SelectedEmployee);

					System.out.println();

				} else if (i == 4 )  {
					TheScenes.missingMoney(in, SelectedEmployee);

					System.out.println();
			
				}

				System.out.println();

			}

			TheScenes.futurePosition(in, SelectedEmployee);

			System.out.print(" Do you want to play again? (Y/N): ");
			String response = in.nextLine();

			if (response.equalsIgnoreCase("Y")) {
				
				System.out.println(" Restarting game...");
			} else if (response.equalsIgnoreCase("N")) {
				
				System.out.println(" Thank you for playing Never a Dull Moment. See you again soon!");
				restart = false;
			} else {

			}
			
		} while (restart);

	}

}

