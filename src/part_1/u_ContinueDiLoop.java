package part_1;

public class u_ContinueDiLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                continue; // lanjut ke perulangan setelahnya
            }
            System.out.println("i = " + i);
        }
    }
}
