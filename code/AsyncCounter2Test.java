ExecutorService ex = Executors.newSingleThreadExecutor();
AsyncCounter2 x = new AsyncCounter2(ex);

assertEquals(0, counter.getValue());

CompletableFuture<Integer> resultPromise =  x.countUpTo(10_000);

Integer actualResult = resultPromise.get(); // blocking!

assertEquals(Integer.valueOf(10_000), actualResult); 
assertEquals(10_000, counter.getValue());
