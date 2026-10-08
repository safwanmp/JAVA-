interface Printable {
    void print();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo);
    }
}

class Teacher implements Printable {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void print() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

public class PrintableDemo {
    public static void main(String[] args) {
        Printable s = new Student("Alice", 101);
        Printable t = new Teacher("John", "Java");
        s.print();
        t.print();
    }
}
