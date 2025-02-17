package Interfacce;

public class Animali implements Nuotatori, Volatili{

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    } 

    public void faiVolare(Volatili volatili){
        volatili.vola();
    }
    
    public void faiNuotare(Nuotatori nuotatori){
        nuotatori.nuota();
    }
    
}
