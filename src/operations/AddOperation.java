package operations;

public class AddOperation implements Operations {
    @Override
    public String execute(String operand1, String operand2) {
        return operand1 + operand2;
    }
}
