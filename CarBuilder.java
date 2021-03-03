package Builder;

public class CarBuilder {
    String name="не установлено";
    String make="не установлено";
    String color="не установлено";
    int price=0;

    public CarBuilder name(String name){
        this.name = name;
        return this;
    }

    public CarBuilder make(String make){
        this.make = make;
        return this;
    }

    public CarBuilder color(String color){
        this.color = color;
        return  this;
    }

    public CarBuilder price(int price){
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Car build(){
        return new Car(this);
    }
}
