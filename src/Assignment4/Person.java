package Assignment4;

public class Person {
    private int id,age;
    private String name;

    public Person(int id , int age , String name ){
        this.id = id;
        this.age=age;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void displayDetails(){
        System.out.println("Name : " + name );
        System.out.println("Age : " + age );
    }
}

