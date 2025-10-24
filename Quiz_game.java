import java.util.Scanner;

public class Quiz_game{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Questions stored in a 1D array
        String[] questions = {
            "What is the capital of France?",
            "Who developed Java?",
            "Which planet is known as the Red Planet?"
        };

        // Options stored in a 2D array [questionIndex][optionIndex]
        String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. Bjarne Stroustrup", "B. James Gosling", "C. Dennis Ritchie", "D. Guido van Rossum"},
            {"A. Earth", "B. Mars", "C. Venus", "D. Jupiter"}
        };

        // Correct answers (A, B, C, or D)
        String[] answers = {"C", "B", "B"};

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);

            // Print options for current question
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            // Get user's answer
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

        

            // Check answer
            if (userAnswer.equals(answers[i])) {
                score++;
            }
            System.out.println();
        }

        // Final score output
        System.out.println("Quiz Over!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}