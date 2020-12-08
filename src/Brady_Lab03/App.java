// App.java
// Zack Brady | IST 240

public class App {

    public static void main(String args[]) {
        Student student1 = new Student("John", "Boxer", 28);
        Student student2 = new Student("Mary", "Ellison", 19);
        Student student3 = new Student("Emily", "Lakewood", 36);
        Student student4 = new Student("Peter", "Zander", 22);

        Group group1 = new Group("Nittany Lions", student1, student2, student3, student4);

        System.out.println(group1.getInfo());
        System.out.println("Average GPA for Group 1: " + group1.averageGPA);
    }
}
