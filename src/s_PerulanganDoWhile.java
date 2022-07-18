public class s_PerulanganDoWhile {
    public static void main(String[] args) {
        // pengecekan kondisi dilakukan diakhir
        // minimal perulangan dilakukan 1x

        byte counter = 2;
        System.out.println("Contoh 1");
        do {
            System.out.println("counter = " + counter);
        } while (counter >= 10); // false tetapi tetap dieksekusi 1x

        System.out.println("\nContoh 2");
        do {
            System.out.println("counter = " + counter);
            counter += 2;
        } while (counter <= 10); // TRUE
    }
}
