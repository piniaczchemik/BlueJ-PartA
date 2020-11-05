


public class Module
{
 
    private String title;
    private String code;
    private int marks;
    
 
    public Module(String title,String code)
    {
     this.title = title;
     this.code = code;
     this.marks = 0;
    }
    
    public String getCode()
    {
       return code;
    }
    
 
    public String getTitle()
    {
        return title;
    }
    
    public void addMarks(int marks)
    {
       this.marks = (this.marks + marks);
    }
    
 
    public int getMark()
    {
        return marks;
    }
    
   
    public String getDetails()
    {
        return (this.code + ": " + this.title + " " +this.marks + "/100");
    }
}