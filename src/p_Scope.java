public class p_Scope {
    public static void main(String[] args) {
        sayHello("Abdullah");
        sayHello("");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
