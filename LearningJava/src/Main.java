public class Main {
    public static void main(String[] args) {
        Student one = new Student("Adam", "Hillbilly", 15, "8164190573");
        one.grades = new int[]{56, 22, 78, 100};
        double studentGPA = Student.getGPA(one.grades);
        boolean hasPerfectAttendance = true;
        String firstName = "Adam";
        String lastName = "Hillbilly";
        char studentFirstInitial = Student.getFirstInitial(firstName);
        char studentLastInitial = Student.getLastInitial(lastName);
        Student.writeInfo(one.age, studentGPA, studentFirstInitial, studentLastInitial, hasPerfectAttendance);
    }
}
