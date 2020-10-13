package java.lang;

@FunctionalInterface
public interface Runnable {
    void run();
}

// can be instantiated out of a lambda in the form:
//          () -> { ... }
