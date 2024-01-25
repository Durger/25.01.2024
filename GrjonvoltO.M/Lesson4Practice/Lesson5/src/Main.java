import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        //Пользователь вводит с клавиатуры строку.
        // Произведите поворот строк и полученный результат выведите
        //на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = scanner.nextLine();

        char[] reversedString = new char[str.length()];

        for (int i = str.length(); i > 0; i--) {
            reversedString[str.length() - i] = str.charAt(i - 1);
//            System.out.println(str.charAt(i));
        }

        System.out.println(reversedString);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        //Вводим текст
        System.out.print("Введите исходный текст: ");
        String text = scanner.nextLine();
        //Ввод слова для поиска в строке
        System.out.print("Введите слово для поиска: ");
        String wordForSearching = scanner.nextLine();
        //Счетчик повторений
        int counter = 0;
        //Разделение сроки на слова
        StringTokenizer stWithSpaces = new StringTokenizer(text, " ");
        //Цикл сравнения с искомым словом
        while (stWithSpaces.hasMoreTokens()) {
            //Преобразование слова
            String processedWord = stWithSpaces.nextToken().replaceAll("\\s|,", "");
            //Увеличение счётчика при совпадении
            if (processedWord.equals(wordForSearching)) {
                counter++;
            }
        }
        //Вывод результатов
        System.out.println("Слово " + wordForSearching + " повторяется: " + counter + " раз!");
    }
}
