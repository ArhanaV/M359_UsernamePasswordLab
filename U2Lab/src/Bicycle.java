public class Bicycle {

    private String brand;
    private int gear;
    private int speed;

    public Bicycle(String brand, int gear, int speed){
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;
    }
    public Bicycle(String brand){
        this.brand = brand;
        this.gear = 1;
        this.speed = 0;
    }

    public void pedal(){
        System.out.println("Pedaling..." + brand + " speed is now" + speed);
    }
    public void brake(){
        System.out.println("Braking..." + brand + " speed is now" + speed);
    }
    public void changeGear(){
        System.out.println(brand + " Gear changed to " + gear);
    }
    public void getBrand(){
        System.out.println("Brand: " + speed + "Gear: " + gear + "Speed" + speed);
    }
    public void getGear(){
        System.out.println();
    }
    public void getSpeed(){
        System.out.println();
    }

}
