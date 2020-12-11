
public class Aircraft extends Vehicle {
    private int altitude;

    public Aircraft(int speedLimit, int speed, int altitude) throws BadSpeedSetting, BadAltitudeSetting {
        // create the constructor
        super(speedLimit, speed);
        if (altitude < 0) {
            throw new BadAltitudeSetting("Altitude cannot be negative!”");
        }
        this.altitude = altitude;
    }

    public int getAltitude() {
        // return altitude
        return altitude;
    }

    @Override
    public boolean canFly() {
        // override the canFly method
        return true;
    }

    public static void testAircraft() {
        try {
            Aircraft a = new Aircraft(1, 2, 1);
        } catch (BadSpeedSetting | BadAltitudeSetting e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed will not be greater than speedlimit"));
        }

        try {
            Aircraft a = new Aircraft(1, -2, 1);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage().equals("Speed can not be negative"));
        }

        try {
            Aircraft a = new Aircraft(120, 50, 0);
            System.out.println(a.canFly() == true);
            a.accelerate(100);
            System.out.println(a.getSpeed() == 150);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Crash");
        }
    }
}
