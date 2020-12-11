
public abstract class Vehicle implements Movable {
    private int speedLimite;
    private int speed;

    public Vehicle(int speedLimit, int speed) throws BadSpeedSetting {
        // whether speed is lower than 0
        if (speed < 0) {
            throw new BadSpeedSetting("Speed cannot be negative!");

        }
        // whether speed greater than speedlimit
        if (speed > speedLimit) {
            throw new BadSpeedSetting("Speed cannot be greaterthan speedlimit!");
        }
        this.speedLimite = speedLimit;
        this.speed = speed;
    }

    public int getSpeed(int amout) {
        // getSpeed method
        return speed;
    }

    public int accelerate(int amount) throws ExceedSpeedLimit, NotEnoughSpeed {
        // the accelerate method
        if (amount + speed > speedLimite) {
            throw new ExceedSpeedLimit("Current speed is " + speed + ". Accelerate " +amount + " will exceed the speed limit!" );
        }
        if (amount + speed < 0) {
            throw new NotEnoughSpeed("Currentspeed is " + speed + ", not enough speed to declerate!");
        }
        speed += amount;
        return speed;
    }

    public abstract boolean canFly();  // the abstract canFly method
    public static void testVehicle() {
        // no test
    }
    
}
