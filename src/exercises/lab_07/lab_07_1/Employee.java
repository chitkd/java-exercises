package exercises.lab_07.lab_07_1;

public class Employee {
    private int salary;
    private int name;
    private int id;

    public Employee() {
    }

    public Employee(int salary, int name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
