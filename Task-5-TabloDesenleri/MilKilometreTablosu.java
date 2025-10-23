public class MilKilometreTablosu {
        public static void main(String[] args) {
            double oran = 1.609;
            //burda tam sayı olmadığı için doubleyle oranı belirtiyoruz printlerken çarpması kolay olsun diye.
            System.out.println("------ Mil | Kilometre Dönüşüm Tablosu ------");
            System.out.println("       Mil | Kilometre");

            System.out.println("   -----------------------");

            System.out.println("       1   | " + (1 * oran));
            System.out.println("       5   | " + (5 * oran));
            System.out.println("       10  | " + (10 * oran));
            System.out.println("       20  | " + (20 * oran));
            System.out.println("       50  | " + (50 * oran));
        }
}

