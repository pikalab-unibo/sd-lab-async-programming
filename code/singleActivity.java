@Test
public void singleActivity() throws InterruptedException {
  AsyncCounter1 x = new AsyncCounter1(ex);

  assertEquals(0, x.getValue());
  
  x.countUpTo(10);

  Thread.sleep(1000); // TIME DEPENDENT TEST!

  assertEquals(10, x.getValue());
}
