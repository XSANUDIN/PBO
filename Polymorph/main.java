package Polymorph;

import java.util.*;

public class main {
    public static void main(String[] Bangun) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        
        do{
            System.out.println("-------------Pilih Menu-------------");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi");
            System.out.println("4. Persegi Panjang");
            System.out.println("5. Exit");
            System.out.println("------------------------------------");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    hitungSegitiga();
                    break;
                case 2:
                    hitungLingkaran();
                    break;
                case 3:
                    hitungPersegi();
                    break;
                case 4:
                    hitungPersegiPanjang();
                    break;
                case 5:
                    System.out.println("Exit...");
                break;

                default:
                System.out.println("Pilih menu yang ada, :)");
                    break;
            }
            System.out.println();
        } while (pilih != 5);

        input.close();
    }
    
    private static void hitungSegitiga(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Sisi A :");
        int sisiA = input.nextInt();
        System.out.println("Masukkan Sisi B :");
        int sisiB = input.nextInt();
        System.out.println("Masukkan Sisi C :");
        int sisiC = input.nextInt();

        segitiga s = new segitiga(sisiA, sisiB, sisiC);
        s.displayHasil();
    }

    private static void hitungLingkaran(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Alas");
        int radius = input.nextInt();

        lingkaran l = new lingkaran(radius);
        l.displayHasil();
    }

    private static void hitungPersegi(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Alas");
        int sisi = input.nextInt();

        persegi p = new persegi(sisi);
        p.displayHasil();
    }

    private static void hitungPersegiPanjang(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Panjang");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar");
        int lebar = input.nextInt();

        persegiPanjang pp = new persegiPanjang(panjang, lebar);
        pp.displayHasil();
    }
}
