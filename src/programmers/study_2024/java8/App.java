package programmers.study_2024.java8;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() ->{
            System.out.println("exit");
        });

        System.out.println("Thread: " + thread.getName());

        System.out.println("Thread: " + Thread.currentThread().getName());

        thread.start();

        thread.join();

        System.out.println("Hello: " + Thread.currentThread().getName());
    }

}
