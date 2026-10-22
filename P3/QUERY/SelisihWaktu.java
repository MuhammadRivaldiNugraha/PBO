
package TugasP3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam pertama: ");
        int jam1 = input.nextInt();

        System.out.print("Menit pertama: ");
        int menit1 = input.nextInt();

        System.out.print("Detik pertama: ");
        int detik1 = input.nextInt();

        System.out.print("Jam kedua: ");
        int jam2 = input.nextInt();

        System.out.print("Menit kedua: ");
        int menit2 = input.nextInt();

        System.out.print("Detik kedua: ");
        int detik2 = input.nextInt();

        int waktu1 = jam1 * 3600 + menit1 * 60 + detik1;
        int waktu2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(waktu2 - waktu1);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println("Selisih waktu: "
                + jam + " jam "
                + menit + " menit "
                + detik + " detik");
    }
}
