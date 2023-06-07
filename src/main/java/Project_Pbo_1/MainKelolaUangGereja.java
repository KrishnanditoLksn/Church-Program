package Project_Pbo_1;

import java.util.Arrays;
import java.util.Scanner;

import static Project_Pbo_1.Main.divider;

public class MainKelolaUangGereja {
    public static void main(String[] args) {
        Paroki paroki = new Paroki();
        paroki.setNamaGereja("Gereja Katolik Santa Perawan Maria di Fatima");
        PemasukanGereja[] pemasukanGerejas;
        pemasukanGerejas = new PemasukanGereja[0];
        Sekretariat_Administrasi_Gereja sekretariatGereja = new Sekretariat_Administrasi_Gereja();
        int pilih, choice;
        Scanner input = new Scanner(System.in);
        boolean isRunning;


        do {
            PemasukanGereja[] tampung;
            tampung = Arrays.copyOf(pemasukanGerejas, pemasukanGerejas.length + 1);


            System.out.println("1. Donasi Untuk pembangunan Gereja");
            System.out.println("2. Kolekte gereja");
            System.out.println("3. Pemasukan Uang Parkir gereja");
            System.out.print("Pilih : ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Nama : ");
                String name = input.next();
                tampung[pemasukanGerejas.length] = new PemasukanDonatur();
                ((PemasukanDonatur) tampung[pemasukanGerejas.length]).setNamaDonatur(name);
                ((PemasukanDonatur) tampung[pemasukanGerejas.length]).inputDonasi();
            } else if (choice == 2) {
                System.out.println("Nama Lingkungan : ");
                String name = input.next();

                System.out.println("Penanggung Jawab : ");
                String pj = input.next();
                tampung[pemasukanGerejas.length] = new PemasukanTeksMisa();
                ((PemasukanTeksMisa) tampung[pemasukanGerejas.length]).inputKolekte();
                ((PemasukanTeksMisa) tampung[pemasukanGerejas.length]).setNamaLinkungan(name);
                ((PemasukanTeksMisa) tampung[pemasukanGerejas.length]).setPenangggugJawab(pj);
            } else if (choice == 3) {
                System.out.println("Nama Lingkungan : ");
                String name = input.next();
                tampung[pemasukanGerejas.length] = new PemasukanUangParkir();
                ((PemasukanUangParkir) tampung[pemasukanGerejas.length]).setNamaLinkungan(name);
                ((PemasukanUangParkir) tampung[pemasukanGerejas.length]).totalParkir();
            } else {
                System.out.println("Invalid");
            }
            pemasukanGerejas = tampung;
            sekretariatGereja.setPemasukanGerejas(pemasukanGerejas);
            System.out.println("mau memasukan data lagi : ");
            String cek = input.next();

            isRunning = cek.equalsIgnoreCase("ya");
        } while (choice < 1 || choice > 3 || isRunning);


        divider();
        System.out.println("Informasi Daftar uang pemasukan di " + paroki.getNamaGereja());
        System.out.println("Ketua Sekretariat  : " + sekretariatGereja.getKetuaSekretaris());
        divider();
        do {
            System.out.println(" 1. Cetak Daftar Pemasukan   ");
            System.out.println(" 2. Keluar ");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                sekretariatGereja.cetakPemasukanGereja();
            } else if (pilih == 2) {
                System.out.println("Terimakasih , Berkah Dalem....");
                System.exit(0);
            } else {
                System.out.println("Invalid");
            }
        } while (true);
    }
}