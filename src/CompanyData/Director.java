package CompanyData;

public class Director extends Employee {
    private double bonus;

    Director(String firstName, String lastName, double salary, double bonus) {
    super(firstName,lastName,salary);
    this.bonus = bonus;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Bonus: " + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
