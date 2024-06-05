package Polymorph;


public class persegiPanjang extends bangunAbstract{
    private int panjang;
    private int lebar;

    public persegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public int keliling(){
        return 2 * (panjang + lebar);
    }

    public void displayHasil(){
        System.out.println("\nKeliling Persegi Panjang adalah : " + keliling() + "\n");
    }
}
