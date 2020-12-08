// Student.java
// Zack Brady | IST 240

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double GPA;

    public Student(String firstName, String lastName, int age, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = gpa;
    }

    public String getInfo() {
        return this.firstName + " " + this.lastName + "  " + this.age + " " + this.GPA;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double SemesterGPA() {
        double RandomGPA = (Math.random() * 4.00) + 0.00;
        return RandomGPA;
    }
}
