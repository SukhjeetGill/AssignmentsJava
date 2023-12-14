package Assignment4;

public class UniversityDemo {
    public static void main(String[] args){
        Student student= new Student(65580,21, 'B', "Sukhjeet Singh");
        Professor professor= new Professor(19990,"Computer Science", "Surinder Singh",39);
        student.setGrade('A');
        student.setStudentid(65582);
        professor.setDepartment("Mathematics");
        professor.setEmployeeid(19995);
        student.displayDetails();
        professor.displayDetails();
    }
}
