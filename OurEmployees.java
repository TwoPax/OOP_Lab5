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
        for (Employee employee: this.employees) {
            if ( employee != null && employee instanceof Supervisor) {
                supervisors = Arrays.copyOf(supervisors, count);
                supervisors[count] = (Supervisor) employee;
                count++;
            }
        }
        return supervisors;

    }
    /*
     * Input: An Edcational counselor specialization
     * Output: The last Educational councelor with this specified specialization, null if does not exist
     */
    public Educational_Counselor getEducational_Counselor(String specialization){
        Educational_Counselor current = null;
        for (Employee employee : employees) {
            if (employee != null && employee instanceof Educational_Counselor) {
                String spec = ((Educational_Counselor) employee).getSpecialization();
                int num = ((Educational_Counselor)employee).getNum();
                if(spec.equals(specialization) && num > current.getNum()){
                    current = (Educational_Counselor) employee;
                }

                
            }
            
        }

    }
    


    
    
}
