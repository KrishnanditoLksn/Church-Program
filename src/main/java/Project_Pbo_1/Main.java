package Project_Pbo_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int DIVIDE = 100;
    static Scanner nav = new Scanner(System.in);

    public static void tampilMenuUangGereja() {
        System.out.println("1.Donasi Gereja");
        System.out.println("2.Persembahan Gereja ");
        System.out.println("3.Penjualana teks misa ");
        System.out.println("4.Penjualan  uang parkir ");
    }


    public static void userMenuAwal() {
        System.out.println("Anda sebagai apa ? : ");
        System.out.println("1. Umat ");
        System.out.println("2. Karyawan ");
        System.out.println("3. Romos");
    }

    public static void userTunjanganMenu() {
        System.out.println("1. BELUM MENIKAH  ");
        System.out.println("2 .MENIKAH ");
    }

    public static void churchEmployeeMenu() {
        System.out.println("Jika karyawan gereja , anda sebagai apa  ? ");
        System.out.println("1. Koster");
        System.out.println("2. Sekretaris ");
    }

    static void divider() {
        System.out.println("=".repeat(DIVIDE));
    }

    public static void main(String[] args) {
        double gapok;
        Orang[] orangs;
        boolean isRunning = false;
        int n, tunjanganAnak, jumlahAnak, na;
        String nama, nip, alamat, domisili;
        Umat umat;
        Paroki paroki = new Paroki();
        paroki.setNamaParoki("Paroki  Sragen ");
        paroki.setAlamat("Jl.Pattimura 2 , Sragen , Jawa Tengah ");
        paroki.setEmail("@");
        paroki.setNamaGereja("Santa Maria Perawan di Fatima  ");


        do {
            divider();
            System.out.println("SELAMAT DATANG DI PROGRAM GEREJA ");
            System.out.println("1.DATA ORANG GEREJA");
            System.out.println("2.DATA PEMASUKAN GEREJA");
            divider();
            na = nav.nextInt();
            if (na == 1) {
                System.out.print("Orang yang ada di gereja : ");
                n = nav.nextInt();
                orangs = new Orang[n];
                for (int i = 0; i < orangs.length; i++) {
                    int choice;
                    do {
                        userMenuAwal();
                        choice = nav.nextInt();

                        if (choice >= 1 && choice <= 3) {
                            System.out.print("Nama : ");
                            nama = nav.next();
                            nama += nav.nextLine();

                            System.out.print("NIP : ");
                            nip = nav.next();

                            System.out.print("Alamat : ");
                            alamat = nav.next();
                            alamat += nav.nextLine();

                            System.out.print("Domisili : ");
                            domisili = nav.next();

                            switch (choice) {

                                case (1) -> {
                                    String pilihan;
                                    orangs[i] = new Umat();
                                    orangs[i].setNama(nama);
                                    orangs[i].setNip(nip);
                                    orangs[i].setDomisili(domisili);
                                    orangs[i].setAlamat(alamat);
                                    do {
                                        ((Umat) orangs[i]).tampilJenisMisaUmat();
                                        System.out.print("Pilih waktu : ");
                                        pilihan = nav.next();
                                        n = Integer.parseInt(pilihan);

                                        if (pilihan.equalsIgnoreCase("1") || pilihan.equalsIgnoreCase("sabtu")) {
                                            System.out.println("HARI SABTU  JAM 16.30-17.30");
                                        } else if (pilihan.equalsIgnoreCase("2") || pilihan.equalsIgnoreCase(" minggu")) {
                                            System.out.println("HARI MINGGU JAM 07.30-08.30");
                                            System.out.println("HARI MINGGU JAM 09.00-10.30");
                                            System.out.println("HARI MINGGU JAM 16.30-17.30");
                                        } else {
                                            System.out.println("yang bener");
                                        }
                                    } while (n > 2 || n < 1 || pilihan.equalsIgnoreCase("sabtu"));
                                }

                                case (2) -> {

                                    churchEmployeeMenu();
                                    int userChoice = nav.nextInt();
                                    System.out.print("Gaji Pokok : ");
                                    gapok = nav.nextDouble();

                                    System.out.print("Jumlah Anak : ");
                                    jumlahAnak = nav.nextInt();

                                    switch (userChoice) {
                                        case (1) -> {
                                            orangs[i] = new Koster();
                                            ((Koster) orangs[i]).setGajiPokok(gapok);
                                            ((Koster) orangs[i]).setJumlahAnak(jumlahAnak);
                                            orangs[i].setNama(nama);
                                            orangs[i].setNip(nip);
                                            orangs[i].setDomisili(domisili);
                                        }
                                        case (2) -> {
                                            orangs[i] = new Sekretaris();
                                            ((Sekretaris) orangs[i]).setGajiPokok(gapok);
                                            ((Sekretaris) orangs[i]).setJumlahAnak(jumlahAnak);
                                            orangs[i].setNama(nama);
                                            orangs[i].setNip(nip);
                                            orangs[i].setDomisili(domisili);
                                        }
                                    }
                                }
                                case (3) -> {
                                    orangs[i] = new Romo();
                                    ((Romo) orangs[i]).jumlahMisa();
                                    ((Romo) orangs[i]).gajiPokokk();
                                }
                                default -> {
                                    System.out.println("Input yang bener cuyyy");

                                }
                            }
                        }
                    } while (choice < 1 || choice > 3);
                }
                /*
        Program sederhana untuk pengolahan uang di sebuah gereja
         */
            } else if (na == 2) {
                int pilih, choice;
                PemasukanGereja[] pemasukanGerejas;
                do{
                System.out.println("1. BERI DONASI UNTUK GEREJA");
                System.out.println("2. BERI TEKS MISA ");;
                pilih = nav.nextInt();

                pemasukanGerejas = new PemasukanGereja[1];

                for (int i = 0; i < pemasukanGerejas.length; i++) {
                    if (pilih == 1) {
                        PemasukanDonatur pemasukanDonatur;

                        System.out.println("Nama : ");
                        String name = nav.next();

                        pemasukanGerejas[i] = new PemasukanDonatur();

                        ((PemasukanDonatur) pemasukanGerejas[i]).setNamaDonatur(name);
                        ((PemasukanDonatur) pemasukanGerejas[i]).inputDonasi();

                    } else if (pilih == 2) {
                        pemasukanGerejas[i] = new PemasukanTeksMisa();
                        ((PemasukanTeksMisa) pemasukanGerejas[i]).jumlahBeliTeks();
                    }
                    else if(pilih == 3){
                        pemasukanGerejas[i] = new PemasukanUangParkir();

                    }
                }
            }while (pilih < 1 || pilih > 3);
                System.out.println("Apakah ingin berdonasi lagi : ? ");
                System.out.println("1. YA");
                System.out.println("2 .TIDAK ");
                int donate = nav.nextInt();
                String donates = String.valueOf(donate);

                Sekretariat_Gereja sekretariatGereja = new Sekretariat_Gereja();
                sekretariatGereja.setPemasukanGerejas(pemasukanGerejas);
                if (donates.equalsIgnoreCase("1")){
                    sekretariatGereja.cetakPemasukanDonatur();
                }
                /*do {
                    System.out.println("Apakah anda ingin membantu keuangan gereja " + paroki.getNamaParoki());
                    System.out.println("1. Ya");
                    System.out.println("2. Mungkin Lain waktu ");
                    choice = nav.nextInt();

                    if (choice == 1) {
                        divider();
                        System.out.println("Selamat datang  PROGRAM DONASI SEDERHANA DI GEREJA" + paroki.getNamaGereja());
                        divider();
                        do {
                            System.out.println("1. Donasi ke gereja ");
                            System.out.println("2. Persembahan di Gereja");
                            System.out.println("3. Teks misa ");
                            System.out.println("4. CETAK ");
                            pilih = nav.nextInt();

                            if (pilih == 1) {
                                pemasukanGerejas = new PemasukanDonatur[1];
                                for (PemasukanGereja pemasukanGereja : pemasukanGerejas) {
                                    System.out.print("Nama  :  ");
                                    String name = nav.next();
                                    pemasukanGereja = new PemasukanDonatur();
                                    ((PemasukanDonatur) pemasukanGereja).inputDonasi();
                                    ((PemasukanDonatur) pemasukanGereja).setNamaDonatur(name);
                                }
                                System.out.println("Apakah anda ingin berdonasi  lagi :");
                                int pilihan = nav.nextInt();

                                if (pilihan == 1) {
                                    System.out.println("Berapa kali : ");
                                    int kali = nav.nextInt();
                                    pemasukanGerejas = Arrays.copyOf(pemasukanGerejas, pemasukanGerejas.length + kali -1);

                                    for (PemasukanGereja pemasukanGereja : pemasukanGerejas) {
                                        pemasukanGereja = new PemasukanDonatur();
                                        ((PemasukanDonatur) pemasukanGereja).inputDonasi();
                                    }
                                } else {
                                    System.out.println("Terima Kasih");
                                    System.exit(0);
                                }
                            } else if (pilih ==2 ) {

                            } else if (pilih ==3) {

                            } else if (pilih == 4) {
                                for(PemasukanGereja pemasukanGereja : pemasukanGerejas){
                                    pemasukanGereja.getTotalPemasukan();
                                }
                            }
                            else {
                                System.out.println("Invalid");
                            }


                        } while (pilih < 1 || pilih > 3);


                    } else if (choice == 2) {

                    } else {
                        System.out.println("Invalid");
                    }


                } while (choice < 1 || choice > 2);*/
            }
        } while (na < 1 || na > 2);
    }
}








 /*for (int i = 0; i < pemasukanGerejas.length; i++) {
                        int pilih;
                        do {
                            tampilMenuUangGereja();
                            pilih = nav.nextInt();

                            if (pilih == 1) {
                                PemasukanDonatur pemasukanDonatur;
                                System.out.print("Nama : ");
                                String name = nav.next();
                                pemasukanGerejas[i] = new PemasukanDonatur();
                                pemasukanDonatur = (PemasukanDonatur) pemasukanGerejas[i];
                                pemasukanDonatur.setNamaDonatur(name);
                                pemasukanDonatur.inputDonasi();

                            } else if (pilih == 2) {
                                pemasukanGerejas[i] = new PemasukanGereja();

                            } else if (pilih == 3) {
                                pemasukanGerejas[i] = new PemasukanTeksMisa();
                            } else {
                                System.out.println("Invalid Option");
                            }
                        } while (pilih < 1 || pilih > 3);
                    }
                } else if (choice == 3) {
                    divider();
                    System.out.println("INFORMASI KEUANGAN GEREJA" + paroki.getNamaParoki());
                    divider();
                }
            } else {
                System.out.println("Input 1 - 3 ");
            }
        } while (na < 1 || na > 2);*/