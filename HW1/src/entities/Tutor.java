package HW1.src.entities;

public class Tutor implements ITutor{
    private IEmployee self;
    private String teachingSubject;
    public Tutor(IEmployee self, String teachingSubject){
        this.self = self;
        this.teachingSubject = teachingSubject;
    }

    @Override
    public String getName() {
        return self.getName();
    }

    @Override
    public float getSalary() {
        return self.getSalary();
    }
    public String getTeachingSubject(){
        return "Teaching Subject: "+teachingSubject;
    }
}
