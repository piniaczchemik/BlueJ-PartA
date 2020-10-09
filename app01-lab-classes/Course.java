
/**
 * Write a description of class Course here.
 *
 * Kamil
 * 09/10/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNumber;
    // field variable course title
    private String title;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNnumber, String title)
    {
        this.codeNumber = codeNumber;   
        this.title = title; 
    }

    /**
     * method for printing course data to the screen 
     */
     public void print()
     {
     System.out.println("Course code: " + codeNumber
     + ", title: " + title); 
    }

}
