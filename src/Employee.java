public class Employee extends Person{
    private int salary;
    private int shift;

    public Employee(String name, int salary, int shift) {
        super(name, false);
        this.salary = salary;
        this.shift = shift;
    }

    public int getSalary() {
        return salary;
    }
}
