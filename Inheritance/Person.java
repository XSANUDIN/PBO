package PBO.Inheritance;

import PBO.Inheritance.Person;


public class Person {
    protected String name;
    protected String address;
    protected String hobi;

    public Person(String address, String name, String hobi){
        this.address = address;
        this.name = name;
        this.hobi = hobi;
    }
    
    public String getAddress(){
        return address;
    }

    public String getNama(){
        return name;
    }

    public String getHobi(){
        return hobi;
    }
    
    public void identitas(){
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Hoib : " + hobi);
    }
}
