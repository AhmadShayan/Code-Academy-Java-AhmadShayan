import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIOUtil {

    public static void writeStudentsToFile(List<Student> students, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(students);
            System.out.println("Student records written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing student records to file: " + e.getMessage());
        }
    }

    public static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (ArrayList<Student>) inputStream.readObject();
            System.out.println("Student records read from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading student records from file: " + e.getMessage());
        }

        return students;
    }

    public static void writeCoursesToFile(List<Course> courses, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(courses);
            System.out.println("Course records written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing course records to file: " + e.getMessage());
        }
    }

    public static List<Course> readCoursesFromFile(String fileName) {
        List<Course> courses = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            courses = (ArrayList<Course>) inputStream.readObject();
            System.out.println("Course records read from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading course records from file: " + e.getMessage());
        }

        return courses;
    }
}
