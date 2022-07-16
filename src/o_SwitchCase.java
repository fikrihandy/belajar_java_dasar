import java.util.Scanner;

public class o_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (A/B/C) = ");
        String nilaiStr = scanner.next().toUpperCase();

        // Versi singkat
        switch (nilaiStr) {
            case "A" -> System.out.println("Nilai anda sangat bagus");
            case "B" -> System.out.println("Nilai anda bagus");
            case "C" -> System.out.println("Nilai anda cukup");
            default -> System.out.println("Invalid");
        }

        System.out.print("Masukkan nilai (A/B/C) = ");
        nilaiStr = scanner.next().toUpperCase();

        // Versi full
        switch (nilaiStr) {
            case "A":
                System.out.println("Nilai anda sangat bagus");
                break; // Jika tidak dibreak maka baris selanjutnya dalam blok akan dieksekusi
            case "B":
                System.out.println("Nilai anda bagus");
                break;
            case "C":
                System.out.println("Nilai anda cukup");
                break;
            default: // Dilakukan saat case tidak mendapati hasil
                System.out.println("Invalid");
        }
    }
}
