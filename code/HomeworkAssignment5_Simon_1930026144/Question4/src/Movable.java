
public interface Movable {
    // create the Movable interface
    public int accelerate(int amount) throws ExceedSpeedLimit, NotEnoughSpeed, TrainSpeedChange;
}
