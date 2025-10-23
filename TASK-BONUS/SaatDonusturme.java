public class SaatDonusturme {
    public static void main(String[] args) {

        int toplamSaniye1 = 3665;
        int saat1 = toplamSaniye1 / 3600;
        int dakika1 = (toplamSaniye1 % 3600) / 60;
        int saniye1 = toplamSaniye1 % 60;
        System.out.println("3665 saniye = " + saat1 + ":" + String.format("%02d", dakika1) + ":" + String.format("%02d", saniye1));

        int toplamSaniye2 = 7322;
        int saat2 = toplamSaniye2 / 3600;
        int dakika2 = (toplamSaniye2 % 3600) / 60;
        int saniye2 = toplamSaniye2 % 60;
        System.out.println("7322 saniye = " + saat2 + ":" + String.format("%02d", dakika2) + ":" + String.format("%02d", saniye2));

        int toplamSaniye3 = 59;
        int saat3 = toplamSaniye3 / 3600;
        int dakika3 = (toplamSaniye3 % 3600) / 60;
        int saniye3 = toplamSaniye3 % 60;
        System.out.println("59 saniye = " + saat3 + ":" + String.format("%02d", dakika3) + ":" + String.format("%02d", saniye3));
    }
}
