public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 300000, 250, 280);
        Car c2 = new Car("Audi", 270000, 240, 260);
        c2 = c1;
        System.out.println(" obj  c1  "+c1.getMaxSpeed()+"  "+c1.getModel());
        System.out.println(" obj  c2  "+c2.getMaxSpeed()+"  "+c2.getModel());
        /*
        Car c2 = new Car("Audi", 270000, 240, 260);
        Car c3 = new Car("Ferrari", 1200000, 500, 340);
        Car c4 = new Car("fiat", 1200, 5, 30 );
        Car c5 = new Car("Toyota", 1600, 5, 40);
        Car c6 = new Car("Honda", 1800, 5, 35);
        Car c7 = new Car("Mazda", 2000, 5, 45);
        Car c8 = new Car("Fiat", 1200, 5, 4000);
        Car[] cars = { c1, c2, c3,c4,c5,c6,c7,c8};
        Car fastest = c1.findFastest(cars);
        System.out.println("המהירה ביותר: " + fastest.getModel()+"מהירות  "+fastest.getMaxSpeed());

         */
    }
}
