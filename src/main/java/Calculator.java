import java.util.Scanner;

public class Calculator {
    private int num0;
    private int num1;
    public char oper;
 
    public void In(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввeдите пример: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Ошибка. Нужны 2 значения и оператор");
            return;
        }

        try {
        num0 = Integer.parseInt(parts[0]);
        num1 = Integer.parseInt(parts[2]);
    } catch (NumberFormatException e) {
        System.out.println("Не удалось получить число");
        return;
    }
        oper = parts[1].charAt(0);
    
    }
    public void Sea(){
    switch (oper){
        case '-':
          sub();
      break;
        case '+':
          add();
      break;
        case '*':
          mul();
      break; 
        case '/':
          div();
      break;
      default:
      System.out.println("неверный оператор");
    }
}
    public void sub(){
     int res = num0 - num1;
     System.out.println("ответ:" + res);
    }

    public void add(){
     int res = num0 + num1;
     System.out.println("ответ:" + res);
    }

    public void div(){
    
        if (num1 != 0) {
        int res = num0 / num1;
        System.out.println("ответ:" + res);
        } else {
            System.out.println ("Ошибка. Деление на 0");
            return;
        }
     }

    public void mul(){
        int res = num0 * num1;
        System.out.println("ответ:" + res);
    }

     

}
    class main{
         public static void main(String[] args) {

          Calculator calculator = new Calculator();
          calculator.In();
          calculator.Sea();

        
        }
    }