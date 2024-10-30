class myClass implements Runnable{
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
        Thread t1 = new Thread(new myClass("1"));
        Thread t2 = new Thread(new myClass("2"));
        
        t1.start();
        t2.start();
    }
}