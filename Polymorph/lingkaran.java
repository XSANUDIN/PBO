package Polymorph;


public class lingkaran extends bangunAbstrac{    
    private int radius;
    private static double pi = 3.14;
    
    public lingkaran(int radius){
        this.radius = radius;
    }

    public int getRad(){
        return radius;
    }

    public int keliling(){
        return 2 * (int)pi * radius;
    }

    public void displayHasil(){
        System.out.println("\nKeliling Lingkaran adalah : " + keliling() + "\n");
    }
}
