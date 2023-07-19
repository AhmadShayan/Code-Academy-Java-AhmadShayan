import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        generateStudentFile();
        generateCourseFile();
    }

    private static void generateStudentFile() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ahmad", "Java"));
        students.add(new Student("Hafsa", "Python"));

        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Student student : students) {
                writer.write(student.getName() + "," + student.getLanguagePreference() + "\n");
            }
            System.out.println("students.txt file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating students.txt file: " + e.getMessage());
        }
    }

    private static void generateCourseFile() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java Programming", 100, 10));
        courses.add(new Course("Python Programming", 100, 5));

        try (FileWriter writer = new FileWriter("courses.txt")) {
            for (Course course : courses) {
                writer.write(course.getName() + "," + course.getExamPrice() + "," + course.getCapacity() + "\n");
            }
            System.out.println("courses.txt file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating courses.txt file: " + e.getMessage());
        }
    }
}
