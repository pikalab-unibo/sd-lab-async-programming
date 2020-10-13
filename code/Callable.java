package java.util.concurrent;

@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}

// can be instantiated out of a lambda in the form:
//          () -> value       (assuming value is of type V) 
