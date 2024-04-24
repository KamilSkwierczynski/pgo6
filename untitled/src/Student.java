import java.util.ArrayList;
import java.util.Date;
public class Student {
    public static int counter = 0;
    private int currentSemester = 1;
    private final int ITN = 0;
    private static final ArrayList<Student> students = new ArrayList<>();
    private final String fname;
    private final String lname;
    private final String email;
    private final String addres;
    private final String phoneNumber;
    private final Date birthDate;
    private final String index;
    private StudyProgramme studyProgramme;

    public Student(String fname, String lname, String addres, String email, String phoneNumber, String birthDate, String index) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.index = "s" + (counter == 7 ? counter : ++counter);
        Student.students.add(this);
    }
    public String getName() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getEmail() {
        return email;
    }
    public String getAddres() {
        return addres;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getIndex() {return index;}
    public static void promoteAllStudents() throws IllegalStateException {
        for (Student student : students) {
            student.promoteThisStudent();Student();
        }
    }
    public void promoteThisStudent() throws IllegalStateException {
        if (ITN > studyProgramme.getNumberOfPossibleITNs()) {
            throw new IllegalStateException("This student has exceeded the maximum number of possible ITNs");
        } else {
            currentSemester++;
        }
    }
    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + fname + lname());
        System.out.println("Index Number: " + index);
        System.out.println("Programme: " + studyProgramme.name);
        System.out.println("Semester: " + currentSemester);
        System.out.println("Grades: ");
        printGrades();
    }
    public void printGrades() {
        for (Grade grade : grades) {
            grade.print();
        }
    }

}
