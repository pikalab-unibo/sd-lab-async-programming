class CompletableFuture<X> implements Future<X> {
    
  // completes the promise with the provided value
  boolean complete(X value)   
  
  // completes the promise exceptionally
  boolean completeExceptionally(Throwable ex)
  
  // maps the current promise to a new one, attained by 
  // transforming its value via the provided function
  <Y> CompletableFuture<Y> thenApply(Function<X, Y> fn)
  
  // adds a callback intercepting the completion of the current
  // promise, and returns it  
  CompletableFuture<X> whenComplete(BiConsumer<X, Throwable> bc)

  // other methods
}
