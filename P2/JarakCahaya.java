public class JarakCahaya {
    public static void main(String[] args) {
        double jarakBulan = 384400;
        double jarakMatahari = 152100000;
        double kecepatan = 300000;
        
        double waktuBulan = jarakBulan / kecepatan;
        double waktuMatahari = jarakMatahari / kecepatan;

        System.out.println("Waktu ke bulan = " + waktuBulan + " detik");
        System.out.println("Waktu ke matahari = " + waktuMatahari + " detik");
    }
}
