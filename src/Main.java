import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строковый калькулятор. Введите выражение для вычисления:");

        while (true) {
            String inputLine = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(inputLine)) {
                break;
            }

            try {
                String result = StringCalculator.calculate(inputLine);
// Обрезаем строку, если длина превышает 40 символов
                if (result.length() > 40) {
                    result = result.substring(0, 40) + "...";
                }
                System.out.println("Результат: \"" + result + "\"");
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                break;
            }
        }

        scanner.close();
        System.out.println("Калькулятор завершил работу.");
    }
}
