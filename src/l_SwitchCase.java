import java.util.Scanner;

public class l_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (A/B/C) = ");
        String nilaiStr = scanner.next().toUpperCase();

        // Versi singkat (Switch lambda)
        switch (nilaiStr) {
            case "A" -> System.out.println("Nilai anda sangat bagus");
            case "B", "C" -> System.out.println("Nilai anda bagus");
            case "D" -> System.out.println("Nilai anda kurang");
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

        // Switch dengan yield
        System.out.print("Masukkan nilai (A/B/C/D) = ");
        String nilai = scanner.next().toUpperCase();

        String ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus dengan Baik"; // Mengembalikan nilai
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Salah Jurusan ?";
        };
        System.out.println(ucapan);

    }
}
