public class ParaBozma {
    public static void main(String[] args) {

        int bakiye2 = 135;
        int yuz2 = bakiye2 / 100; bakiye2 %= 100;
        int elli2 = bakiye2 / 50; bakiye2 %= 50;
        int yirmi2 = bakiye2 / 20; bakiye2 %= 20;
        int bes2 = bakiye2 / 5; bakiye2 %= 5;
        int iki2 = bakiye2 / 2; bakiye2 %= 2;
        int bir2 = bakiye2;
        System.out.println("135 TL = " + yuz2 + "x100, " + elli2 + "x50, " + yirmi2 + "x20, " + bes2 + "x5, " + iki2 + "x2, " + bir2 + "x1");

    }
}
