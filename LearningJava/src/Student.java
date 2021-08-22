public class Student {
    private String firstName;
    private String lastName;
    protected int age;
    private String phoneNumber;
    protected int[] grades;

    public Student(String firstName, String lastName, int age, String phoneNumber){
        firstName = this.firstName;
        lastName = this.lastName;
        age = this.age;
        phoneNumber = this.phoneNumber;
        grades = this.grades;
    }
    public static double getGPA(int[] grades) {
        int gradePoints = 0;
        int gpaEntries = grades.length;

        for (int grade : grades) {
            gradePoints += grade;
        }
        double gradePointAverage = gradePoints/gpaEntries;
                return gradePointAverage;
    }
    public static void writeInfo(int age, double GPA, char firstInitial, char lastInitial, boolean attendance) {
        System.out.println(age);
        System.out.println(GPA);
        System.out.println(String.format("The student's first initial is: %c", firstInitial));
        System.out.println(String.format("The student's last initial is: %c", lastInitial));
        System.out.println(attendance);
    }
    public static char getFirstInitial(String first) {
        char firstInitial = first.charAt(0);
        return firstInitial;
    }
    public static char getLastInitial(String last) {
        char lastInitial = last.charAt(0);
        return lastInitial;
    }
}

