import java.util.Objects;
import java.util.Scanner;

public class l_If {
    public static void main(String[] args) {

        byte nilai = 60;
        byte absen = 100;

        if (nilai >= 70 && absen >= 70) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Tidak lulus");
        }

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (A/B/C) = ");
        String nilaiStr = scanner.next().toUpperCase();

        if (Objects.equals(nilaiStr, "A")) {
            System.out.println("Nilai anda sangat bagus");
        } else if (Objects.equals(nilaiStr, "B")) {
            System.out.println("Nilai anda bagus");
        } else if (Objects.equals(nilaiStr, "C")) {
            System.out.println("Nilai anda cukup");
        } else {
            System.out.println("Invalid");
        }

    }
}
