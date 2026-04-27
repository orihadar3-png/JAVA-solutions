public class Car {
    private String model;
    private double price;
    private int power;
    private int maxSpeed;
    public Car(String model, double price, int power, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public int getPower() { return power; }
    public int getMaxSpeed() { return maxSpeed; }
    public Car findFastest(Car[] cars) {
        Car fastest = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = cars[i];
            }
        }
        return fastest;
    }
}





