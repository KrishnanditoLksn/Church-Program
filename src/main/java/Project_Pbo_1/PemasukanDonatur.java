package Project_Pbo_1;

import java.util.Scanner;

public class PemasukanDonatur extends PemasukanGereja {
    private String namaDonatur;
    private int nominalDonasi;

    PemasukanDonatur(){

    }

    String getNamaDonatur() {
        return namaDonatur;
    }

    void setNamaDonatur(String namaDonatur) {
        this.namaDonatur = namaDonatur;
    }

    void inputDonasi() {
        Scanner robot = new Scanner(System.in);
        System.out.print("Nominal donasi gereja : ");
        nominalDonasi = robot.nextInt();
    }

    @Override
    protected  int getTotalPemasukan(){
        return  nominalDonasi;
    }

    @Override
    protected  String getJenisPemasukan(){
        return  "Pemasukan Donatur gereja";
    }

}
