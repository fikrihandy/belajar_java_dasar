// method atau function adalah blok kode program yang berkajalan saat dipanggil

public class w_Method {
    static void sayHello() { // membuat method
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        sayHello(); // memanggil method
        salam("Na", "Hee-do"); // memanggil method dengan parameter
        int varC = sum(5, 5); // mendapatkan return value dari method sum
        System.out.println(varC); // show data
    }

    static void salam(String firstName, String lastName) { // method dengan parameter
        System.out.println("Assalamu'alaikum " + firstName + " " + lastName + ", Apa kabar?");
    }

    static int sum(int a, int b) { // method dengan return value
        int c = a + b;
        return c;
    }
}
