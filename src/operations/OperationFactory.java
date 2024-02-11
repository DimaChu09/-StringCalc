package operations;

public class OperationFactory {
    public static Operations getOperation(String operator) {
        switch (operator) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubtractOperation();
            case "*":
                return new MultiplyOperation();
            case "/":
                return new DivideOperation();
            default:
                throw new IllegalArgumentException("Неподдерживаемый оператор" + operator);
        }
    }
}
