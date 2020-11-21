/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan51.gajikaryawan;
import java.util.Scanner;

/**
 *
 * @author Rheiza
 * Nama     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061
 * Deskripsi Program : Program ini dibuat untuk menentukan gaji 
 */
public class PBOIF210119061Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        String nik,nama,jabatan;
        int golongan,kehadiran;
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        
        System.out.print("Masukkan NIK : ");
        nik = scanner.nextLine();
        manager.setNik(nik);
        System.out.print("Masukkan Nama : ");
        nama = scanner.nextLine();
        manager.setNama(nama);
        System.out.print("Masukkan Golongan (1/2/3) : ");
        golongan = scanner.nextInt();
        manager.setGolongan(golongan);
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        jabatan = scanner.next();
        manager.setJabatan(jabatan);
        System.out.print("Masukkan Jumlah Kehadiran : ");
        kehadiran = scanner.nextInt();
        manager.setKehadiran(kehadiran);
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + manager.getNik());
        System.out.println("NAMA\t\t: " + manager.getNama());
        System.out.println("GOLONGAN\t: " + manager.getGolongan());
        System.out.println("JABATAN\t\t: " + manager.getJabatan());
        System.out.println();
        System.out.println("Tunjangan Golongan\t : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Tunjangan Jabatan\t : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran\t : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println();
        System.out.println("Gaji Total : " + manager.gajiTotal());
       
    }
    
}
