import java.util.Arrays;

public class Supervisor extends Teacher {

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
                + num + ", current=" + current + "]";
    }

}
