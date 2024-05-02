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
    double totalP;

    public Student(String address, String name, String hobi, String nim){
        super(address, name, hobi);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public double getTotalP(){
        return totalP;
    }

    public void bayar(double totalP){
        this.totalP = totalP;
    }

    @Override
    public void identitas(){
        System.out.println("NIM : " + getNim());
        super.identitas();
    }

    public double hitungPembayaran(){
        return spp + (sks * 250000) + modul;
    }

    public void inputPembayaran(List<Student> mahasiswa){
        for (Student student : mahasiswa){
            Scanner input = new Scanner(System.in);

            System.out.println("Input jumlah SPP : ");
            spp = input.nextDouble();
            System.out.println("Input jumlah SKS : ");
            sks = input.nextDouble();
            System.out.println("Input jumlah Modul : ");
            modul = input.nextDouble();

            totalP = hitungPembayaran();
            student.bayar(totalP);
        }
    }


    public static List<Student> inputMahasiswa(){

        Scanner input = new Scanner(System.in);
        List<Student> mahasiswa = new ArrayList<>();

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int n = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i < n ; i++){
            System.out.println("Masukkan Data Mahasiswa : " + (i+1));
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
        }
        return mahasiswa;
    }

    public void printStudent(List<Student> mahasiswa){
        System.out.println("\n\nDetail Mahasiswa");
        double totalBayar = 0;

        
        for(int i = 0 ; i < mahasiswa.size() ; i++){
            System.out.println("Mahasiswa " + (i+1));
            mahasiswa.get(i).identitas();

            double bayarK = mahasiswa.get(i).getTotalP();
            System.out.println("Total Pembayaran : " + bayarK);
        }
    }
}
