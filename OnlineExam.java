import java.util.*;

public class OnlineExam {
    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    static String[][] questions = {
        {"Which keyword is used to define a class in Java?", "1. class", "2. def", "3. struct", "4. define", "1"},
        {"Java is ___?", "1. Compiled", "2. Interpreted", "3. Both", "4. None", "3"},
        {"Which data type is used to create a variable that should store text?", "1. String", "2. int", "3. char", "4. float", "1"},
        {"How do you start writing a while loop in Java?", "1. while x > y", "2. while (x > y)", "3. while x > y:", "4. while {x > y}", "2"},
        {"What is the size of int in Java?", "1. 8-bit", "2. 16-bit", "3. 32-bit", "4. 64-bit", "3"}
    };

    public static void main(String[] args) {
        System.out.println("Welcome to the Online Exam System");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("\nHello " + name + ", starting the exam now.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Your answer (1-4): ");
            String ans = sc.nextLine();
            if (ans.equals(questions[i][5])) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Exam Over! Your Score: " + score + "/" + questions.length);
        if (score >= 3) System.out.println("Status: PASS");
        else System.out.println("Status: FAIL");
    }
}
