public class StudentDetails {
    String name;
    int rollNo;
    double mark;

    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        student.name = "Alice";
        student.rollNo = 101;
        student.mark = 87.5;
        System.out.println("Name: " + student.name);
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Mark: " + student.mark);
    }
}
