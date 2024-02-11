import operations.OperationFactory;
import operations.Operations;

public class StringCalculator {

    public static String calculate(String input) {
        int firstOperandEnd = input.indexOf("\"", 1) + 1;
        String operand1 = input.substring(1, firstOperandEnd - 1);

        input = input.substring(firstOperandEnd).trim();
        String operator = String.valueOf(input.charAt(0));

        String operand2 = input.substring(2).trim().replaceAll("^\"|\"$", "");

        Operations operation = OperationFactory.getOperation(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
        if (operand1.length() > 10 || operand2.length() > 10) {
            throw new IllegalArgumentException("Строки не могут быть длиннее 10 символов.");
        }
        return operation.execute(operand1, operand2);
    }
}
