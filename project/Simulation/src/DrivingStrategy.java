public interface DrivingStrategy {
    void update(Car car, VehicleManager manager, double deltaTime);
}