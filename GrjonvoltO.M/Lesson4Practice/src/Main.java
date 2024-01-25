import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
    }


    public static void task2 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод двух чисел
        System.out.print("Вводите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Вводите второе число: ");
        int secondNum = scanner.nextInt();

        //Выводчётных чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task3 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод двух чисел
        System.out.print("Вводите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Вводите второе число: ");
        int secondNum = scanner.nextInt();

        //Нормализация границ
        if (secondNum < firstNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        //Вывод чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод двух чисел
        System.out.print("Вводите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Вводите второе число: ");
        int secondNum = scanner.nextInt();

        //Переменная для хранения результата
        int result = firstNum;

        //Вычисление суммы чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            result = result + i;
        }

        //Переменная для хранения среднего арифметического
        int mdAriphm = result/(secondNum-firstNum);

        //Вывод результатов
        System.out.println("Сумма чисел в диапазоне от " + firstNum + " до " + secondNum + " равна: "+ result);
        System.out.println("Среднее арифметическое: " + mdAriphm);
    }

    public static void task5 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод числа
        System.out.print("Вводите первое число: ");
        int firstNum = scanner.nextInt();

        //Переменная для хранения результата
        int result = 1;

        //Вычисление факториала
        for (int i = 2; i <= firstNum ; i++) {
            result = result * i;
        }

        //Вывод результата
        System.out.println("Факториал введенноо числа равен: " + result);
    }

    public static void task6 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод числа
        System.out.print("Вводите первое число: ");
        int length = scanner.nextInt();

        //Проверка корректности данных


        //Вывод символовв количестве "length"
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }

    public static void task7 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод числа
        System.out.print("Вводите первое число: ");
        int length = scanner.nextInt();

        //Ввод символа для заполнения строки
        System.out.print("Введите символ для заполнения строки: ");
        String sym = scanner.next();

        //Вывод символов в строке
        for (int i = 0; i < length; i++)
        
        }

    public static void task8 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод двух чисел
        System.out.print("Вводите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Вводите второе число: ");
        int secondNum = scanner.nextInt();

        //Анализ чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            if ((firstNum + i) % 3 == 0 && (firstNum + i) % 5 == 0) {
                System.out.println((firstNum + i) + "Fizz Buzz");
            } else if ((firstNum + i) % 3 == 0) {
                System.out.println((firstNum + i)+"Buzz");
            } else if ((firstNum + i) % 5 == 0) {
                System.out.println((firstNum + i)+"Fizz");
            } else  {
                System.out.println(firstNum + i);
            }
            //        task10();
import java.util.Arrays;
                private static final int[][] A = {
                        {4, -2, 8, -2},
                        {2, -1, 4, -8},
                        {7, 0, 1, -5},
                        {-5, 2, 0, -3}
                };

                private static final int[][] B = {
                        {9, -6, -4, -6},
                        {-6, 8, 0, 7},
                        {-1, 7, 3, -8},
                        {0, -6, 0, -1}
                };

                public static void main(String[] args) {
                    System.out.println("Даны 2 матрицы:");
                    System.out.println("A:");
                    printMatrix(A);
                    System.out.println("B:");
                    printMatrix(B);

                    System.out.println("Матрица, равная произведению 2-х матриц А и B:");
                    printMatrix(getMultiMatrix(A, B));
                }

                private static void printMatrix(int[][] matrix) {
                    for (int[] line : matrix) {
                        System.out.println(Arrays.toString(line));
                    }
                }

                private static int[][] getMultiMatrix(int[][] a, int[][] b) {
                    int[][] multi = new int[a.length][a[0].length];
                    for (int i = 0; i < multi.length; i++) {
                        for (int j = 0; j < multi[i].length; j++) {
                            int result = 0;
                            for (int k = 0; k < multi.length; k++) {
                                result += a[i][k] * b[k][j];
                            }
                            multi[i][j] = result;
                        }
                    }

                    return multi;
                }
            }
            1
        }
    }
}