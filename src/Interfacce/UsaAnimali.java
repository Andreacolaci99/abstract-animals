package Interfacce;

public class UsaAnimali {
    
    public static void main(String[] args) {
    
        Animali delfino = new Animali();
        delfino.faiNuotare(delfino);

        Animali aquila = new Animali();
        aquila.faiVolare(aquila);
    }
}
