package Cars;

public class Vehicle implements Moveable {
    private String name;
    private int year;

    Vehicle(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void showInfo(){
        System.out.println(name + " " + year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void goForward() {

    }

    @Override
    public void goBack() {

    }
}
