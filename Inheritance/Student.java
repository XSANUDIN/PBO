package PBO.Inheritance;

import PBO.Inheritance.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    String nim;
    double spp;
    double sks;
    double modul;

    public Student(String address, String name, String hobi, String nim){
        super(address, name, hobi);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    @Override
    public void identitas(){
        System.out.println("NIM : " + getNim());
        super.identitas();
    }

    public double hitungPembayaran(){
        return this.spp + (this.sks * 250000) + this.modul;
    }


    public void inputPembayaran(){
            Scanner input = new Scanner(System.in);

            System.out.println("\nInput jumlah SPP : ");
            spp = input.nextDouble();
            System.out.println("Input jumlah SKS : ");
            sks = input.nextDouble();
            System.out.println("Input jumlah Modul : ");
            modul = input.nextDouble();

            double totalPembayaran = hitungPembayaran();
    }


    public static List<Student> inputMahasiswa(){

        Scanner input = new Scanner(System.in);
        List<Student> mahasiswa = new ArrayList<>();

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int n = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i < n ; i++){
            System.out.println("\nMasukkan Data Mahasiswa : " + (i+1));
            System.out.println("Nama : ");
            String name = input.nextLine();
            System.out.println("Nim : ");
            String nim = input.nextLine();
            System.out.println("Alamat : ");
            String addres = input.nextLine();
            System.out.println("Hobi : ");
            String hobi = input.nextLine();

            Student mhs = new Student(addres, name, hobi, nim);
            mahasiswa.add(mhs);
            mhs.inputPembayaran();
        }
        return mahasiswa;
    }

    public void printStudent(List<Student> mahasiswa){
        System.out.println("\n----------Detail Mahasiswa----------\n");
        double totalBayar = 0;

        
        for(int i = 0 ; i < mahasiswa.size() ; i++){
            System.out.println("Mahasiswa " + (i+1) + "\n");
            mahasiswa.get(i).identitas();
            double bayarK = mahasiswa.get(i).hitungPembayaran();
            System.out.println("Total Pembayaran : " + bayarK);
            System.out.println("____________________________________\n");
        }
        
    }
}
