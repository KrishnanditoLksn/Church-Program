package Project_Pbo_1;

import static Project_Pbo_1.Main.divider;

public class Sekretariat_Administrasi_Gereja extends Paroki {

    /*
    ini mau dipindah ke kelas Paroki buat nyetak daftar sama totalnya
     */

    PemasukanGereja[] pemasukanGerejas;


    public void setPemasukanGerejas(PemasukanGereja[] pemasukanGerejas) {
        this.pemasukanGerejas = pemasukanGerejas;
    }

    public String getKetuaSekretaris() {
        return "Bernardus Adri Yuliantoro";
    }

    public void cetakPemasukanGereja() {
        int total = 0;
        divider();
        System.out.println(" Jenis Pemasukan " + "\t\t\t" + "Nominal Pemasukan");
        divider();
        for (PemasukanGereja pemasukanGereja : pemasukanGerejas) {
            if (pemasukanGereja != null) {
                System.out.println((pemasukanGereja.getJenisPemasukan() + "\t\t\t\t" + pemasukanGereja.getTotalPemasukan()));
                total += pemasukanGereja.getTotalPemasukan();
            }
        }System.out.println("Total dari semua pemasukan yaitu " + total);
    }


    /*public void cetakPemasukanParkir() {
        System.out.println("Nama Lingkungan " + "\t\t\t" + "Total Pemasukan Parkir "  + "\t\t\t" + "Jenis Pemasukan");
        for (PemasukanGereja pemasukanGereja : pemasukanGerejas) {
            if (pemasukanGereja != null) {
                if (pemasukanGereja instanceof PemasukanUangParkir) {
                    System.out.println(((PemasukanUangParkir) pemasukanGereja).getNamaLinkungan() +"\t\t\t" + pemasukanGereja.getTotalPemasukan() + "\t\t\t" + pemasukanGereja.getJenisPemasukan());
                }
            }
        }
    }*/
}
