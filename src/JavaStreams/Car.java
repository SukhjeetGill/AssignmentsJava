package JavaStreams;

public class Car {
    String make,model,color;
    int id, year;
    double price;

    public Car(int id, String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.id = id;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
