import java.util.Scanner;

class ScoreEception extends Exception {
    public ScoreEception(String message) {
        super(message);
    }
}

public class TestScore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] studentIDs = { "001", "002", "003", "004", "005" };
            int[] scores = new int[studentIDs.length];
            
            for (int i = 0; i < studentIDs.length; i++) {
                System.out.print("Enter the test score for student " + studentIDs[i] + ": ");
                try {
                    int score = Integer.parseInt(scanner.nextLine());
                    if (score < 0 || score > 100) {
                        throw new ScoreException("Invalid score! Score must be between 0 and 100.");
                    }
                    scores[i] = score;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input! Please enter a numeric score.");
                    scores[i] = 0;
                } catch (ScoreException e) {
                    System.err.println(e.getMessage());
                    scores[i] = 0;
                }
            }
            
            System.out.println("\nStudent ID\tTest Score");
            for (int i = 0; i < studentIDs.length; i++) {
                System.out.println(studentIDs[i] + "\t\t" + scores[i]);
            }
        }
    }
}