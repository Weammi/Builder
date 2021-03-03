package Builder;

public class Car {
    String name;
    String make;
    String color;
    int price;

    Car(CarBuilder carBuilder) {
    this.name=carBuilder.getName();
    this.make=carBuilder.getMake();
    this.color=carBuilder.getColor();
    this.price=carBuilder.getPrice();
    }

    public String toString(){
        return "Car [name="+ name +", make=" + make +", color=" + color +", price=" + price + "]";
    }
}
