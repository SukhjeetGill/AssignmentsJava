package Assignment4;

public class Student extends Person{
    private int studentid;
    private char grade;
    public Student(int studentid,int age,char grade,String name){
        super(studentid,age,name);
        this.studentid =studentid;
        this.grade=grade;
    }

    public int getStudentid() {
        return studentid;
    }
    public char getGrade(){
        return grade;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student id:" + studentid);
        System.out.println("Grade:" + grade);
    }
}
