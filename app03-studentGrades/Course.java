import java.util.ArrayList;

public class Course
{
    //The name of the course
    private String title;
    //The modules of a given course
    private ArrayList<Module> modules;
    //The total current marks
    private int currentMarks;
    //The final grade 
    private String finalGrade;
    
    /**
     * Create a course with a title and a list for modules
     */
    public Course(String title)
    {
        this.title= title;
        modules= new ArrayList<Module>();
        this.currentMarks= 0;
        this.finalGrade= null;
    }
    
    /**
     * Add a module to the course
     */
    public void addModule(Module title)
    {
        this.modules.add(title);
    }
    
    /**
     * Final grade and coverts it into a letter
     */
    private void calcFinalGrade()
    {
        if(this.currentMarks >= 0 && this.currentMarks <= 39)
        {
            this.finalGrade= "F";
        }
        
        else if(this.currentMarks >= 40 && this.currentMarks <=49)
        {
            this.finalGrade= "D";
        }
        
        else if(this.currentMarks >= 50 && this.currentMarks <= 59)
        {
            this.finalGrade= "C";
        }
        
        else if(this.currentMarks >= 60 && this.currentMarks <= 69)
        {
            this.finalGrade= "B";
        }
       
        else if(this.currentMarks >= 70 && this.currentMarks <= 100)
        {
            this.finalGrade= "A";
        }
    
        else 
        {
            System.out.println("Unexpected error");
        }
    }
    
    /**
     * gets and prints the  grades per module and the final grade 
     */
    public void getFinalGrade()
    {
       for (Module module: modules)
       {
        System.out.println(module.getDetails());
        this.currentMarks = (currentMarks + module.getMark());
        }
        calcFinalGrade();
        System.out.println("Final Grade: "+ this.finalGrade);
    }
    
    /**
     * Prints out all the current modules for a course
     */
    public void printCourse()
    {
     System.out.println(this.title);
     
     for(Module module : modules)
     {
         System.out.println(module.getDetails());
     }
    }
}