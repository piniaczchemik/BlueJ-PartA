import java.util.*;
public class Student
{
    // Student full name
    private String name;
    // Student ID
    private String id;
    // The amount of credits for study 
    private int credits;
    //The course the student is on
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
        course = null;
    }
    
    /**
     * Enrolles a student on a course
     */
    public void enrollStudent(Course course)
    {
        this.course = course;
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", Student ID: " + id + ", credits: " + credits);
    }
    
    /**
     * Prints out the final grade of the student
     */
    public void printFinalGrade()
    {
        print();
        this.course.getFinalGrade(); 
    }
}