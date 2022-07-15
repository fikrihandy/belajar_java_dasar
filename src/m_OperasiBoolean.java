public class m_OperasiBoolean {
    public static void main(String[] args) {
        // &&   => AND ==> semua harus true untuk mendapatkan hasil TRUE
        // ||   => OR ==> jika ada salah satu true maka mendapat hasil TRUE
        // !    => NOT ==> akan membalikkan nilai

        byte absen = 75;
        byte nilaiAkhir = 90;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 85;

        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
