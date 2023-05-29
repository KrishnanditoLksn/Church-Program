package Project_Pbo_1;

import java.util.Scanner;

public class Romo extends Karyawan {
    private double gajiPokok;

    public void jumlahMisa(Scanner scann){

    }

    public double getStipendium(){
        return 50000;
    }


    @Override
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double gajiPokokk() {
        return gajiPokok;
    }

    @Override
    public double gajiTotal() {
        return  gajiPokokk();
    }

}
