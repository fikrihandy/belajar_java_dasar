public class j_TipeDataArray {
    public static void main(String[] args) {

        // Berisikan kumpulan data dengan tipe data yang sama
        // Jumlah data tidak bisa diubah setelah pertama dibuat
        // Index pertama = 0

        String[] arrayString; // Arrasy dengan tipe data string
        arrayString = new String[3]; // [3] ==> hanya bisa menampung 3 data
        arrayString[0] = "Abdullah";
        arrayString[1] = "Fikri";
        arrayString[2] = "Handi";

        System.out.println("arrayString Index 0 = " + arrayString[0]);
        System.out.println("arrayString Index 1 = " + arrayString[1]);
        System.out.println("arrayString Index 2 = " + arrayString[2]);

        arrayString[2] = "Handy";
        System.out.println("Mengubah value Index 2 = " + arrayString[2] + "\n");

        String[] arrasyString2 = new String[3];

        int[] arrayInt = new int[]{10, 11, 12, 13};
        System.out.println(arrayInt[1]);

        long[] arrayLong = {1000L, 2000L, 3000L};
        System.out.println(arrayLong[2] + "\n");

        // Mengambil panjang array
        System.out.println("Panjang arrayString = " + arrayString.length + "\n"); // return int value

        // Array di dalam Array
        String[][] members = {
                {"Abdullah", "Fikri", "Handi", "Saputra"},
                {"Joko", "Widodo"}, // index 1 dalam array luar.
                {"Neymar", "da", "Silva", "Junior"}
        };

        System.out.println(members[1][0]); // Array luar = 1, array dalam = 0
        System.out.println(members[1][1]);

    }
}
