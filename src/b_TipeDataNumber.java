public class b_TipeDataNumber {
    public static void main(String[] args) {

        // Integer Number ==> Default = 0
        // byte (-128 sampai 127) ==> 1 byte
        byte byteNumber = 100;
        System.out.println("byte = " + byteNumber);

        // short (-32,768 sampai 32,767) ==> 2 byte
        short shortNumber = 32000;
        System.out.println("short = " + shortNumber);

        // int (-2,147,483,648 sampai 2,147,483,647) => 4 byte
        int intNumber = -1500200100;
        System.out.println("int = " + intNumber);

        // long (-9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807)
        long longNumber = 9223372036854775807L; // Tambahkan L diakhir bilangan
        System.out.println("long = " + longNumber);

        // Floating point number ==> Default = 0.0
        // float - 4 bytes
        float floatNumber = 3.14f;
        float floatNumber2 = 10.5F;
        System.out.println("float number = " + floatNumber + " & " + floatNumber2);

        // double - 8 bytes
        double doubleNumber = 10.10;
        System.out.println("double = " + doubleNumber);

        // Literals
        int decimalInt = 25;
        System.out.println("decimal int = " + decimalInt);

        int hexInt = 0xA132B; //0x
        System.out.println("hex int = " + hexInt);

        int binInt = 0b01010101; //0b
        System.out.println("bin int = " + binInt);

        // Underscore ==> mempermudah membaca angka
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;
        System.out.println("long (underscore) = " + balance);
        System.out.println("int (underscore) = " + sum);

    }
}
