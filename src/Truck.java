public class Truck extends MotorTransprort{
    public Truck(String modelName) {
        super(modelName, 6);
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void service() {
        super.service();
        checkTrailer();
    }
}
