package Project_Pbo_1;

public class Sekretaris extends pastoran implements  Tunjangan {
    double gajiPokok , tunjangan = 150000;
    Sekretaris(){};

    @Override
    public double gajiPokokk() {
        return gajiPokok;
    }

    @Override
    public double gajiTotal() {
        return tunjanganKaryawan() + gajiPokokk();
    }

    public  double tunjanganKaryawan() {
        return tunjangan;
    }
}
