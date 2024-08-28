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

public class ExampleB {
    public static void main(String[] args) {
        int[] arrayIntegers = new int[9];
        student[] arrayStudents = new student[9];

        for(int i = 0; i < arrayStudents.length; i++){
            arrayStudents[i] = new student();
        }

        for(int i = 0; i < arrayStudents.length; i++){
            System.out.println(arrayStudents[i].name);
        }
    }    
}
