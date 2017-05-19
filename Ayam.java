package oop.encapintegration;

/**
 *
 * @author iin
 */
public abstract class Ayam {
    protected String tempat = "Darat";
    protected String makanan = "cacing";
    
    protected String getTempat(){
    return tempat;
    }
    
    protected String getMakanan(){
        return makanan;
    }
    
    protected abstract void printTempat();
    
    protected abstract void printMakanan();
    
}
