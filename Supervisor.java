import java.util.Arrays;

public class Supervisor extends Teacher{ // Already implements SchoolMethods in Teacher

    private Employee [] employees;
    private int current;

    //Constructor
    public Supervisor(String name, String type, Employee [] employees, int current){
        super(name, type);
        this.employees = employees;
        this.current = current;
    }
    //Empty constructor
    public Supervisor(){
        super();
        this.employees = new Employee[0];
        this.current = 0;
    }
    //Getters and setters
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
        return "Supervisor [name=" + name + ", type=" + type + ", employees=" + Arrays.toString(employees) + ", num="
                + employeeId + ", current=" + current + "]";
    }
    /*
     * Implements SchoolMethod
     * Returns true if all employees in supervisor's array are Senior teachers, false othereise
     */
    public boolean getByType(){
        //If there are no employees in supervisor's array, return false
        if (current == 0)
            return false;
        for (int i = 0; i < this.current; i++) {
            Employee Tmate = employees[i];
            if (Tmate instanceof Teacher) {
                Teacher teacher = (Teacher) Tmate;
                if ("New".equals(teacher.getType())) {//If there is even 1 teacher that is new, return false
                    return false;
                }
                
            }
            else //If Employee is not a teacher, return false
                return false;
            
        }
        //If we reached this far, all the employees are Senior teachers, then, return true
        return true;
    }

}
