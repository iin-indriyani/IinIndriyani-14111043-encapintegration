package oop.encapintegration;

/**
 *
 * @author iin
 */
public class Ayamkampung extends Ayam {
    
    public void tampilayam(){
    System.out.println("Ini Kelas Ayam");
	Hewan hwn = new Hewan();
	hwn.setKulit("Bulu");
	System.out.println("Hewan ini ditutupi oleh : "+hwn.getKulit());
        hwn.setJumlahkaki(2);
	System.out.println("Hewan ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        hwn.setJenis("Unggas");
        System.out.println("Hewan ini termasuk jenis : "+hwn.getJenis());
    }
    
    public void tampilayamkampung(){
    
    
        System.out.println("Ini Kelas Ayam Kampung di Abstraksi Dari Kelas Ayam");
}
    @Override
    protected void printTempat(){
        System.out.println("Hewan ini tinggal di :"+super.getTempat());
    }

    @Override
    protected void printMakanan() {
        System.out.println("Makanan dari Hewan ini :"+super.getMakanan());
    }
    
}
