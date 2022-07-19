package part_1;

public class t_BreakDiLoop {
    public static void main(String[] args) {
        byte counter = -10;
        while (true) {
            System.out.println("counter = " + counter);
            if (counter == 10) {
                break; // break digunakan untuk mengentikan perulangan
            }
            counter++;
        }
    }
}
