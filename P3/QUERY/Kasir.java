package TugasP3;

import java.io.*;

public class Kasir {
    public static void main(String[] args) throws IOException {
        DataInputStream input =
            new DataInputStream(System.in);

        System.out.print("Nama Barang: ");
        String nama = input.readLine();

        System.out.print("Total Belanja: ");
        int total = Integer.parseInt(input.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = total * diskon / 100;
        double bayar = total - potongan;

        System.out.print("Uang Pembeli: ");
        int uang = Integer.parseInt(input.readLine());

        double kembalian = uang - bayar;

        System.out.println("\nNama Barang: " + nama);
        System.out.println("Total Belanja: " + total);
        System.out.println("Diskon: " + potongan);
        System.out.println("Total Bayar: " + bayar);
        System.out.println("Kembalian: " + kembalian);

        DataOutputStream output =
            new DataOutputStream(System.out);

        output.writeBytes("Transaksi selesai.\n");
        output.flush();
    }
}
