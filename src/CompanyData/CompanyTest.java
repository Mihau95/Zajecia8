package CompanyData;

public class CompanyTest {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];

        employees[0] = new Employee ("Wojciech", "Anusiak", 2500);
        employees[1] = new Employee("Jan", "Sobek", 2550);
        employees[2] = new Director("Kamil", "Winkelried", 7500, 2400);

        employees[0].showInfo();
        employees[1].showInfo();
        employees[2].showInfo();


        double summSalary = 0;
        for (Employee employee : employees){
            summSalary = summSalary + employee.totalPayment();
        }
        System.out.println("Suma wyplat: " + summSalary);
    }

    public  static int countWellPaidEmployees(Employee[] employees, double minSalary) {
        int counter = 0;
        for (Employee employee : employees){
            if(employee.totalPayment()>minSalary)
                counter++;
        }
        return counter;
    }
}