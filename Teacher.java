public class Teacher extends Employee implements SchoolsMethods{

    protected String type; // Can only be "Senior" or "New"
    
    //Counstuctor
    public Teacher(String name, String type) {
        super(name);
        this.type = type; 
    }
    //Empty constructor
    public Teacher() {
        super();
        this.type = null;
    }
    //Getters and Setters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", type=" + type + ", num=" + employeeId + "]";
    }
    /*
     * Implements SchoolMethhood
     * Returns true if teacher is senior and not a supervisor, false otherwise
     */
    public boolean getByType(){
        return this.type.equals("Senior") && !(this instanceof Supervisor);
    }   
}
