
public class Car {
    private String name;
    private Door[] doors;

    public Car(String name, int numberOfDoors) throws BadCarException {
        // create the constructor
        this.name = name;
        if (numberOfDoors < 1) {
            throw new BadCarException("A car must have at least one door!");
        } else {
            doors = new Door[numberOfDoors];
            for (int i = 0; i < numberOfDoors; i++) {
                doors[i] = new Door();
            }
        }
    }

    public void listDoors() {
        for (Door doors : doors) {
            if (doors.isOpen() == true) {
                System.out.println(name + ", door is closed");
            } else {
                System.out.println(name + ", door is open");
            }
        }
    }

    public int countOpenDoors() {
        // counts the number of doors of the car which are currently open
        int numOfopenDoors = 0;
        for (Door doors : doors) {
            if (doors.isOpen() == true) {
                numOfopenDoors++;
            }
        }
        return numOfopenDoors;
    }

    public void openOneDoor(int doorNumber) throws BadDoorException {
        // open a specific door
        if (doorNumber < 1 || doorNumber > doors.length) {
            throw new BadDoorException("Door " + doorNumber + " ddes not exist!");
        } else {
            doors[doorNumber - 1].open();
        }
    }

    public void changeAllDoors() {
        // opens all the closed doors of the car and closes all the open doors of the car
        for (Door doors : doors) {
            if (doors.isOpen() == true) {
                doors.close();
            } else {
                doors.open();
            }
        }
    }

    public void replaceDoor(int doorNumber) throws BadDoorException {
        // replace the existing car door
        if (doorNumber < 1 || doorNumber > doors.length) {
            throw new BadDoorException("Door" + doorNumber + " does not exist");
        } else {
            doors[doorNumber - 1] = new Door();
        }
    }

    public void replaceDoor() {
        // without arguement
        for ( int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
    }

    public static void testCar() {
        try {
            Car c = new Car("H", 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage().equals("Car must has at least a door"));
        }
        try {
            Car c = new Car("H", 4);
            c.openOneDoor(0);
        } catch (BadCarException | BadDoorException e) {
            // TODO: handle exception
            System.out.println(e.getMessage().equals("Door 0 does not exist"));
        }
        try {
            Car c = new Car("H", 4);
            c.openOneDoor(5);
        } catch (BadCarException | BadDoorException e) {
            // TODO: handle exception
            System.out.println(e.getMessage().equals("Door 5 does not exist"));

        }
        try {
            Car c = new Car("H", 4);
            // list the doors
            c.listDoors();
            System.out.println(c.countOpenDoors() == 0);
            c.openOneDoor(1);
            c.listDoors();
            System.out.println(c.countOpenDoors() == 1);

            // test the changeAllDoors method
            c.changeAllDoors();
            c.listDoors();


            // test the replceDoor method
            c.replaceDoor(2);
            c.listDoors();

            // test the replaceDoor without arguement
            c.replaceDoor();
            c.listDoors();

        } catch (BadCarException | BadDoorException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
