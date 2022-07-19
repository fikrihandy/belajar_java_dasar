public class y_MethodOverloading {
    static void sayHello() {
        System.out.println("1. Hello");
    }

    static void sayHello(String name) {
        System.out.println("2. Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("3. Hello " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Lemper");
        sayHello("Abdullah", "Fikri");
    }
}
