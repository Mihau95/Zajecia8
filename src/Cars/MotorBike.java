package Cars;

public class MotorBike extends Vehicle{
    private int speedLimit;

    MotorBike(String name, int year, int speedLimit){
        super(name, year);
        this.speedLimit = speedLimit;
    }
     @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Limit predkosci: " + speedLimit);
     }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
