class student{
    public String name;
    public float gpa;
    public int id;
    public static int count = 0;

    public student(){
        name = "John Doe";
        gpa = 4f;
        id = count++;  
    }

    public student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
        id = count++;
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

    @Override
    public String toString(){
        return "Hi my name is " + name + " my id is: " + id;
    }
    

    public int getCount(){
        return count;
    }

    public void increaseCount(){
        count++;
    }
 }

public class ExampleC {
    public static void main(String[] args) {
        // int[] arrayIntegers = new int[9];
        // student[] arrayStudents = new student[9];

        // for(int i = 0; i < arrayStudents.length; i++){
        //     arrayStudents[i] = new student();
        // }

        // for(int i = 0; i < arrayStudents.length; i++){
        //     System.out.println(arrayStudents[i]);
        // }

        System.out.println(student.count);
        
        student.count++;
        
        System.out.println(student.count);


        student s1 = new student();
        student s2 = new student();

        // System.out.println(s1.count);
        // s1.increaseCount();
        // System.out.println(s2.count);
        // s2.increaseCount();
        // System.out.println(student.count);

        s1.gpa = 23;
        System.out.println(s2.gpa);

    }    
}
