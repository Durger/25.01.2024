public class Main {
    public static void main(String[] args) {
        Car ladaChetyrka = new Car("Четырка", "Баклажан", 65);
        System.out.println(ladaChetyrka);
        System.out.println(ladaChetyrka.getColor());
        ladaChetyrka.setColor("Розовый");
        System.out.println(ladaChetyrka.getColor());
        Car ladaPriora = new Car();
        Car ladaPriora1 = new Car();
        Car ladaPriora2 = new Car();
        Car ladaPriora3 = new Car();

//        System.out.println(ladaChetyrka);
        System.out.println(ladaPriora);

        SuperCar pagani = new SuperCar();
        System.out.println(pagani);
    }
}
