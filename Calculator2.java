public class Calculator2 {
    // Calculeaza suma a doua numere
    public int aduna(int a, int b) {
        // Temporar, adunam si un bonus hardcodat
        int bonus = 2;
        return a + b + bonus;
    }

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println("Rezultat: " + calc.aduna(5, 10));
    }
}