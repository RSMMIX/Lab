public class Pro2_64010726 {

    public static void main(String[] args) {
        Course course = new Course("Prince");
        course.addStudent("Moji");
        course.addStudent("Pawn");
        course.addStudent("Molinchi");
        course.dropStudent("Pawn");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }
    }

}
class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseString() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                System.arraycopy(students, i + 1, students, i, numberOfStudents - i - 1);
                students[numberOfStudents - i] = null;
                break;
            }
        }
        numberOfStudents--;
    }

    public void clear() {
        students = new String[2];
        numberOfStudents = 0;
    }
}