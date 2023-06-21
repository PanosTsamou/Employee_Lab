import java.time.format.SignStyle;

public abstract class Employee {
    private String name;
    private String niNumber;
    private double salary;
    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary  = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            salary += raise;
        }
    }
    public double payBonus() {
        return salary/100;
    }

    public void setName(String newName){
        if (newName != null && newName != "") {name = newName;}
    }


}
