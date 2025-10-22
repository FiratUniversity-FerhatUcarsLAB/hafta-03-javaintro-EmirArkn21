public class UcgenAlanHesap {
    public static void main(String[] args) {
        // kenarlar
        double a = 3;
        double b = 4;
        double c = 5;
        // s yarı çevre (herondan geliyor)
        double s = (a + b + c) / 2;

        // Alan hesabı heronla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Üçgenin alanı = " + alan);
    }
}
