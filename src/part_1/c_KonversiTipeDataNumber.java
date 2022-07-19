package part_1;

public class c_KonversiTipeDataNumber {
    public static void main(String[] args) {

        // Widening casting (otomatis)
        // byte -> short -> int -> long -> float -> double
        byte byteNumber = 10;
        short shortNumber = byteNumber;
        int intNumber = shortNumber;
        long longNumber = intNumber;
        float floatNumber = longNumber;
        double doubleNumber = floatNumber;

        System.out.println(byteNumber + " | " + shortNumber + " | " + intNumber + " | " + longNumber + " | " + floatNumber);

        // Narrowing casting (manual)
        // double -> float -> long -> int -> char -> short -> byte
        float floatNumb = (float) doubleNumber;
        long longNumb = (long) floatNumb;
        int intNumb = (int) longNumb;
        short shortNumb = (short) intNumb;

        System.out.println(floatNumb + " | " + longNumb + " | " + intNumb + " | " + shortNumb);

    }
}
