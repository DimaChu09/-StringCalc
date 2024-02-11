package operations;

public class MultiplyOperation implements Operations {
    @Override
    public String execute(String operand1, String operand2) {
        StringBuilder sb = new StringBuilder();
        int times = Integer.parseInt(operand2);
        for (int i = 0; i < times; i++) {
            sb.append(operand1);
        }
        return sb.toString();
    }
}
