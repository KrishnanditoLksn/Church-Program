package Project_Pbo_1;

import static Project_Pbo_1.Umat.divider;

public class Sekretariat_Gereja extends Paroki {

    PemasukanGereja[] pemasukanGerejas;

    public void setPemasukanGerejas(PemasukanGereja[] pemasukanGerejas) {
        this.pemasukanGerejas = pemasukanGerejas;
    }

    public void cetakPemasukanDonatur() {
        divider();
        System.out.println("DONATOR  " + "\t\t\tNOMINAL DONASI" + "\t\t\tJENIS DONASI");
        divider();
        for (PemasukanGereja pemasukanDonaturs : pemasukanGerejas) {
            if (pemasukanDonaturs instanceof PemasukanDonatur) {
                System.out.println(((PemasukanDonatur) pemasukanDonaturs).getNamaDonatur() + "\t\t\t" + pemasukanDonaturs.getTotalPemasukan() + "\t\t\t" + pemasukanDonaturs.getJenisPemasukan());
            }
            if (pemasukanDonaturs instanceof  PemasukanTeksMisa){
                System.out.println(((PemasukanTeksMisa) pemasukanDonaturs).getJumlahBeliTeks());
            }

        }
    }


}
