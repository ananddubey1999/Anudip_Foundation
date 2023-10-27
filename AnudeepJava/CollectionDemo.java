 import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private List<Subject> subjects;

    // Getters and setters for id, name, and subjects

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

class Subject {
    private int code;
    private String name;

    // Getters and setters for code and name

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CollectionDemo {
    public static void main(String[] args) {
        Student student = new Student();
        List<Subject> subjects = new ArrayList<Subject>();
        Subject subject1 = new Subject();
        subject1.setCode(210);
        subject1.setName("English");
        subjects.add(subject1);
        Subject subject2 = new Subject();
        subject2.setCode(220);
        subject2.setName("Science");
        subjects.add(subject2);
        Subject subject3 = new Subject();
        subject3.setCode(230);
        subject3.setName("Computer");
        subjects.add(subject3);

        // Setting bean values
        student.setId(101);
        student.setName("Karthik");
        student.setSubjects(subjects);

        // Getting bean values
        System.out.println("Student Id: " + student.getId());
        System.out.println("Student Name: " + student.getName());

        List<Subject> subjectList = student.getSubjects();
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            System.out.println("Student Subject " + (i + 1) + ": " + subject.getCode() + " - " + subject.getName());
        }
    }
}
