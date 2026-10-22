
package TugasP3;

import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah novel: ");
        int novel = input.nextInt();

        System.out.print("Jumlah halaman per novel: ");
        int halaman = input.nextInt();

        int totalLembar = novel * halaman;
        int detik = totalLembar;

        int hari = detik / 86400;
        detik = detik % 86400;

        int jam = detik / 3600;
        detik = detik % 3600;

        int menit = detik / 60;
        detik = detik % 60;

        System.out.println("\nTotal lembar: " + totalLembar);
        System.out.println("Waktu pencetakan:");
        System.out.println(hari + " hari");
        System.out.println(jam + " jam");
        System.out.println(menit + " menit");
        System.out.println(detik + " detik");

        System.out.println("\nLembar per novel: "
                + halaman);
    }
}
