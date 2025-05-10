import java.util.Arrays;

public class OurEmployees {

    private Employee [] employees;
    private int current;

    //Constructor
    public OurEmployees(Employee[] employees, int current) {
        this.employees = employees;
        this.current = current;
    }
    //Empty constructor
    public OurEmployees(){
        this.employees = new Employee[0];
        this.current = 0;
    }
    //Getters and Setters
    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    @Override
    public String toString() {
        return "OurEmployees [employees=" + Arrays.toString(employees) + ", current=" + current + "]";
    }
    /*
     * Output: Array of all supervisors
     */
    public Supervisor [] numSupervisor(){
        Supervisor [] supervisors = new Supervisor[0];
        int count = 0;
        for (int i = 0; i < this.current; i++) {
            if ( employees[i] != null && employees[i] instanceof Supervisor) {
                supervisors = Arrays.copyOf(supervisors, count + 1);
                supervisors[count] = (Supervisor) employees[i];
                count++;
            }
        }
        return supervisors;

    }
    /*
     * Output: Array of all Educational Counselors
     */
    public Educational_Counselor [] numEducational_Counselors(){
        Educational_Counselor [] educational_counselors = new Educational_Counselor[0];
        int count = 0;
        for (int i =0; i < this.current; i++) {
            if ( employees[i] != null && employees[i] instanceof Educational_Counselor) {
                educational_counselors = Arrays.copyOf(educational_counselors, count + 1);
                educational_counselors[count] = (Educational_Counselor) employees[i];
                count++;
            }
        }
        return educational_counselors;

    }/*
     * Input: Array of educational counselors, a specialization
     * Output: An array of educational counselors of that specialization
     */
    public Educational_Counselor [] getE_C_Specialization(Educational_Counselor [] educational_counselors, String specialization){
        Educational_Counselor [] E_C_Special = new Educational_Counselor[0];
        int count = 0;
        for (Educational_Counselor educational_Counselor : educational_counselors) {
            if(educational_Counselor != null && specialization.equals(educational_Counselor.getSpecialization())){
                E_C_Special = Arrays.copyOf(E_C_Special, count + 1);
                E_C_Special[count] = educational_Counselor;
                count++;
            }
        }
        return E_C_Special;
    }
    /*
     * Input: An Edcational counselor specialization
     * Output: The last Educational councelor with this specified specialization, null if does not exist
     */
    public Educational_Counselor getEducational_Counselor(String specialization){

        Educational_Counselor [] educational_Counselors = numEducational_Counselors(); // Creating an array of all Educational Counselors
        Educational_Counselor [] special_E_C = getE_C_Specialization(educational_Counselors, specialization); // Creating an array of Educational counselors with giving specialization

        if(special_E_C.length == 0){ // If there are no counselors with needed specialization
            return null;
        }

        else{
            //Now, finding the counselor with the greatest code
            Educational_Counselor maxIdCounselor = special_E_C[0];
            for (int k = 1; k < special_E_C.length; k++){
                if (special_E_C[k].getEmployeeID() > maxIdCounselor.getEmployeeID()){
                    maxIdCounselor = special_E_C[k];
                }
            }
        return maxIdCounselor;
        }

        
                    
            
        }
    /*
     * Input: An Employee
     * Effect: Adds the employee to the array if possible
     * Output: True if added succesfully, false otherwise
     */
    public boolean addToArray(Employee employee){
        if(employee == null){
            System.out.println("Could not add employee");
            return false;
        }
        for(int i = 0; i< this.current; i++){
            if(this.employees[i] != null && this.employees[i].getEmployeeID() == employee.getEmployeeID()){
                System.out.println("Employee is already in our system");
                return false;
            }
        }
        if(this.current >=500){
            System.out.println("Full capacity, can not add employee");
            return false;
        }
        //If we reached this far, we can add the new employee
        this.employees = Arrays.copyOf(this.employees, current + 1);
        this.employees[current] = employee;
        current++;
        System.out.println("New employee added succesfully");
        return true;

    
        

        
    }
    }
    


    
    

