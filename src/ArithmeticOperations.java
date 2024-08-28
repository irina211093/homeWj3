public class ArithmeticOperations {
    private double number1 = 0;
    private double number2 = 0;

    public ArithmeticOperations(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    public double sum() {
        return number1 + number2;
    }

    public double difference() {
        return number1 - number2;
    }

    public double product() {
        return number1 * number2;
    }

    public double quotient() {
        if (number2 == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return number1 / number2;
    }

}