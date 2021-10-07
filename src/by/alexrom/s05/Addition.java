package by.alexrom.s05;

public class Addition extends Operation {
    @Override
    int calculate(int leftOperand, int rightOperand) {
        int res = leftOperand + rightOperand;
        return res;
    }
}
