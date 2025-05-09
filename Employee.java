public class Employee{

    protected String name;
    protected int num = 0; //Counter for Employee code, making sure we will never have duplicates
     
    //Counstuctor
    public Employee(String name){
        this.name = name;
        this.num++;
    }
    //Empty constructor
    public Employee(){
        this.name = "";
        this.num++;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", num=" + num + "]";
    }
    
}