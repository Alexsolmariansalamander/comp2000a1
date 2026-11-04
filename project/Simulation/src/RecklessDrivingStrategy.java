public class RecklessDrivingStrategy implements DrivingStrategy {
    private final float speed;

    public RecklessDrivingStrategy(float speed) {
        this.speed = speed;
    }

    @Override
    public void update(Car car, VehicleManager manager, double deltaTime) {
        car.setSpeed(speed);
    }
}