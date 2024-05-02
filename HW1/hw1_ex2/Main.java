package HW1.hw1_ex2;

import HW1.hw1_ex2.entities.*;

public class Main {
    public static void main(String[]args){
        IUniMember janeDoe = new UniMember("Jane", "Doe");
        IEmployee jdEmployed = new Employee(janeDoe, 3000);
        ITutor jdAsTutor = new Tutor(jdEmployed, "Computer Science");
        IPhD jdAsPhD = new PhD(jdEmployed, "Philosophy", "ChairForPhilosophy");
        IProfessor jdAsProfessor = new Professor(jdEmployed, "Smart Mobility");
        IStudent jdAsStudent = new Student(janeDoe, "Information Systems");
        System.out.println("Uni Member: "+ janeDoe.getName());
        System.out.println("Employee: "+jdEmployed.getName() +" & Salary: "+ jdEmployed.getSalary());
        System.out.println("Tutor: "+ jdAsTutor.getName() +" & Salary: "+jdAsTutor.getSalary()+" & "+jdAsTutor.getTeachingSubject());
        System.out.println("PhD: "+jdAsPhD.getName()+" & Salary: "+jdAsPhD.getSalary()+" & "+jdAsPhD.getResearchSubjectAndChair());
        System.out.println("Professor: "+jdAsProfessor.getName()+" & Salary: "+jdAsProfessor.getSalary()+" & "+jdAsProfessor.getResearchTopic());
        System.out.println("Student: "+jdAsStudent.getName()+" & "+jdAsStudent.getSubject());
    }
}
