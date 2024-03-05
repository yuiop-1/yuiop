import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввeдите пример: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Ошибка. Нужны 2 значения и оператор");
            return;
        }
        int num0, num1;
        try {
            num0 = Integer.parseInt(parts[0]);
            num1 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число");
            return;
        }

        char oper = parts[1].charAt(0);
        int res = 0;

        switch (oper) {
            case '-':
                res = num0 - num1;
                break;
            case '+':
                res = num0 + num1;
                break;
            case '*':
                res = num0 * num1;
                break;
            case '/':
                if (num1 != 0) {
                    res = num0 / num1;
                } else {
                    System.out.print("Ошибка. Деление на 0");
                    return;
                }
                break;
            default:
                System.out.print("Неверный оператор");
                return;
        }
        System.out.println("ответ:" + res);

    }
}

