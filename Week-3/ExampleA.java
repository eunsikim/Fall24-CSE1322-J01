 class student{
    public String name;
    public float gpa;

    public student(){
        name = "John Doe";
        gpa = 4f;  
    }

    public student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
 }

public class ExampleA {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Eun Sik", 2.0f);

        s2.sleep();
        s2.setName("John Doe");
        s2.sleep();
    }    
}
