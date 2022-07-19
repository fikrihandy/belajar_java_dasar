package part_1;

public class v_PerulanganForEach {
    public static void main(String[] args) {
        String[] array = {"Abdullah", "Fikri", "Handi", "Saputra"};

        // Tanpa for each
        System.out.println("1. Tanpa for each");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array ke-" + i + " = " + array[i]);
        }

        // Dengan for each
        System.out.println("\n2. Dengan for each");
        for (var value : array) {
            System.out.println(value);
        }
    }
}
