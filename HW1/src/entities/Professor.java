package HW1.src.entities;

public class Professor implements IProfessor{
    private IEmployee self;
    private String researchTopic;
    public Professor(IEmployee self, String researchTopic){
        this.self = self;
        this.researchTopic = researchTopic;
    }

    @Override
    public String getName() {
        return self.getName();
    }

    @Override
    public float getSalary() {
        return self.getSalary();
    }

    @Override
    public String getResearchTopic() {
        return "Research Topic: "+researchTopic;
    }
}
