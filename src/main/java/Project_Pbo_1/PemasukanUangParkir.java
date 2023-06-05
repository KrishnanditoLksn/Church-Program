package Project_Pbo_1;

import java.util.Scanner;

public class PemasukanUangParkir extends PemasukanGereja {
    private  int  total;
    private String namaLinkungan;

    public double totalParkir() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Uang total parkir  : ");
        total  = input.nextInt();
        return total;
    }

    public String getNamaLinkungan(){
        return  namaLinkungan;
    }

    public void setNamaLinkungan(String namaLinkungan){
        this.namaLinkungan = namaLinkungan;
    }

    @Override
    public String getJenisPemasukan() {
        return "Parkir";
    }

    @Override
    public int getTotalPemasukan() {
        return total;
    }
}
