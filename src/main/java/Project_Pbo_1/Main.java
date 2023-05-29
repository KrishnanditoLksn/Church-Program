package Project_Pbo_1;

import java.util.Scanner;

public class Main {
    private static final int DIVIDE = 100;
    static Scanner nav = new Scanner(System.in);
    int choice;

    public static void tampilMenuUmat() {
        System.out.println("1 .TAMPILKAN MENU JADWAL MISA ");
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
        System.out.println("Anda Sebagai apa ? ");
        System.out.println("1. Koster");
        System.out.println("2. Sekretaris ");
    }

    public static void tampilJenisMisaUmat() {
        System.out.println("1 . MISA PAGI");
        System.out.println("2 . MISA SIANG ");
        System.out.println("3 . MISA SORE ");
    }

    static void divider() {
        System.out.println("=".repeat(DIVIDE));
    }


    public static void main(String[] args) {
        Orang[] orangs;
        boolean isRunning = false;
        int n, pilih;
        double gajiPokok;
        String nama, nip, alamat, domisili;

        Paroki paroki = new Paroki();
        paroki.setNamaParoki("Paroki Santa Perawan Maria Sragen ");
        paroki.setAlamat("Jl.Pattimura 2 , Sragen , Jawa Tengah ");
        paroki.setEmail("@");
        System.out.println("Orang yang ada di gereja : ");
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

                    if (choice == 2 || choice == 3) {
                        System.out.print("Gaji Pokok : ");
                        gajiPokok = nav.nextDouble();
                    }

                    orangs[i] = new Koster();
                    orangs[i] = new Romo();
                    orangs[i] = new Sekretaris();
                    orangs[i] = new Umat();
                    orangs[i].setNama(nama);
                    orangs[i].setNip(nip);
                    orangs[i].setDomisili(domisili);
                    orangs[i].setAlamat(alamat);

                    switch (choice) {

                        case (1) -> {
                            if (orangs[i] instanceof Umat) {

                            }
                        }
                        case (2) -> {
                            churchEmployeeMenu();
                            int userChoice = nav.nextInt();

                            switch (userChoice) {
                                case (1) -> {
                                    if (orangs[i] instanceof Koster) {
                                        Koster koster;
                                        koster = (Koster) orangs[i];
                                        koster.gajiPokokk();
                                    }
                                }
                                case (2) -> {
                                    if (orangs[i] instanceof Sekretaris) {
                                        Sekretaris sekretaris;
                                        sekretaris = (Sekretaris) orangs[i];
                                        sekretaris.gajiPokokk();
                                    }
                                }
                            }
                        }
                        case (3) -> {
                            if (orangs[i] instanceof Romo) {
                                Romo romo;
                                romo = (Romo) orangs[i];
                                romo.gajiPokokk();
                            }
                        }
                        default -> {
                            System.out.println("Input yang bener cuyyy");

                        }

                    }
                }
            } while (choice < 1 || choice > 3);
        }
    }
}