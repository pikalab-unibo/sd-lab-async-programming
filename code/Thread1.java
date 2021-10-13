class Program {

    private static Thread thread = new Thread(Program::otherThread); // Thread creation

    public static void main(String[] args) {
        System.out.println("1");
        thread.start();     // thread start
        System.out.println("2");
        System.out.println("3");
        thread.join();      // thread join
        System.out.println("4");
        // main thread termination
    }

    private static void otherThread() {
        System.out.println("A");
        System.out.println("B");
        // thread termination
    }
}
