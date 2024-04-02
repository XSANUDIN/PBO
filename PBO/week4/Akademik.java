package PBO.week4;
import PBO.week1.Mahasiswa;
import java.util.*;


public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.println("Masukkan Jumlah Data : ");

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        
        String[] nama = new String[n];
        String[] nim = new String[n];
        Double[] ipk = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke- " + (i+1));

            System.out.println("Masukkan NIM : ");
            nim[i] = inp.next();
            System.out.println("Masukkan NAMA : ");
            nama[i] = inp.next();
            System.out.println("Masukkan IPK : ");
            ipk[i] = inp.nextDouble();
            
        }

        Mahasiswa mhs = new Mahasiswa(nim, nama, ipk);
        mahasiswaList.add(mhs);

        for (Mahasiswa mhs1 : mahasiswaList) {
            mhs1.printMhs();
        }

        inp.close();
    }
}
