
public class Car {
    private String name;
    private Door[] doors;

    public Car(String name, int numberOfDoors) throws BadCarException {
        // create the constructor
        this.name = name;
        if (numberOfDoors < 1) {
            throw new BadCarException("A car must have at least one door!");
        } else {
            doors = new Door[numberOfDoors - 1];
        }
    }

    public void listDoors() {
        for (Door d : doors) {
            if (d.isOpen() == true) {
                System.out.println();
            }
        }
    }
}
