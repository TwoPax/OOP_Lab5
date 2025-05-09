public class Teacher extends Employee{

    protected String type;
    
    //Counstuctor
    public Teacher(String name, String type) {
        super(name);
        this.type = type;
    }
    //Empty constructor
    public Teacher() {
        super();
        this.type = "";
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
        return "Teacher [name=" + name + ", type=" + type + ", num=" + num + "]";
    }
}
