import java.util.Scanner;

public class trivia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] questions = {
                {"What is the capital of France?", "Paris"},
                {"What is the largest country in the world?", "Russia"},
                {"What is the smallest country in the world?", "Vatican City"}
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]);
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase(questions[i][1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + questions[i][1]);
            }
        }

        System.out.println("Your final score is: " + score);
    }
}
