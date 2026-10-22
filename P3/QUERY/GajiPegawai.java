package TugasP3;

import java.util.Scanner;

public class GajiPegawai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pegawai: ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok: ");
        double gaji = input.nextDouble();

        System.out.print("Tunjangan Jabatan: ");
        double jabatan = input.nextDouble();

        System.out.print("Tunjangan Istri: ");
        double istri = input.nextDouble();

        System.out.print("Tunjangan Anak: ");
        double anak = input.nextDouble();

        double totalGaji = gaji + jabatan + istri + anak;
        double pajak = totalGaji * 10 / 100;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\nNama: " + nama);
        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
