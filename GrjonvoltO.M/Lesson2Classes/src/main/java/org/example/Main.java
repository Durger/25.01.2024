package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student("Иванов Константин Евгеньевич", 22);
        System.out.println(student);

        Aspirant aspirant = new Aspirant(
                "Исследование объектно-реляционных баз данных",
                "Сидороов Константин Сергеевич",
                28);
        System.out.println(aspirant);

        Student student1 = new Student("Петров Сергей Сергеевич", 22);
        System.out.println(student1);

        Student aspirant1 = new Aspirant("Исследование объектно-реляционных баз данных",
                "Сидороов Константин Сергеевич",
                28);
        System.out.println(aspirant1);

        Ball redBall = new Ball("red");
        Ball blackBall = new Ball("black");
        Ball redBall1 = new Ball("red");
        Ball blackBall1 = new Ball("black");
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.getCountInstance());

        Dog psina = new Dog();
        psina.getData();
        System.out.println("Кличка псины: " + psina.getName());
        psina.setName("Бобик");
        System.out.println("Кличка псины: " + psina.getName());

        String number = "2.5";
        double num = Double.parseDouble(number);
        System.out.println(num);

        ExamplesForPractice ex = new ExamplesForPractice();
        ex.someMethod();

    }
}