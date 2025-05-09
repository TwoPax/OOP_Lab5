public class Educational_Counselor extends Employee{
     
    private String specialization;

    //Constructor
    public Educational_Counselor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
    //Empty constructor
    public Educational_Counselor() {
        this.specialization = "";
    }
    //Getters and Setters
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return "Educational_Counselor [name=" + name + ", num=" + num + ", specialization=" + specialization + "]";
    }
    

    
}
