package operations;

public class DivideOperation implements Operations {
    @Override
    public String execute(String operand1, String operand2) {
        int divisor = Integer.parseInt(operand2);
        if (divisor <= 0) {
            throw new IllegalArgumentException("Делитель должен быть больше нуля.");
        }
        int partLength = operand1.length() / divisor;
        return operand1.substring(0, partLength);
    }
}
