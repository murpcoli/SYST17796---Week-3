package studentinfo;

/**
 * This class +++ Insert class description here +++
 *
 * @author Colin Murphy
 */
public class Student 
{
    private String name;
    private String progName;
    private String address;
    
    public Student()
    {
        
    }
    
    public Student(String name) 
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the progName
     */
    public String getProgName() 
    {
        return progName;
    }

    /**
     * @param progName the progName to set
     */
    public void setProgName(String progName) 
    {
        this.progName = progName;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    

}
