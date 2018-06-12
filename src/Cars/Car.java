package Cars;

public class Car extends Vehicle {
    private int seat;

    Car(String name, int year, int seat){
        super(name, year);
        this.seat = seat;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Limit miejsc: " + seat);
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
