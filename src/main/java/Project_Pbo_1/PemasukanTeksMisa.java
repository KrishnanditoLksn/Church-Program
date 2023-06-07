package Project_Pbo_1;

import java.util.Scanner;

public class PemasukanTeksMisa extends  PemasukanGereja {
    Scanner robot = new Scanner(System.in);
    private int nominal;

    public String getPenangggugJawab() {
        return penangggugJawab;
    }

    public void setPenangggugJawab(String penangggugJawab) {
        this.penangggugJawab = penangggugJawab;
    }

    public String getNamaLinkungan() {
        return namaLinkungan;
    }

    public void setNamaLinkungan(String namaLinkungan) {
        this.namaLinkungan = namaLinkungan;
    }

    private  String namaLinkungan , penangggugJawab;
    int jumlahBeliTeks;
    double total;

    public void jumlahBeliTeksMisa(){
        double hargaTeksMisa  = 2000;

        if (jumlahBeliTeks <  0 ){
            System.out.println("Invalid ");
        }
        else{
             total = jumlahBeliTeks * hargaTeksMisa;
        }
    }

    public void inputKolekte(){
        System.out.println("Nominal Kolekte ");
        nominal   = robot.nextInt();
    }


    @Override
    public int getTotalPemasukan(){
        return nominal;
    }

    @Override
    public String getJenisPemasukan(){
        return "Teks Misa";
    }
}
