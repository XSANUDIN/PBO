package Polymorph;

public class segitiga {
    private int alas;
    private int tinggi;

    public segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int keliling(){
        return  (alas * tinggi)/2;
    }

    public void displayHasil(){
        System.out.println("\nKeliling Segitiga adalah : " + keliling() + "\n");
    }

}
