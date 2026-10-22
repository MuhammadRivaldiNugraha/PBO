package TugasP3;

import java.io.*;

public class BelanjaBuah {
    public static void main(String[] args)
            throws IOException {

        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Harga 1 kg jambu: ");
        double harga = Double.parseDouble(input.readLine());

        System.out.print("Jumlah jambu (kg): ");
        double jumlah = Double.parseDouble(input.readLine());

        double total = harga * jumlah;

        System.out.println("Total belanja: Rp" + total);
    }
}
