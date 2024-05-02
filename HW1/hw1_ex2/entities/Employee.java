package HW1.hw1_ex2.entities;

public class Employee implements IEmployee{
    private IUniMember self;
    private float salary;

    public Employee(IUniMember self, float salary){
        this.self = self;
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return self.getName();
    }
}
