class StudentManager {
    String name;
    int rollNo;
    double mark;

    StudentManager() {
        this("Unknown", 0, 0.0);
    }

    StudentManager(String name, int rollNo, double mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Mark: " + mark);
    }

    void calculateGrade(double mark) {
        if (mark >= 90) System.out.println("Grade A");
        else if (mark >= 80) System.out.println("Grade B");
        else if (mark >= 70) System.out.println("Grade C");
        else if (mark >= 60) System.out.println("Grade D");
        else System.out.println("Grade F");
    }

    void calculateGrade(int mark) {
        if (mark >= 90) System.out.println("Grade A");
        else if (mark >= 80) System.out.println("Grade B");
        else if (mark >= 70) System.out.println("Grade C");
        else if (mark >= 60) System.out.println("Grade D");
        else System.out.println("Grade F");
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentManager s1 = new StudentManager();
        StudentManager s2 = new StudentManager("Asha", 12, 88);
        s1.display();
        s2.display();
        s2.calculateGrade(88);
        s2 = null;
        System.gc();
    }
}
