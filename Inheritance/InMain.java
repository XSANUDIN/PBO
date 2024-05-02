package PBO.Inheritance;

import java.util.List;

import PBO.Inheritance.Student;

public class InMain {
    public static void main(String[] inherit) {

        Student mahasiswa = new Student("","","","");
        List<Student> mhs = mahasiswa.inputMahasiswa();
        mahasiswa.inputPembayaran(mhs);
        mahasiswa.printStudent(mhs);
        
        //mahasiswa.nim = "A11.2022.14795";
        //mahasiswa.identitas();
        
    }
}
