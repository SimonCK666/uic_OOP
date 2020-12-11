
public class Car extends Vehicle {
    public Car(int speedLimit, int speed) throws BadSpeedSetting {
        // create the consrructor
        super(speedLimit, speed);
    }

    public Car(int speed) throws BadSpeedSetting {
        // create the constructor
        super(120, speed);
    }

    // override the canFly method
    @Override
    public boolean canFly() {
        // the car cannot fly
        return false;
    }

    public static void testCar() {
        try {
            Car c = new Car(0, -1);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed cannot be neative!"));
        }

        try {
            Car c = new Car(0, 1);
        } catch (BadSpeedSetting e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed cannot be greater than speedlimit!"));
        }

        try {
            Car c = new Car(120, 100);
            c.accelerate(300);
        } catch (BadSpeedSetting | ExceedSpeedLimit | NotEnoughSpeed e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("The speed is 100,. 300 will exceed the speed limit!"));
        }

        try {
            Car c = new Car(120, 100);
            c.accelerate(-300);
        } catch (BadSpeedSetting | ExceedSpeedLimit | NotEnoughSpeed e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("The speed is 100,. Not enough speed to decelerate"));
        }

        try {
            Car c = new Car(120, 50);
            System.out.println(c.canFly() == false);
            c.accelerate(50);
            System.out.println(c.getSpeed() == 100);
            c.accelerate(-50);
            System.out.println(c.getSpeed() == 50);

        } catch (BadSpeedSetting | ExceedSpeedLimit | NotEnoughSpeed e) {
            //TODO: handle exception
            System.out.println("Crash");
        }
    }
}
