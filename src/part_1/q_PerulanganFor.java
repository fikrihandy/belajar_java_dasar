package part_1;

public class q_PerulanganFor {
    public static void main(String[] args) {
        // for (init statement | kondisi | post statement)
        // init statement => dieksekusi sekali saat pertama dijalankan
        // kondisi => jika true perulangan akan terus dijalankan, jika false perulangan selesai
        // post statement => dieksekusi sekali diakhir perulangan
        // init statemen, kondisi dan post statement => opsional. Jika kondisi tidak dimasukan maka default value = TRUE

        for (int i = 0; i <= 10; i++) {
            System.out.println("Perulangan Index ke-" + i);
        }
    }
}
