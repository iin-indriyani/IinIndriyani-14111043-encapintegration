package oop.encapintegration;

/**
 *
 * @author iin
 */
public class Labalaba {
    public void tampilkanlabalaba(){
        System.out.println("Ini Kelas Laba-laba");
	Hewan hwn = new Hewan();
	hwn.setKulit("Bulu Halus dan Gelatin");
	System.out.println("Hewan ini ditutupi oleh : "+hwn.getKulit());
        hwn.setJumlahkaki(8);
	System.out.println("Hewan ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        hwn.setJenis("Insecta");
        System.out.println("Hewan ini termasuk jenis : "+hwn.getJenis());
}  
}
