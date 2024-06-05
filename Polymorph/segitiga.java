package Polymorph;

public class segitiga {
    private int alas;
    private int tinggi;
    private int sisiA;
    private int sisiB;
    private int sisiC;

    public segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public segitiga(int sisiA, int sisiB, int sisiC){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int luas(){
        return  (alas * tinggi)/2;
    }

    public int keliling(){
        return sisiA + sisiB + sisiC;
    }

    public void displayHasil(){
        System.out.println("\nKeliling Segitiga adalah : " + keliling() + "\n");
    }

}
