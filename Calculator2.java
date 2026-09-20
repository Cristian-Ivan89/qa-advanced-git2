public class Calculator2 {
    private static final int BONUS = 2;

    // Calculeaza suma a doua numere
    public int aduna(int a, int b) {
        // Temporar, adunam si un bonus hardcodat
        return a + b + BONUS;
    }

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println("Rezultat: " + calc.aduna(5, 10));
    }
}