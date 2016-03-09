package tgs;

public class mahasiswa {
   String nim, nama_mahasiswa;
   int jumlahPutaran, jumlah_waktu, hasil;
    
    public mahasiswa (String nim, String nama_mahasiswa, int jumlahPutaran, int jumlah_waktu){
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jumlahPutaran = jumlahPutaran;
        this.jumlah_waktu = jumlah_waktu;
    }
    public String getnim (){
        return nim;
    }
    public String getnama_mahasiswa (){
        return nama_mahasiswa;
    }
   
    public int getjumlahPutaran (){
    return jumlahPutaran;
}

    public int gethitungJarak(lapangan a) {
        return a.getkeliling()*getjumlahPutaran();
    }
    public int getMenang(){
       return hasil;
    }
    void hitungPemenang (lapangan a){
       hasil=gethitungJarak(a)/jumlah_waktu;
    }

}
