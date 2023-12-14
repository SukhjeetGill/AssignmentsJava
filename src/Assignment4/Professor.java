package Assignment4;

public class Professor extends Person{
    private int employeeid;
    private String department;

    public Professor(int employeeid,String department ,String name,int age){
        super(employeeid,age,name);
        this.employeeid=employeeid;
        this.department=department;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee id: " + employeeid );
        System.out.println("Department: " +  department);
    }
}
