package singleton;
class Singleton {
    // the constructor must be either private or protected
    protected Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private static Singleton instance;

    public void aMethod() {
        System.out.println("Inside Singleton::aMethod");
    }

}