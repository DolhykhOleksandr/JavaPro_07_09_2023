package ua.hillel.dolhykh.homeworks.homework11;

/*Lazy Initialization
We can initialize lazily, but we have lost thread safety.*/
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

/*Synchronized Accessor
    We've brought back thread safety in our implementation! But, slow.
            Now the getInstance method is synchronized,and you can only enter it one at a time. */
class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}

/* Double Checked Locking
 Included:Lazy initialization,Thread safety,High performance in a multi-threaded environment.
 For this implementation option to work correctly, one of two conditions is required. The INSTANCE variable must be either final or volatile.
*/
class Singleton3 {
    private static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }
}
      /* Class Holder Singleton
        Included:Lazy initialization,Thread safety,High performance in a multi-threaded environment.
        For correct operation, it is necessary to guarantee that the Singleton class object is initialized without errors.
        Otherwise, the first call to the getInstance method will end with the error ExceptionInInitializerError,
        and all subsequent calls will end with NoClassDefFoundError.*/

class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonHolder {
        public static final Singleton4 HOLDER_INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

/* Simple Solution
 Included:Thread safety,High performance in a multi-threaded environment.
 Not included:Lazy Initialization.*/
class Singleton5 {
    private static final Singleton5 INSTANCE = new Singleton5();

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return INSTANCE;
    }
}