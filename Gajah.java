package oop.encapintegration;

/**
 *
 * @author iin
 */
public class Gajah {
  public void tampilkangajah(){
        System.out.println("Ini Kelas Gajah");
	Hewan hwn = new Hewan();
	hwn.setKulit("Kulit Keras");
	System.out.println("Hewan ini ditutupi oleh : "+hwn.getKulit());
        hwn.setJumlahkaki(4);
	System.out.println("Hewan ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        hwn.setJenis("Mamalia");
        System.out.println("Hewan ini termasuk jenis : "+hwn.getJenis());
}  
}
