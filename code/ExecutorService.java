package java.util.concurrent;

public interface ExecutorService {
  // schedules a task
  void execute(Runnable command);
  
  // schedules a task, returning a future to consume its result
  <T> Future<T> submit(Callable<T> task);
  
  // prevents this executor from accepting new tasks
  void shutdown();
  
  // shutdowns and interrupts the current executor
  List<Runnable> shutdownNow();
  
  // blocks the caller until the executor terminates
  boolean awaitTermination(long timeout, TimeUnit unit) 
      throws InterruptedException;
}
