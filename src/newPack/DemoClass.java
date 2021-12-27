package newPack;

class Hi extends Thread{

    public void run(){
        System.out.println("Hi");
    }
}

class Hello implements Runnable{

    public void run(){
        System.out.println("Hai guys");
    }
}
public class DemoClass {

    public static void main(String[] args) throws InterruptedException {

        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Hi();
//        Thread.sleep(10);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}
