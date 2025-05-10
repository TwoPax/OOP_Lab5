public class Employee{

    protected String name;
    protected int employeeId;
    private static int num = 1; //Counter for Employee code, making sure we will never have duplicates, starting from 1
     
    //Counstuctor
    public Employee(String name){
        this.name = name;
        this.employeeId = num++;
    }
    //Empty constructor
    public Employee(){
        this.name = null;
        this.employeeId = num++;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeID() {
        return employeeId;
    }
    public void setEmployeeID(int num) {
        this.employeeId = num;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", num=" + num + "]";
    }
    
}