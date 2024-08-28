import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double num2 = scanner.nextDouble();
                ArithmeticOperations arithmeticOperations = new ArithmeticOperations(num1, num2);

                System.out.print("Введите операцию: ");
                char operation = scanner.next().charAt(0);
                double result = 0.0;

                if (operation == '+') {
                    result = arithmeticOperations.sum();
                    System.out.println("Сумма: " + result);
                }
                if (operation == '-') {
                    System.out.println("Разность: " + arithmeticOperations.difference());
                }
                if (operation == '*') {
                    System.out.println("Произведение: " + arithmeticOperations.product());
                }
                if (operation == '/') {
                    System.out.println("Частное: " + arithmeticOperations.quotient());
                }
            }

        }


