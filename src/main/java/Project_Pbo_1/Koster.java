package Project_Pbo_1;

public class Koster extends Karyawan implements Tunjangan {
    private double gajiPokok;
    private int jumlahAnak;

    Koster() {
    }

    @Override
    public double tunjanganKaryawan() {
        return 100000;
    }

    @Override
    public double tunjanganAnak() {
        return tunjanganKaryawan() * getJumlahAnak();
    }

    @Override
    public String jabatan() {
        return "Koster";
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
        return  gajiPokok * tunjanganKaryawan();
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

}
