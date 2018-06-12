package CompanyData;

public class Employee extends Person {
    private double salary;

    Employee(String firstName, String lastName, double salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Wyplata: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double totalPayment(){
        return salary;
    }

}

