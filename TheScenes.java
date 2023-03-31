package Project1;

import java.util.Scanner;

public class TheScenes extends NeveraDullMoment {

	public static void scenario(Scanner in) { // This will be pulling the scanner from my main method in the NeveraDullMomentClass

		System.out.println(" Scenario "); 
		System.out.println(" You have been working as an accounting clerk at BG&C Accounting. You have just been told of a potential promotion. "
				+ " You'll be responsible for preparing spreadsheets, reviewing financial statements, and assisting with audits with the"
				+ " occasional last- minute tasks. As you settle into your new role, you realize the importance of attention to detail"
				+ " in accounting. You are expected to spend long hours poring over spreadsheets, double-checking calculations, ensuring"
				+ " every number is accurate, and every dollar is accounted for. It is challenging work, but you are eager to take on the  "
				+ " new role. As the weeks and months pass, you become more confident in your abilities and more vested in the success of"
				+ " the company. You have been working towards this promotion for a few months now."); 

		System.out.println();
	}

	public static Player theReport(Scanner in, Player SelectedEmployee) { 

		System.out.println(" The Report ");

		System.out.println();

		System.out.println(" You spent the weekend relaxing and watching tv. It is the first weekend in a few months where you didn’t have to" 
				+ " bring any work home. You head into the office after grabbing some breakfast from a local restaurant. As you sit down at  "
				+ " your desk, your supervisor walks over and asks about your weekend and if you completed the report that she sent you Friday"
				+ " evening. Quickly you... "); 

		System.out.println();



		boolean yourReport = false;
		while (!yourReport) {// need something here that allows you to pick between 1- 3 and then give you the outcome of that answer
			System.out.println(" 1. Lie and say that you are finished and will send it right away.");
			System.out.println(" 2. Admit that you forgot to do it and apologize.");
			System.out.println(" 3. Tell her you never received it.");

			String report = in.nextLine();

			System.out.println();

			if (report.equals("1")) { // the idea is to have the points adjust based on your multiple choice selections
				System.out.println(" She tells you great job and she is looking forward to reading the report and walks back to her office. "
						+ " You're now in a panic trying to figure out how fast you can finish the report before she comes back for it. "
						+ " You reach out to a coworker and ask if they can do the report for you and you will owe them one. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-10); 
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+3);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()-8);

				yourReport = true;
			} else if (report.equals("2")) {
				System.out.println(" Your supervisor shows slight disappointment in your lack of follow through and tells you that you need "
						+ "to do better. You are disappointed that you made this mistake and decide that you need to focus more and get this "
						+ "report done. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()+4);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()-4);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() +14);

				yourReport = true;
			} else if (report.equals("3")) {
				System.out.println(" She apologizes and say's she will send it again. She gives you until Wednesday to finish the report. As "
						+ "she walks away you feel relieved that you have time to finish the report you completely forgot about. You are "
						+ "surprised that you actually got away with that. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-2);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+1);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() -12);

				yourReport = true;
			} else {
				
				System.out.println(" Invalid input. Please select 1, 2 or 3"); 
			}

		}

		// Needed a way to calculate the points per scenario using the starting values as a baseline
		System.out.println(" Current Potential points are... " + SelectedEmployee.getPotential());
		System.out.println(" Current Competence points are... " + SelectedEmployee.getCompetence());
		System.out.println(" Current Honesty points are... " + SelectedEmployee.getHonesty());
		return SelectedEmployee;
	}

	public static Player theMeeting(Scanner in, Player SelectedEmployee) {

		System.out.println(" The Meeting ");

		System.out.println();

		System.out.println(" The weekly meeting is about to start, and you have discovered that the spreadsheet you worked on no longer has any"
				+ " of the updated information. In a panic, you start inputting random numbers to fill in the spreadsheet, so you do not go to "
				+ " the meeting empty handed. You report the information on your spreadsheet and one of the accountants asks you a question"
				+ " regarding some of the amounts on your spreadsheet. What is your response...");

		System.out.println();

		boolean yourMeeting = false;
		while (!yourMeeting) {

			System.out.println(" 1. Tell them you will get back to the about that.");
			System.out.println(" 2. Say, I just used this week’s winning lottery numbers.");
			System.out.println(" 3. Immediately start crying and explain what happened.");

			String themeeting = in.nextLine();

			System.out.println();

			if(themeeting.equals("1")) {
				System.out.println(" You go back to your desk and immediately start working on putting in the right information. When you give "
						+ "them the spreadsheet, you state that you inadvertently pulled the wrong spreadsheet for the meeting because you were "
						+ "in a hurry and that this was the correct one.");
				// This adjusts the points from your given to adjust based on your selection. It is like this for each scenario
				SelectedEmployee.setPotential(SelectedEmployee.getPotential() +9);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+6);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() +7);

				yourMeeting = true;
			} else if (themeeting.equals("2")) {   
				System.out.println(" Everyone laughs at your “joke” and continues with the meeting, forgetting all about the errors on the "
						+ "spreadsheet. After the meeting, you head back to your desk and fix the spreadsheet in case someone comes back to "
						+ "asks for it.");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-6);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()-8);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+10);

				yourMeeting = true;
			} else if (themeeting.equals("3")) { 
				System.out.println(" Your supervisor gives you the rest of the day off. It is clear that you are not going to be productive the "
						+ " rest of the day. You leave feeling like this might have affected your possible promotion. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-6);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()-7);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+10); 

				yourMeeting = true;
			} else {
				System.out.println(" Please select a number between 1 and 3.");

			}
		}

		System.out.println(" Current Potential points are... " + SelectedEmployee.getPotential());
		System.out.println(" Current Competence points are... " + SelectedEmployee.getCompetence());
		System.out.println(" Current Honesty points are... " + SelectedEmployee.getHonesty());
		return SelectedEmployee;

	}	

	public static Player theOvertime(Scanner in, Player SelectedEmployee) {

		System.out.println();

		System.out.println(" Overtime ");

		System.out.println();

		System.out.println(" You are getting ready to head home for the night and your boss comes to you asking if you are available to stay late "
				+ "and help her with a report. You have previous plans to go out for dinner and drinks with friends. You were really looking forward "
				+ "to hanging with your friend tonight but don’t want to disappoint your boss. You decide to... ");

		System.out.println();	

		boolean yourOvertime = false;
		while (!yourOvertime) {
			System.out.println(" 1. Call and cancel plans with friends and help your boss with the report.");
			System.out.println(" 2. Tell her that your daycare closes at six and you pick up your child");
			System.out.println(" 3. Respectfully explain you are unavailable for the night."); 

			String overtime = in.nextLine();

			System.out.println();

			if(overtime.equals("1")) {
				System.out.println(" After 30 minutes of work, your boss suddenly says must leave and asks if you will be alright finishing on your own. "
						+ " You tell her it is no problem but inside you are furious that you canceled your plans and are stuck working on this report"
						+ " alone. You say this is the last time you agree to work after hours.");

				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-8);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+7);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+9);

				yourOvertime = true;   
			} else if (overtime.equals("2")) {   
				System.out.println(" You feel bad that you lied about having to pick your child up from daycare. As much as you want to prove that you are "
						+ "ready to get prompted, you really want to hang out with your friends. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-6);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+4);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()-9);

				yourOvertime = true;
			} else if (overtime.equals("3")) {
				System.out.println(" Your boss is disappointed that you don’t want to help but understands that you have other things to do. As the weeks "
						+ " progress you notice that other people are being asked to do more tasks and she has stopped asking if you were available.");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-10);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()-6);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+10);

				yourOvertime = true;
			} else {
				System.out.println(" Try a number between 1 and 3.");

			}

		}

		System.out.println(" Current Potential points are... " + SelectedEmployee.getPotential());
		System.out.println(" Current Competence points are... " + SelectedEmployee.getCompetence());
		System.out.println(" Current Honesty points are... " + SelectedEmployee.getHonesty());
		return SelectedEmployee;	 
	}

	public static Player farewellLunch(Scanner in, Player SelectedEmployee) {
		
		System.out.println(" The Farewell Lunch ");

		System.out.println();

		System.out.println(" It is Betty’s last day of work, and everyone is heading to JBs for her retirement lunch. You were tasked with making the "
				+ "reservations for this party a month ago. You leave work early and head to the restaurant to setup for the party. When you get there "
				+ "and tell them your name and number of guests for the reservation, they tell you that there is no reservation for 14 guests. You start "
				+ "to get upset stating you made the reservation online and have a confirmation number. When you pull it up, you discover you made a "
				+ "reservation for 4. It is close to the time for people to start showing up and there are no tables available for that many people at "
				+ "the moment. What do you do...");

		System.out.println();

		boolean theLunch  =false;
		while (!theLunch) {

			System.out.println(" 1. Tell them there was a mix up with the reservation and you are taking it to the buffet next door.");
			System.out.println(" 2. Wait an hour and a half for availability "); 
			System.out.println(" 3. Speak to the manager and get the tables available. ");

			String lunch = in.nextLine();

			System.out.println();

			if(lunch.equals("1")) {
				System.out.println(" The next day three of your coworkers called out with food poisoning and now you must cover their tasks for the day. "
						+ "It is going to be a very long day. You do not know how you will get everything accomplished ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-5);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+6);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()-7);

				theLunch = true;
			} else if (lunch.equals("2")) {   
				System.out.println(" People are becoming frustrated for having to wait longer than they were supposed to. The cake that was purchased "
						+ " is starting to melt and Betty now must leave and get ready for her flight out of town. As a result, the lunch is canceled "
						+ "and everyone heads back to work. ");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()-6);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()+2);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+2);

				theLunch = true; 
			} else if (lunch.equals("3")) { 
				System.out.println(" The manager does his best to accommodate your party but due to the time of day, you are unbale to get all of your tables "
						+ "together so half of your party is on one side of the restaurant and the other half the party is on the other side.");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential()+6);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence()-2);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty()+3);

				theLunch = true;
			} else {
				System.out.println(" Invalid input. Please select a number between 1 and 3.");
			}

		}

		System.out.println(" Current Potential points are... " + SelectedEmployee.getPotential());
		System.out.println(" Current Competence points are... " + SelectedEmployee.getCompetence());
		System.out.println(" Current Honesty points are... " + SelectedEmployee.getHonesty());
		return SelectedEmployee;

	}		

	public static Player missingMoney(Scanner in, Player SelectedEmployee) {

		System.out.println(" The Missing Money ");

		System.out.println();

		System.out.println(" You are just getting back from lunch and your supervisor sent you an email asking you to come to her office. When you "
				+ " get there, she asks about a financial report for 4th quarter where the money Is not adding up. She explains to you that she ran the "
				+ " numbers several times and they are off by almost $100,000. She asks if you know what happened and you state….");

		System.out.println();

		boolean theMoney  = false;
		while (!theMoney) {

			System.out.println(" 1. I am not sure why the numbers are off. I will head back to my desk and review the report and have an answer by the end of the day. ");
			System.out.println(" 2. Are you sure? I just reviewed the report before lunch and the numbers were fine. ");
			System.out.println(" 3. I am sure it is a simple fix. I will head back to my desk and see what is going on. ");

			String money = in.nextLine();

			System.out.println();

			if(money.equals("1")) {
				System.out.println(" You head back to your desk and start to work on the report before a coworker shows up and starts asking about your plans for"
						+ " the weekend. You become totally distracted and forget to figure out what is wrong with the report. The supervisor never gets "
						+ " the corrected report. ");

				SelectedEmployee.setPotential(SelectedEmployee.getPotential() -6); 
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence() +3); 
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() +1); 

				theMoney = true;
			} else if (money.equals("2")) {   
				System.out.println(" When you open the report and start to review it with the supervisor, you realize that you pulled the 3rd quarters report. "
						+ " You apologize and provide her with right report resolving the monetary discrepancy.");
				SelectedEmployee.setPotential(SelectedEmployee.getPotential() -7);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence() +4);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() +9);

				theMoney = true;  
			} else if (money.equals("3")) { 
				System.out.println(" You review all the accounts, track down the inconsistencies with the report and creates a spreadsheet to show what needs to "
						+ " be done to fix the problem and turn it into the supervisor.");

				SelectedEmployee.setPotential(SelectedEmployee.getPotential() +10);
				SelectedEmployee.setCompetence(SelectedEmployee.getCompetence() +7);
				SelectedEmployee.setHonesty(SelectedEmployee.getHonesty() +9);

				theMoney = true;
			} else {

				System.out.println(" You only have three options: 1 ,2 or 3.");

			}

		}

		System.out.println(" Current Potential points are... " + SelectedEmployee.getPotential());
		System.out.println(" Current Competence points are... " + SelectedEmployee.getCompetence());
		System.out.println(" Current Honesty points are... " + SelectedEmployee.getHonesty());
		return SelectedEmployee;

	}		

	public static int futurePosition(Scanner in, Player SelectedEmployee) {
		System.out.print(" After review of your performance, ");
		
		// This should calculate to add the total amount of points over the 5 scenes and what your total score is
		int total = SelectedEmployee.getPotential() +  SelectedEmployee.getCompetence() + SelectedEmployee.getHonesty();
		// This uses the score from above to determine what your outcome is
		if (total >= 0 && total <= 23) { 
			System.out.println(" your evaluation score is " + total + " points." + " You need to find other employment.");

		} else if (total >= 24 && total <= 44) { 
			System.out.println(" Your evaluation score is  " + total + " points." + " You have been demoted.");

		} else  if  (total >= 45 && total <= 65) { 
			System.out.println(" your evaluation score is  " + total + " points." + " We are putting you on probation." );

		}else {
			System.out.println(" your evalutaion score is " + total + " points." + " Congratulations, you have been promoted!!");
		}		

		return total;

	}

}
