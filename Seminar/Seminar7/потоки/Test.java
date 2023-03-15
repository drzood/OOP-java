package потоки;

public class Test {
    public static void main(String[] args) {
        new myThread().start();
        System.out.println("Hi, 1!");
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hi, 2!");
    }
}
