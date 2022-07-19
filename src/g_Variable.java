public class g_Variable {
    public static void main(String[] args) {
        // Digunakan untuk menyimpan data dalam memori
        // Java = static type, 1 variable hanya bisa menyimpan data yang sama

        String name; // Membuat variable string
        name = "Abdullah";
        System.out.println(name);

        int age = 22; // Membuat variable integer
        String address = "Indonesia"; // Membuat variable string

        // Mengganti nilai variabel
        // name = 100; --> ERROR
        name = "Fikri";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Keyword var --> WAJIB menginisiasi value-nya secara langsung!!
        //var name2; ERROR
        var name2 = "Jokowi";
        var age2 = 50;
        var isPresident = true;

        System.out.println(name2);
        System.out.println(age2);
        System.out.println(isPresident);
    }
}
