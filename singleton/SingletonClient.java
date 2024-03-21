package singleton;
public class SingletonClient {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.aMethod();
        Singleton s2 = Singleton.getInstance();
        s2.aMethod();
        if (s1 == s2) {
            System.out.println("Correct: Both s1 and s2 are the same instance");
        } else {
            System.err.println("Error: s1 and s2 are different instances");
        }
    }
}
