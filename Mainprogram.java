package oop.encapintegration;

/**
 *
 * @author iin
 */
public class Mainprogram {
    public static void main (String[] args){
        
        Hewan hw = new Hewan();
            System.out.println("Ini Kelas Hewan");
    System.out.println("");
            
        Ayamkampung ak = new Ayamkampung();
        ak.tampilayam();
        ak.tampilayamkampung();
        ak.printTempat();
        ak.printMakanan();
        
    System.out.println("");
    
        Gajah gj = new Gajah();
        gj.tampilkangajah();
        
    System.out.println("");
    
        Labalaba laba = new Labalaba();
        laba.tampilkanlabalaba();
    }
}
