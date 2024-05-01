
    interface UniversityMember {
        String getName();
    }

    interface Employee extends UniversityMember {
        float getSalary();
    }

    interface Student extends UniversityMember {
        String getSubject();
    }

    class UniMember implements UniversityMember {
        private String name;

        UniMember(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    class EmployeeImpl extends UniMember implements Employee {
        private float salary;

        EmployeeImpl(String name, float salary) {
            super(name);
            this.salary = salary;
        }

        @Override
        public float getSalary() {
            return salary;
        }
    }

    class StudentImpl extends UniMember implements Student {
        private String subject;

        StudentImpl(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        @Override
        public String getSubject() {
            return subject;
        }
    }

    class Professor extends EmployeeImpl {
        Professor(String name, float salary) {
            super(name, salary);
        }
    }

    class PhD extends StudentImpl {
        PhD(String name, String subject) {
            super(name, subject);
        }
    }

    class Tutor extends StudentImpl {
        Tutor(String name, String subject) {
            super(name, subject);
        }
    }
    public class Main {
        public static void main(String[] args) {

            UniversityMember john = new UniMember("John Doe");
            Employee profSmith = new Professor("Dr. Smith", 80000);
            Student tutorJane = new Tutor("Jane Smith", "Mathematics");
            Student phdStudent = new PhD("Alice", "Computer Science");

            System.out.println("University Member: " + john.getName());
            System.out.println("Professor: " + profSmith.getName() + ", Salary: $" + profSmith.getSalary());
            System.out.println("Tutor: " + tutorJane.getName() + ", Subject: " + ((Student)tutorJane).getSubject());
            System.out.println("PhD Student: " + phdStudent.getName() + ", Subject: " + phdStudent.getSubject());
        }
    }
