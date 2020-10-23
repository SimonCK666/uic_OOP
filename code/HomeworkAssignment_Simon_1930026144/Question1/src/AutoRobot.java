
public class AutoRobot {
    // two private variables
    private float currentSpeed;
    private String name;

     public AutoRobot() {
         // the constructor
        name = "xyz";
        currentSpeed = 0;
     }

    public float getSpeed() {
        // return the current speed
        return currentSpeed;
    }

    public void accelerate() {
        if (currentSpeed < 20) {
            // if the speed less than 20 add 5 every time
            currentSpeed += 5;
        } else {
            System.out.println("Dangours! Please stay within speed limit.");
        }
    }

    public void brake() {
        if (currentSpeed > 0) {
            // if the speed larger than 0 reduce 5 every time
            currentSpeed -= 5;
        }
    }

    public void showStatus() {
        // create a string to return
        String setStatus = "";
        setStatus = "Hello there, my name is " + name + " and my current speed is " + currentSpeed;
        System.out.println(setStatus);
    }

    public void setName(String name) {
        // get the name
        this.name = name;
    }

    public static void testAutoRobot() {
        AutoRobot robot = new AutoRobot();
        // print the original robot's name and speed
        System.out.println("Original Name: " + robot.name);
        System.out.println("Original Speed: " + robot.currentSpeed);
        // test and get the current speed
        System.out.println(robot.getSpeed());
        // set the name
        robot.setName("AlphaGo");
        // accelerate speed
        robot.accelerate();
        robot.accelerate();
        // print the first status
        robot.showStatus();
        // accelerate speed
        robot.accelerate();
        robot.accelerate();
        robot.accelerate();
        // print the first status
        robot.showStatus();
        // break the robot
        robot.brake();
        // print this moment status
        robot.showStatus();
        robot.brake();
        robot.brake();
        robot.brake();
        // print this moment status
        robot.showStatus();
    }

}
