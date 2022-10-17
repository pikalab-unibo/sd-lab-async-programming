class WrongAsyncFactorialCalculator implements AsyncFactorialCalculator  {

  private final ExecutorService executorService = // ...
  
  // WRONG APPROACH!
  public CompletableFuture<BigInteger> factorial(BigInteger x) {
    CompletableFuture<BigInteger> result = CompletableFuture<>();
    executorService.execute(() -> {
      BigInteger value = // whole computation here
      result.complete(value);
    });
    return result;
  }
}
