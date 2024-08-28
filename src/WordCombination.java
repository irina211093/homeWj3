import java.util.Scanner;

public class WordCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово с четным количеством букв: ");
        String firstWord = scanner.nextLine();

        System.out.print("Введите второе слово с четным количеством букв: ");
        String secondWord = scanner.nextLine();

        String newWord = null;
        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            int halfLengthFirstWord = firstWord.length() / 2;
            int halfLengthSecondWord = secondWord.length() / 2;

            newWord = firstWord.substring(0, halfLengthFirstWord) + secondWord.substring(halfLengthSecondWord);

            int newWordLength = newWord.length();

            if (newWordLength > 0) {
                System.out.println("Новое слово: " + newWord);
                System.out.println("Количество букв в новом слове: " + newWordLength);
            } else {
                System.out.println("Ошибка: новое слово не было создано.");
            }

        } else {
            System.out.println("Ошибка: оба слова должны иметь четное количество букв.");
        }

    }

}
