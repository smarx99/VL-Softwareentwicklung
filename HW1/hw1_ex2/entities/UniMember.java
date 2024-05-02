package HW1.hw1_ex2.entities;

public class UniMember implements IUniMember{
    private String firstName;
    private String lastName;

    public UniMember(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return "Full Name: "+firstName + " " + lastName;
    }
}
