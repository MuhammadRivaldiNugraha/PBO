package TugasP3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args)
            throws IOException {

        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Masukkan nama: ");
        String nama = input.readLine();

        System.out.println("Halo " + nama);
    }
}
