import java.io.Serializable;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private double examPrice;
    private int capacity;

    public Course(String name, double examPrice, int capacity) {
        this.name = name;
        this.examPrice = examPrice;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getExamPrice() {
        return examPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nExam Price: " + examPrice + " TL\nCapacity: " + capacity;
    }
}
