import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class test4 {

    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            final int finalI = i;
            Runnable runnable = new Runnable() {
                public void run() {
                    countDownLatch.countDown();
                    System.out.println("线程：" + finalI + "  启动");
                    System.out.println(System.currentTimeMillis());
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                }
            };
            executorService.submit(runnable);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdownNow();
        System.out.println("啦啦啦啦啦啦啦啦");

//        new ReentrantLock()
//        Executors.newCachedThreadPool();
//        Executors.newFixedThreadPool();
//        Executors.newScheduledThreadPool();
//        Executors.newSingleThreadExecutor();
    }
}
