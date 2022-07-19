public class k_OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        // + = penjumlahan
        System.out.println(a + b);

        // - = pengurangan
        System.out.println(a - b);

        // * = perekalian
        System.out.println(a * b);

        // / = pembagian
        System.out.println(a / b);

        // sisa bagi = %
        System.out.println(a % b);

        // augmented assignments
        a = a + 15; // disingkat a += 15
        System.out.println(a);

        b += 15;
        System.out.println(b);

        // unary operator
        b++; // => b = b + 1
        System.out.println(b);

        b--;
        System.out.println(b);

        System.out.println(!true); // ! = kebalikan

    }
}
