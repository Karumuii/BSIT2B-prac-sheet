package P5;

public class SubtractionActivity extends MathActivity {

    public SubtractionActivity(String name) {
        super(name, "Subtraction");
    }

    @Override
    public void generateQuestion() {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(num1) + 1; // keeps result non-negative
    }

    @Override
    public String getQuestionText() {
        return num1 + " - " + num2 + " = ?";
    }

    @Override
    public boolean checkAnswer(int studentAnswer) {
        return studentAnswer == (num1 - num2);
    }
}




