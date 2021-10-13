class Program {
    private static Thread thread = new Thread(Program::otherThread);

    private static int x = 0;

    private static void otherThread() {
        System.out.println(x);
        x = 2;
        System.out.println(x);
    }

    public static void main(String[] args) {
        thread.start();

        System.out.println(x);
        x = 1;
        System.out.println(x);
    }
}
