public class i_TipeDataBukanPrimitif {
    // Contoh => Objek => String => Memiliki method
    // Default value = null

    // Representasi
    // byte     => Byte
    // short    => Short
    // int      => Integer
    // long     => Long
    // float    => Float
    // double   => Double
    // char     => Character
    // boolean  => Boolean
    public static void main(String[] args) {
        Integer integerNumber = 10;
        System.out.println("Integer object = " + integerNumber);

        Long longNumber = 1000L;
        System.out.println("Long object = " + longNumber);

        // byte byteNumberNull = null; => ERROR
        Byte byteNumber = null;
        System.out.println("Byte object = " + byteNumber);
        byteNumber = 100;
        System.out.println("Byte object = " + byteNumber);

        // Konversi
        int intPrimitif = 112;
        System.out.println("Integer NOT object = " + intPrimitif);
        Integer bukanPrimitif = intPrimitif;
        System.out.println("Integer object = " + bukanPrimitif);

        int age = 30;
        Integer ageObject = age;
        System.out.println("Integer object = " + age);
        int ageAgain = ageObject;
        System.out.println("Integer NOT object = " + ageAgain);

        short shortAge = ageObject.shortValue();
        System.out.println("Short NOT object = " + shortAge);

        byte byteAge = ageObject.byteValue();
        System.out.println("Byte NOT object = " + byteAge);
    }
}
