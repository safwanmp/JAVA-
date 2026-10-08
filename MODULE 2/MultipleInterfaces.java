interface Sports {
    void sportInfo();
}

interface Academics {
    void academicInfo();
}

class StudentRecord implements Sports, Academics {
    String name;

    StudentRecord(String name) {
        this.name = name;
    }

    public void sportInfo() {
        System.out.println(name + " plays cricket");
    }

    public void academicInfo() {
        System.out.println(name + " studies Computer Science");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Aisha");
        student.sportInfo();
        student.academicInfo();
    }
}
