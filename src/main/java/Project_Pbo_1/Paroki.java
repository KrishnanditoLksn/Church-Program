package Project_Pbo_1;

public class Paroki {
    private String namaParoki , alamat , email;
    Umat []daftarUmat;

    Paroki(){}
    Paroki(String namaParoki  , String alamat , String emai , Umat [] daftarUmat){
        this.namaParoki = namaParoki;
        this.daftarUmat  = daftarUmat;
        this.email = emai;
        this.alamat = alamat;
    }

    public Umat[] getDaftarUmat() {
        return daftarUmat;
    }

    public void setDaftarUmat(Umat[] daftarUmat) {
        this.daftarUmat = daftarUmat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaParoki() {
        return namaParoki;
    }

    public void setNamaParoki(String namaParoki) {
        this.namaParoki = namaParoki;
    }
}
