package Project_Pbo_1;

import java.util.Scanner;

import static Project_Pbo_1.Umat.divider;

public class MainKelolaUangGereja {
    public static void main(String[] args) {
        Paroki paroki = new Paroki();
        paroki.setNamaGereja("Gereja Katolik Santa Perawan Maria di Fatima");
        PemasukanGereja[] pemasukanGerejas;
        pemasukanGerejas = new PemasukanGereja[2];
        Sekretariat_Administrasi_Gereja sekretariatGereja = new Sekretariat_Administrasi_Gereja();
        int pilih, choice;
        Scanner input = new Scanner(System.in);
        boolean isRunning = false;

        do {

            System.out.println("Apakah anda ingin berdonasi  ");
            System.out.println(" 1. YA  ");
            System.out.println(" 2. TIDAK ");
            System.out.print("Pilih : ");
            pilih = input.nextInt();


            if (pilih == 1) {
                do {
                    System.out.println("benar ");
                    System.out.println("1. Donasi Untuk pembangunan Gereja");
                    System.out.println("2. Kolekte gereja");
                    System.out.println("3. Pemasukan Uang Parkir gereja");
                    System.out.print("Pilih : ");
                    choice = input.nextInt();

                    for (int i = 0; i < pemasukanGerejas.length; i++) {
                        if (choice == 1) {

                            System.out.print("Nama : ");
                            String name = input.next();
                            pemasukanGerejas[i] = new PemasukanDonatur();
                            ((PemasukanDonatur) pemasukanGerejas[i]).setNamaDonatur(name);
                            ((PemasukanDonatur) pemasukanGerejas[i]).inputDonasi();
                        } else if (choice == 2) {
                            pemasukanGerejas[i] = new PemasukanTeksMisa();
                            ((PemasukanTeksMisa) pemasukanGerejas[i]).jumlahBeliTeks();
                        } else if (choice == 3) {
                            pemasukanGerejas[i] = new PemasukanUangParkir();
                            ((PemasukanUangParkir) pemasukanGerejas[i]).totalParkir();
                        } else {
                            System.out.println("Invalid Option ");
                        }
                    }
                } while (choice < 1 || choice > 3);
                break;
            } else if (pilih == 2) {
                System.out.println("Terimakasih");
                isRunning = false;
            } else {
                System.out.println("Input 1 - 2 ");
                isRunning = true;
            }
        } while ((isRunning));

        /*
        nambah donasi
         */


        /*
        OUTPUT
         */

        System.out.println("Apakah anda ingin mencetak informasi Daftar Donasi : ? ");
        System.out.println(" 1. YA  ");
        System.out.println(" 2. TIDAK ");
        System.out.print("Pilih : ");
        pilih = input.nextInt();

        sekretariatGereja.setPemasukanGerejas(pemasukanGerejas);
        do {
            if (pilih == 1) {
                do {
                    divider();
                    System.out.println("Informasi Daftar uang pemasukan di " + paroki.getNamaGereja());
                    System.out.println("Ketua Sekretariat  : " + sekretariatGereja.getKetua_Sekretaris());
                    divider();
                    System.out.println(" 1. Cetak Daftar Pemasukan   ");
                    System.out.println(" 2. Cetak Pemasukan Parki  gereja ");
                    System.out.println(" 3. Cari jenis Donasi");
                    System.out.println(" 4. Keluar Program");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();


                    if (pilih == 1) {
                        sekretariatGereja.cetakPemasukanDonatur();
                    } else if (pilih == 2) {
                        sekretariatGereja.cetakPemasukanParkir();
                    } else if (pilih == 3) {
                        System.out.println("Cari jenis donasi ");
                        String c = input.next();
                        sekretariatGereja.cariJenisDonasi(c);
                    } else if (pilih == 4) {
                        System.out.println("Terimakasih, berkah dalem....");
                        System.out.println("Menutup program..");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid");
                        isRunning = false;
                    }
                } while (!(isRunning));
            } else if (pilih == 2) {
                System.out.println("Terimakasih , Berkah dalem .....");
                System.exit(0);
            } else {
                System.out.println("Invalid ");
                isRunning = false;
            }
        } while (!(isRunning));
    }
}