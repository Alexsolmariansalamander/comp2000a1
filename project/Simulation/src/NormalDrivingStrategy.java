public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void update(Car car, VehicleManager manager, double deltaTime) {
        if (manager.shouldSlowDown(car)) {
            car.slowDown(deltaTime);
        } else {
            car.speedUp(deltaTime);
        }
    }
}