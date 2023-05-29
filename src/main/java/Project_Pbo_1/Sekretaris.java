package Project_Pbo_1;

public class Sekretaris extends Karyawan implements Tunjangan {
    private double gajiPokok;
    private int jumlahAnak;

    Sekretaris() {
    }

    @Override
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double gajiPokokk() {
        return gajiPokok;
    }

    @Override
    public double gajiTotal() {
        return  gajiPokokk() * tunjanganKaryawan();
    }

    @Override
    public double tunjanganKaryawan() {
        return 150000;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }


    @Override
    public double tunjanganAnak() {
        return tunjanganKaryawan() * getJumlahAnak();
    }

    @Override
    public String jabatan() {
        return "Sekretaris";
    }
}
