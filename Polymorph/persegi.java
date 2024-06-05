package Polymorph;

public class persegi extends bangunAbstrac{
    private int sisi;

    public persegi (int sisi){
        this.sisi = sisi;
    }

    public int getSisi(){
        return sisi;
    }

    public int keliling(){
        return 4 * sisi;
    }
    
    public void displayHasil(){
        System.out.println("\nKeliling Persegi adalah : " + keliling() + "\n");
    }

}
