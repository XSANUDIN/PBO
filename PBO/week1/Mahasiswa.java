package PBO.week1;

public class Mahasiswa {
    public String[] nim, nama;
    public int[] usia;
    public Double[] ipk;

    public Mahasiswa(String[] nim, String[] nama, Double[] ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void printMhs() {
        for (int i = 0; i < nim.length; i++) {
            System.out.println("Detail mahasiswa " + (i+1));
            System.out.println("NIM: " + nim[i] + "\nNama: " + nama[i] + "\nIPK: " + ipk[i] + ("\n"));
        }
    }

    public void belajar(){
        System.out.println(this.nama + " belajar");
    }
}
