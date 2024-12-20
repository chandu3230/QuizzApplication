package quizapplication;
import java.util.Scanner;
public class diamond extends participant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        participant p = new participant();
        p.setEmail("prabha624@gmail.com");
        p.setPassword("prabha@1234");
        p.setName("Prabha");
        p.setAge(20);
        p.setAddress("Palamaner");
        p.setOccupation("Student");
        System.out.println("Email: " + p.getEmail());
        System.out.println("Password: " + p.getPassword());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
        System.out.println("Occupation: " + p.getOccupation());
        System.out.println("Are you ready to take up the quiz game? (yes/no)");
        String response = sc.next().toLowerCase();
        if (response.equals("yes")) {
            System.out.println("Rules:");
            System.out.println("1. Each question has 4 options.");
            System.out.println("2. You have 2 lifelines to use.");
            System.out.println("3. Lifelines can be used only once.");
            System.out.println("4. If you answer incorrectly, the game ends.");
            System.out.println("Start quiz!");
            String[] questions = {
                "1. What is the national flower of India?",
                "2. Who is known as the Father of the Nation in India?",
                "3. What is the capital of France?",
                "4. Which planet is known as the Red Planet?",
                "5. What is the chemical symbol for water?",
                "6. Who wrote the play 'Romeo and Juliet'?",
                "7. What is the square root of 144?",
                "8. Who painted the Mona Lisa?",
                "9. What is the largest ocean on Earth?",
                "10. In which year did India gain independence?"
            };
            String[][] options = {
                {"a. Rose", "b. Lily", "c. Lotus", "d. Marigold"},
                {"a. Jawaharlal Nehru", "b. Mahatma Gandhi", "c. Sardar Patel", "d. Subhash Chandra Bose"},
                {"a. Berlin", "b. Madrid", "c. Paris", "d. Rome"},
                {"a. Earth", "b. Mars", "c. Jupiter", "d. Venus"},
                {"a. H2O", "b. CO2", "c. O2", "d. NaCl"},
                {"a. Charles Dickens", "b. William Shakespeare", "c. Mark Twain", "d. Jane Austen"},
                {"a. 10", "b. 11", "c. 12", "d. 13"},
                {"a. Vincent van Gogh", "b. Leonardo da Vinci", "c. Pablo Picasso", "d. Claude Monet"},
                {"a. Atlantic", "b. Indian", "c. Arctic", "d. Pacific"},
                {"a. 1945", "b. 1946", "c. 1947", "d. 1948"}
            };
            String[] answers = {"c", "b", "c", "b", "a", "b", "c", "b", "d", "c"};
            int lifelinesUsed = 0;
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }
                String userAnswer = sc.next().toLowerCase();
                if (userAnswer.equals(answers[i])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! Game over.");
                }
                if (i < questions.length - 1 && lifelinesUsed < 2) {
                    System.out.println("Do you want to use a lifeline? (yes/no)");
                    String lifelineResponse = sc.next().toLowerCase();
                    if (lifelineResponse.equals("yes")) {
                        lifelinesUsed++;
                        System.out.println("Choose a lifeline:");
                        System.out.println("1. 50-50");
                        System.out.println("2. Audience Poll");
                        int lifelineChoice = sc.nextInt();
                        if (lifelineChoice == 1) {
                            System.out.println("50-50 Lifeline: Correct option and one wrong option are shown.");
                            System.out.println("Correct Answer: " + answers[i]);
                        } else if (lifelineChoice == 2) {
                            System.out.println("Audience Poll:");
                            System.out.println("a: 10%");
                            System.out.println("b: 15%");
                            System.out.println("c: 70%");
                            System.out.println("d: 5%");
                        } else {
                            System.out.println("Invalid lifeline choice.");
                        }
                    }
                }
            }
            System.out.println("Congratulations! You completed the quiz.");
        } else {
            System.out.println("Maybe next time!");
        }
    }
}
