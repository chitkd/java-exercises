package exercises.lab_07.lab_07_1;

public class Employee {
    private int salary;
    private String name;
    private String id;

    public Employee() {
    }

    public Employee(int salary, String name, String id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
