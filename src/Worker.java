public class Worker extends Employee {

    public Worker(int salary, int shift) {
        super("worker", salary, shift);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }
}
