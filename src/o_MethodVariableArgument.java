public class o_MethodVariableArgument {
    static void sayCongrats(String name, int... values) { // variable argument
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak Lulus");
        }
    }

    public static void main(String[] args) {
        // contoh 1
        int[] nilai = {77, 72, 70, 60, 65};
        sayCongrats("Joko", nilai);

        // contoh 2
        sayCongrats("Budi", 90, 80, 70);
    }
}
