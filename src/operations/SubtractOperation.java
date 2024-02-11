package operations;

public class SubtractOperation implements Operations {
    @Override
    public String execute(String operand1, String operand2) {
        return operand1.replace(operand2, "");
    }
}
