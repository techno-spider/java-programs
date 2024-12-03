package threading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithFuture implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        // return the thread name executing this callable task
        return Thread.currentThread()
                     .getName();
    }

    public static void main(String[] args) {
        // create a thread-pool with fixed size 5
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // create a 'CallableWithFuture' instance
        Callable<String> callable = new CallableWithFuture();
        // create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            // submit Callable tasks to be executed by thread pool
            Future<String> store = executorService.submit(callable);
            // add Future to the list, we can get return value using Future
            list.add(store);
        }
        for (Future<String> future : list) {
            try {
                // because Future.get() waits for task to get completed
                System.out.println(new Date() + "::" + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // shut down the service now
        executorService.shutdown();
    }
}

/*
 * output:
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-1
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-2
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-3
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-4
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-5
 * Thu Sep 21 17:05:11 IST 2023::pool-1-thread-2
 * Thu Sep 21 17:05:12 IST 2023::pool-1-thread-3
 * Thu Sep 21 17:05:12 IST 2023::pool-1-thread-5
 * Thu Sep 21 17:05:12 IST 2023::pool-1-thread-1
 * Thu Sep 21 17:05:12 IST 2023::pool-1-thread-4
 */