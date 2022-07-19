public class l_TernaryOperator {
    public static void main(String[] args) {

        byte nilai = 75;
        String ucapan;

        // Dengan if-else

        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Anda Tidak Lulus";
        }

        System.out.println(ucapan);

        // Dengan ternary operator
        nilai = 60;
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Anda Tidak Lulus"; // Depan TRUE, Belakang FALSE !!
        System.out.println(ucapan2);

    }
}
