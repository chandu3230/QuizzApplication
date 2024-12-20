package quizapplication;
import java.util.Scanner;
public class quizzapp {
	 public static void main(String[] args)  {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("WELCOME TO THE QUIZ GAME");
	    	System.out.println("Enter the Name");
			String name=sc.nextLine();
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			System.out.println("Enter the Place");
		    String place=sc.next();
		    System.out.println("Enter the Email");
		    String email=sc.next();		    
		    System.out.println("Player Details");
			System.out.println("Name :"+name);
			System.out.println("ID IS:"+id);
			System.out.println("EMAIL IS:"+email);
			System.out.println("PLACE :"+place);
			 System.out.println("Are you ready to take up the quiz game? (yes/no)");       
		        String response = sc.next().toLowerCase();
		        if (response.equals("yes")) {
		            System.out.println("Rules:");
		            System.out.println("1. Each question has 4 options.");
		            System.out.println("2. You have 2 lifelines to use.");
		            System.out.println("3. Each lifeline can be used only once.");
		            System.out.println("4. If you answer incorrectly, the game ends.");
		            System.out.println("Start quiz!");
		            String[] questions = {
		                "1. What is the national flower of India?",
		                "2. Who is known as the Father of the Nation in India?",
		                "3. What is the capital of France?",
		                "4. Which planet is known as the Red Planet?",
		                "5. What is the chemical symbol for water?",
		                "6. What is the national bird of India?",
		                "7. What is the square root of 144?",
		                "8. What is the tallest animal in the world?",
		                "9. What is the largest ocean on Earth?",
		                "10. In which year did India gain independence?"
		            };
		            String[][] options = {
		                {"a. Rose", "b. Lily", "c. Lotus", "d. Marigold"},
		                {"a. Jawaharlal Nehru", "b. Mahatma Gandhi", "c. Sardar Patel", "d. Subhash Chandra Bose"},
		                {"a. Berlin", "b. Madrid", "c. Paris", "d. Rome"},
		                {"a. Earth", "b. Mars", "c. Jupiter", "d. Venus"},
		                {"a. H2O", "b. CO2", "c. O2", "d. NaCl"},
		                {"a. Crow", "b. Parrot", "c. Peacock", "d. Sparrow"},
		                {"a. 10", "b. 11", "c. 12", "d. 13"},
		                {"a. Tiger", "b. Lion", "c. Giraffe", "d. Snake"},
		                {"a. Atlantic", "b. Indian", "c. Arctic", "d. Pacific"},
		                {"a. 1945", "b. 1946", "c. 1947", "d. 1948"}
		            };
		            String[] answers = {"c", "b", "c", "b", "a", "c", "c", "c", "d", "c"};
		            String[][] fiftyFiftyOptions = {
		                {"a. Rose", "c. Lotus"},
		                {"b. Mahatma Gandhi", "c. Sardar Patel"},
		                {"c. Paris", "d. Rome"},
		                {"b. Mars", "c. Jupiter"},
		                {"a. H2O", "b. CO2"},
		                {"c. Peacock", "d. Sparrow"},
		                {"b. 11", "c. 12"},
		                {"b. Lion", "c. Giraffe"},
		                {"a. Atlantic", "d. Pacific"},
		                {"c. 1947", "d. 1948"}
		            };
		            String[][] audiencePolls = {
		                {"a: 5%", "b: 10%", "c: 80%", "d: 5%"},
		                {"a: 20%", "b: 60%", "c: 10%", "d: 10%"},
		                {"a: 10%", "b: 5%", "c: 75%", "d: 10%"},
		                {"a: 15%", "b: 65%", "c: 10%", "d: 10%"},
		                {"a: 90%", "b: 5%", "c: 3%", "d: 2%"},
		                {"a: 10%", "b: 15%", "c: 70%", "d: 5%"},
		                {"a: 5%", "b: 5%", "c: 80%", "d: 10%"},
		                {"a: 15%", "b: 10%", "c: 70%", "d: 5%"},
		                {"a: 10%", "b: 10%", "c: 10%", "d: 70%"},
		                {"a: 10%", "b: 10%", "c: 75%", "d: 5%"}
		            };
		            boolean fiftyFiftyUsed = false;
		            boolean audiencePollUsed = false;
		            int lifelinesUsed = 0;
		            for (int i = 0; i < questions.length; i++) {
		                System.out.println(questions[i]);
		                for (String option : options[i]) {
		                    System.out.println(option);
		                }
		                if (lifelinesUsed < 2) {
		                    System.out.println("Do you want to use a lifeline? (yes/no)");
		                    String lifelineResponse = sc.next().toLowerCase();
		                    if (lifelineResponse.equals("yes")) {
		                        lifelinesUsed++;
		                        System.out.println("Choose a lifeline:");
		                        System.out.println("1. 50-50");
		                        System.out.println("2. Audience Poll");
		                        try {
		                            int lifelineChoice = sc.nextInt();

		                            if (lifelineChoice == 1 && !fiftyFiftyUsed) {
		                                fiftyFiftyUsed = true;
		                                System.out.println("50-50 Lifeline:");
		                                for (String fiftyFifty : fiftyFiftyOptions[i]) {
		                                    System.out.println(fiftyFifty);
		                                }
		                            } else if (lifelineChoice == 2 && !audiencePollUsed) {
		                                audiencePollUsed = true;
		                                System.out.println("Audience Poll:");
		                                for (String poll : audiencePolls[i]) {
		                                    System.out.println(poll);
		                                }
		                            } else {
		                                System.out.println("Invalid choice or lifeline already used.");
		                            }

		                        } catch (Exception e) {
		                            System.out.println("An error occurred: Invalid input. Please try again.");
		                            sc.nextLine(); 
		                            lifelinesUsed--; 
		                            continue;
		                        }
		                    }
		                }
		                System.out.println("Enter your answer:");
		                String userAnswer = sc.next().toLowerCase();

		                if (userAnswer.equals(answers[i])) {
		                    System.out.println("Correct!");
		                } else {
		                    System.out.println("Incorrect! Game over.");
		                    break;
		                }
		            }
		            System.out.println("Congratulations! You completed the quiz.");
		        } else {
		            System.out.println("Maybe next time!");
		        }
	 }
}
