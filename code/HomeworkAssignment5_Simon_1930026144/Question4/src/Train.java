
public class Train extends Vehicle {
    public Train(int speedLimit, int speed) throws BadSpeedSetting {
        // create the constructor
        super(speedLimit, speed);
    }

    @Override
    // override the canFly method
    public boolean canFly() {
        return false;
    }

    
    // override the accelerate method
    @Override
    public int accelerate(int amount) throws TrainSpeedChange {
        throw new TrainSpeedChange("Do not try to accelerate ot decelerate the train!");
    }

    public static void testTrain() {
        try {
            Train t = new Train(0, 1);
        } catch (BadSpeedSetting e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed will not be greater than speedlimit"));
        }

        try {
            Train t = new Train(0, -1);
        } catch (BadSpeedSetting e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed can not be negative!"));
        }

        try {
            Train t = new Train(120, 50);
            System.out.println(t.canFly() == false);
            System.out.println(t.getSpeed() == 10);
        } catch (BadSpeedSetting e) {
            //TODO: handle exception
            System.out.println("Crash");
        }
    }
}
