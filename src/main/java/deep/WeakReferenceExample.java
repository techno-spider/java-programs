package deep;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {

        // Create a strong reference to an object
        String str = new String("Hello!");

        // Create a weak reference to the same object
        WeakReference<String> weakReference = new WeakReference<>(str);

        // Print the object using the weak reference
        System.out.println("Before GC: " + weakReference.get());

        // Nullify the strong reference
        str = null;

        // Suggest the JVM to run the garbage collector
        System.gc();

        // Print the object using the weak reference after GC
        System.out.println("After GC: " + weakReference.get());
    }
}

/*
 * output:
 * Before GC: Hello!
 * After GC: null
 * */