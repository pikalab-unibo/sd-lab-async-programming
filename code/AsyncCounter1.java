public class AsyncCounter1 {
  
  private ExecutorService executor = // initialised in constructor
  private int value = 0;
  
  public void countUpTo(int max) {
    executor.execute(() -> countUpToImpl(max));
  }
  
  private void countUpToImpl(int max) {
    value++;
    if (value < max) {
      countUpTo(max); // indirect, async recursion!
    }
  }
}
