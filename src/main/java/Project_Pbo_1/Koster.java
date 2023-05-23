package Project_Pbo_1;

public class Koster extends pastoran implements  Tunjangan {
    double gajiPokok , tunjangan = 100000;

    Koster(){}

    public double tunjanganKaryawan() {
        return tunjangan;
    }

    @Override
    public double gajiPokokk() {
        return gajiPokok;
    }

    @Override
    public double gajiTotal() {
        return  tunjanganKaryawan() + gajiPokokk();
    }
}
