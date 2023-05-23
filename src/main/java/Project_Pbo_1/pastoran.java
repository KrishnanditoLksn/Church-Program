package Project_Pbo_1;

public    class Karyawan implements gaji {
    String nama , nip , Alamat,Domisili;

     String getNama(){
        return  nama;
    }

     void setNama(String nama ){
        this.nama = nama;
    }

     String getDomisili() {
        return Domisili;
    }

     void setDomisili(String domisili) {
        Domisili = domisili;
    }

     String getAlamat() {
        return Alamat;
    }

     void setAlamat(String alamat) {
        Alamat = alamat;
    }

     String getNip() {
        return nip;
    }

     void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public double gajiPokokk() {
        return 0;
    }

    @Override
    public double gajiTotal() {
        return 0;
    }
}
