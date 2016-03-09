package tgs;

public class mahasiswa {
   String nim, nama_mahasiswa;
   int jumlahPutaran, jumlah_waktu;
    
    public mahasiswa (String nim, String nama_mahasiswa, int jumlahPutaran, int jumlah_waktu){
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jumlahPutaran = jumlahPutaran;
        this.jumlah_waktu = jumlah_waktu;
    }
    public String getnim (String nim){
        return nim;
    }
    public String getnama_mahasiswa (String nama_mahasiswa){
        return nama_mahasiswa;
    }
   
    public int getjumlah_waktu (){
      return jumlah_waktu;
  }
    public int getjumlahPutaran (){
    return jumlahPutaran;
}

    public int gethitungJarak(lapangan a) {
        return a.getkeliling()*getjumlahPutaran();
    }

}