package intervie_programs_practise_Encapsulation;

public class student {
    // Private fields
    private String name;
    private int rollNumber;
    private char grade;

    // Constructor to initialize student details
    public student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        setGrade(grade); // Use setter to validate grade
    }

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
          } else {
            System.out.println("Invalid grade. Please enter a grade between A and F.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        student student = new student("John Doe", 101, 'G');
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());

        student.setGrade('G'); // Invalid grade
        student.setGrade('A'); // Valid grade
        System.out.println("Updated Grade: " + student.getGrade());
    }
}

// Test this out! Let me know if you want to tweak anything. 🚀

