package HW1.src.entities;

public class Student implements IStudent{
    private IUniMember self;
    private String subject;
    public Student(IUniMember self, String subject){
        this.self = self;
        this.subject = subject;
    }

    @Override
    public String getSubject() {
        return "Subject: "+subject;
    }

    @Override
    public String getName(){
        return this.self.getName();
    }
}
