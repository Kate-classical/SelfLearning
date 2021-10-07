package by.alexrom.s05;

public class Multiplication extends Operation {
    @Override
    int calculate(int leftOperand, int rightOperand) {
        int res = leftOperand * rightOperand;
        return res;
    }
}
