package HW1.src.entities;

public class PhD implements IPhD{
    private IEmployee self;
    private String reasearchSubject;
    private String chair;
    public PhD(IEmployee self, String reasearchSubject, String chair){
        this.self = self;
        this.reasearchSubject = reasearchSubject;
        this.chair = chair;
    }

    @Override
    public String getName() {
        return self.getName();
    }
    @Override
    public String getResearchSubjectAndChair(){
        return "Research Subject: "+reasearchSubject+" And Chair: "+chair;
    }

    @Override
    public float getSalary() {
        return self.getSalary();
    }
}
