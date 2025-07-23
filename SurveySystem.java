import java.util.Scanner;

public class SurveySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. How satisfied are you with the internship? (1-5)",
            "2. Was the mentor supportive? (Yes/No)",
            "3. Would you recommend this internship to others? (Yes/No)"
        };

        String[] responses = new String[questions.length];

        System.out.println("Welcome to the Internship Feedback Survey");
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + " ");
            responses[i] = scanner.nextLine();
        }

        System.out.println("\n--- Your Responses ---");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + " " + responses[i]);
        }

        System.out.println("\nThank you for participating in the survey!");
    }
}