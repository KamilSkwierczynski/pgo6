public class Grade {
    int grade;
    String subjectName;

    public Grade(int grade, String subjectName) {
        this.grade = grade;
        this.subjectName = subjectName;
    }

    public void print() {
        System.out.printf("%d (%s)\n", grade, subjectName);
    }
}