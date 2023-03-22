package oasisInfobyte2;

import java.util.Scanner;

public class OnlineExaminationSystem {
    // define the quiz questions and answers
    private static final String[][] questionsAndAnswers = {
            {"What is the currency of India?", "Rupee"},
            {"What is the currency of Canada?", "Dollar"},
            {"What is the currency of Japan?", "Yen"}
            // add more questions and answers as needed
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.println("Welcome to the Online Examination System!");

        // user login
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if (isValidUser(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            System.out.println("You will be presented with " + questionsAndAnswers.length + " multiple-choice questions.");
            System.out.println("Please select the correct answer for each question.");
            System.out.println();

            int score = 0; // keep track of the user's score
            long startTime = System.currentTimeMillis(); // start the timer

            // present the quiz questions and get the user's answers
            for (int i = 0; i < questionsAndAnswers.length; i++) {
                System.out.println("Question #" + (i+1) + ": " + questionsAndAnswers[i][0]);
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + questionsAndAnswers[i][1]);
                }

                System.out.println();
            }

            long endTime = System.currentTimeMillis(); // stop the timer
            long timeElapsed = endTime - startTime; // calculate the elapsed time
            int minutesElapsed = (int) (timeElapsed / (1000 * 60)); // convert to minutes

            System.out.println("Congratulations, you have completed the quiz!");
            System.out.println("Your score is: " + score + " out of " + questionsAndAnswers.length);
            System.out.println("You took " + minutesElapsed + " minutes to complete the quiz.");

            // close the session and log out
            System.out.println("Closing session and logging out...");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static boolean isValidUser(String username, String password) {
        // add your user validation logic here
        return true;
    }
}
