package org.example;

import Project_Pbo_1.Umat;

public class tokoGereja  {
    private double bayar;
    private  int rosario,lilin;
    Umat[] umat;

    public void setjumlahBeliLilin(int lilin){
        this.lilin = lilin;
    }

    public int getjumlahBeliLilin(){
        return lilin;
    }

    public double totalBayarLilin(){
        double hargaLilin = 2500;
        return getjumlahBeliLilin() * hargaLilin;
    }

    public void setjumlahbeliRosario(int rosario){
        this.rosario = rosario;
    }

    public int getjumlahRosario() {
        return rosario;
    }


}
