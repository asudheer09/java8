interface Dao {
    public static final String COLOR = "RED";
    public abstract void printWelcome();
    static void printStaticMethod() {
        System.out.println("static method");
    }
    default void printDefaultMessage() {
        System.out.println("default method");
    }
}

public class Main {
    public static void main(String[] args) {

        Dao dao =()->{
            System.out.println("print welcome");
        };

        dao.printWelcome();
        Dao.printStaticMethod();
        dao.printDefaultMessage();

    }
}