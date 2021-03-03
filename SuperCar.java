package Builder;

public class SuperCar {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .name("Alolo")
                .make("Audi")
                .price(500)
                .color("red")
                .build();

        Car newCar = new CarBuilder()
                .make("Lada")
                .price(200)
                .build();

        System.out.println(car);
        System.out.println(newCar);
    }
}
