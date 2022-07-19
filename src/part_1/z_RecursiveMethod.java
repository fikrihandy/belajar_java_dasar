package part_1;

public class z_RecursiveMethod {
    static int factorialRecrusive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecrusive(value - 1);
        }
    }

    // saat terlalu dalam bisa terjadi stack overflow!

    public static void main(String[] args) {
        var factorialRecursive = factorialRecrusive(5);
        System.out.println(factorialRecursive);
    }
}
