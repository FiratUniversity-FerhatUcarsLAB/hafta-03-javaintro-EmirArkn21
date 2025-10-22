public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = 3.14159;
        //burda r ve pi yi belirledik virgüllü olduğu için double kullandık.
        double alan = pi * r * r ;
        //buralarda hesabı yaptırdık alan ve cevre tanımlayarak.
        double cevre = 2 * pi * r ;

        System.out.println(" Yarıçap : " + r);
        System.out.println(" Alan : " + alan);
        System.out.println(" Çevre : " + cevre);
    }
}
