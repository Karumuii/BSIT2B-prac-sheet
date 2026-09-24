package P5;

import java.util.Random;
import java.util.Scanner;

// Abstract class defining common properties and behaviors
public abstract class MathActivity {
    protected String studentName;
    protected String activityType;
    protected int numberOfQuestions;
    protected int correctAnswers;
    protected int num1, num2;
    protected Random random = new Random();

    // Constructor stores the student's name
    public MathActivity(String studentName, String activityType) {
        this.studentName = studentName;
        this.activityType = activityType;
        this.correctAnswers = 0;
    }

    // Abstract methods implemented by subclasses
    public abstract void generateQuestion();
    public abstract String getQuestionText();
    public abstract boolean checkAnswer(int studentAnswer);

    public void setNumberOfQuestions(int n) {
        this.numberOfQuestions = n;
    }

    // Runs the activity using a loop and input validation
    public void start(Scanner sc) {
        for (int i = 1; i <= numberOfQuestions; i++) {
            generateQuestion();
            int answer = 0;
            boolean valid = false;

            // Validate that the answer is a valid number
            while (!valid) {
               System.out.println("Question " + i + ": " + getQuestionText());
               System.out.print("Your answer: ");
                String input = sc.nextLine().trim();
                try {
                    answer = Integer.parseInt(input);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            // Check whether each answer is correct and keep track
            if (checkAnswer(answer)) {
                System.out.println("Correct! Great job!\n");
                correctAnswers++;
            } else {
                System.out.println("Not quite. Keep trying!\n");
            }
        }
    }

    public void displayResults() {
        System.out.println("===== RESULTS =====");
        System.out.println("Student's Name:      " + studentName);
        System.out.println("Activity Type:       " + activityType);
        System.out.println("Number of Questions: " + numberOfQuestions);
        System.out.println("Correct Answers:     " + correctAnswers);
        System.out.println("Score:               " + correctAnswers + "/" + numberOfQuestions);
//        System.out.println(getFeedback());
    }

//    private String getFeedback() {
//        double percent = (correctAnswers * 100.0) / numberOfQuestions;
//        if (percent == 100) return "Feedback: Excellent work!";
//        if (percent >= 60)  return "Feedback: Good job! Keep practicing.";
//        return "Feedback: Don't give up, practice makes perfect!";
//    }
}




