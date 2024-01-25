import java.util.Random;

public class Main {
    public static void main(String[] args) {
        A.hello("++Hello Java!");
        B.hello();

        int number = C.methodThatReturnsSumOfNumbers(50, 50);
        System.out.println(number);

        int[] array = createRandomArray(10, 100);
        printArray(array);

        System.out.println("Сумма элементов массива равно: " + arraySum(array));

        System.out.println(fact(5));
    }

    static int[] createRandomArray (int count, int max) {
        int[] array = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            array[i] = rand.nextInt(max);
        }
        return array;
    }

    static int arraySum (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int fact (int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fact(n-1) * n;
        }
    }
}

class A {
    static void hello(String name) {
        System.out.println(name);
    }
}

class B {
    static void hello() {
        System.out.println("Привет Мир!");
    }
}

class C {
    static int methodThatReturnsSumOfNumbers (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
