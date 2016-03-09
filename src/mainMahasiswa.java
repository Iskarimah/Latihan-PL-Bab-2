package tgs;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner input= new Scanner (System.in);
        int jumlah_mahasiswa = in.nextInt();
        mahasiswa [] mhs = new mahasiswa [jumlah_mahasiswa];  
        int p = in.nextInt();
        int l = in.nextInt();
        lapangan  lp = new lapangan (p,l);
       
        for ( int i=0; i<jumlah_mahasiswa;i++){
            String nim =input.nextLine();
            String nama_mahasiswa = input.nextLine();
            int jumlahPutaran = in.nextInt();
            int jumlah_waktu = in.nextInt();
            mhs [i]= new mahasiswa (nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);
            System.out.println("");
        }
        for (int i=0;i<jumlah_mahasiswa;i++){
            System.out.println(mhs[i].nim+", "+mhs[i].nama_mahasiswa+", "+mhs[i].jumlahPutaran+", "+mhs[i].jumlah_waktu);
            
        }
           System.out.println("");
          for (int i=0;i<jumlah_mahasiswa;i++){
        System.out.println(mhs[i].nama_mahasiswa+" "+mhs[i].gethitungJarak(lp));
        }
         
    }

    
    
}
