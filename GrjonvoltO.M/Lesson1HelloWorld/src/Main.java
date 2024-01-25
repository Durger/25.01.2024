import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Переменная для хранения валюты: рубли
        int walletRU = 2000;

        //Переменная для храниения валюты: доллары
        int walletDollar = 94;

        boolean lie = false;
        boolean truth = true;

        //Информация о валюте для вывода в консоль
        String str = " рублей, в долларах это - ";

        //Переменная, хранящая результат преобразования
        int result = walletRU/walletDollar;
        //Выводим в консоль полученный результат
        System.out.println(walletRU + str + result);

        /*
        * Арифметические операции:
        * сложение: +
        * вычитание: -
        * умножение: *
        * деление: /
        * остаток от деления: %
        * */
        sum(10,25);
        int hour = 3;
        if (hour < 6 & hour > 0) {
            System.out.println("Доброй ночи!");
        }
        //<
        //>
        //>=
        //<=
        //==
        //!=

        //&& - и
        //|| - или

        result = 1+2;
        System.out.println(result);
        result = 100;
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.nextLine();

        System.out.println("Длина числа " + number1.length() + " символов");

        if (number1.length() == 6) {
            System.out.println("Здесь могла быть ваша реклама!");
        }

        int num = 0;
//
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);
//        num = num + 1;
//        System.out.println(num);

        for (int i=0; i < 10; i = i + 1) {
            num = num + i;
            System.out.println(num);
        }

    }

    public static void sum (int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Результат сложения двух чисел равен - " + result);
    }
}

