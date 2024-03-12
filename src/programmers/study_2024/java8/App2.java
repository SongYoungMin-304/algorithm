package programmers.study_2024.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            System.out.println("hello check");
            return "hello";
        };

        Callable<String> hello2 = () -> {
            Thread.sleep(3000L);
            System.out.println("hello2 check");
            return "hello2";
        };

        // invokeAll : 전부 끝날 때까지 기다린다.
        /*List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, hello2));

        //executorService.invokeAny(Arrays.asList(hello, hello2));

        for(Future<String> future : futures){
            System.out.println(future.get());
        }*/


        // invokeAny : 하나라도 끝나면  그냥 멈춘다...
        /*String s = executorService.invokeAny(Arrays.asList(hello, hello2));
        System.out.println(s);*/


        Future<String> helloFuture = executorService.submit(hello);

        System.out.println(helloFuture.isDone());
        System.out.println("Started");

        helloFuture.get();






    }

}
