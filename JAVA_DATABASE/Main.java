package JAVA_DATABASE;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;


        do {
            System.out.println("------------------------------");
            System.out.println("Pilih Menu Data Perpustakaan :");
            System.out.println("1. Tampilkan Data Buku");
            System.out.println("2. Masukkan Data Buku");
            System.out.println("3. Edit Data Buku");
            System.out.println("4. Delete Data Buku");
            System.out.println("5. Keluar");
            System.out.println("------------------------------\n");

            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Db.show();
                    break;
                case 2:
                    System.out.println("Masukkan Id Buku");
                    int id = input.nextInt();
                    System.out.println("Masukkan Judul Buku");
                    String judul = input.next();
                    System.out.println("Masukkan Tahun Terbit Buku");
                    int tahun = input.nextInt();
                    System.out.println("Masukkan Jumlah Stok");
                    int stok = input.nextInt();
                    System.out.println("Masukkan Jumlah Penulis");
                    int penulis = input.nextInt();
                    Db.insert(id, judul, tahun, stok, penulis);
                    break;
                case 3:
                    System.out.println("Masukkan Id Buku");
                    id = input.nextInt();
                    System.out.println("Masukkan Judul Buku");
                    String Ejudul = input.next();
                    System.out.println("Masukkan Tahun Terbit Buku");
                    tahun = input.nextInt();
                    System.out.println("Masukkan Jumlah Stok");
                    stok = input.nextInt();
                    System.out.println("Masukkan Jumlah Penulis");
                    penulis = input.nextInt();

                    Db.edit(id, Ejudul, tahun, stok, penulis);
                    break;
                case 4:
                    System.out.println("Masukkan Id Buku");
                    id = input.nextInt();
                    Db.delete(id);
                    break;
                case 5:
                    System.out.println("Exit Program....");
                    break;
            }
        } while (pilih != 5);
        input.close();
    }


}
