package P5;

public class AdditionActivity extends MathActivity {

    public AdditionActivity(String name) {
        super(name, "Addition");
    }

    @Override
    public void generateQuestion() {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
    }

    @Override
    public String getQuestionText() {
        return num1 + " + " + num2 + " = ?";
    }

    @Override
    public boolean checkAnswer(int studentAnswer) {
        return studentAnswer == (num1 + num2);
    }
}




