public class Educational_Counselor extends Employee implements SchoolsMethods{
     
    private String specialization; //Can only get "General Counselor" or "Educational Counselor" or "Educational Team Counselor"

    //Constructor
    public Educational_Counselor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
    //Empty constructor
    public Educational_Counselor() {
        super();
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
        return "Educational_Counselor [name=" + name + ", employeeId=" + employeeId + ", specialization="
                + specialization + "]";
    }
    /*
     * Implements SchoolsMethod
     * Returns true if the specialization is Educational Counselor
     */
    public boolean getByType(){
        return "Educational Counselor".equals(this.specialization);
    }
    

    
}
