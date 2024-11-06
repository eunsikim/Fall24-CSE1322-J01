class myClass extends Thread{
    private String id;

    public myClass(String id){
        this.id = id;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread "+id+" is running");
        }
    }
}

public class ExampleA {

    public static void main(String[] args) {
        myClass mc1 = new myClass("1");
        myClass mc2 = new myClass("2");
        
        mc1.start();
        mc2.start();
    }
}