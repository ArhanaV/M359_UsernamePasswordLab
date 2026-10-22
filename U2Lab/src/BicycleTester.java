public class BicycleTester {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle("Trek", 3, 10);
        Bicycle b2 = new Bicycle("Giant");
        b1.pedal();
        b1.changeGear(4);
        b1.brake();
        b2.pedal();
        b2.pedal();
        b2.changeGear(2);
        System.out.println("Brand: " + b2.getBrand() + ", Gear: " +
                b2.getGear() + ", Speed: " + b2.getSpeed());
    }
}