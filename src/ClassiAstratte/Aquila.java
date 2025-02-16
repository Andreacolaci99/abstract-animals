package ClassiAstratte;

public class Aquila extends Animale{

    private String nome;

    public Aquila(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String faiVerso() {
        return "stridare";
    }

    @Override
    public String mangia() {
        return "carne";
    }  

    @Override
    public String toString() {
        return "L'aquila " + getNome() + " sta dormendo " + dormi() + ". Il suo verso è " + faiVerso() + " e si ciba di " + mangia();
    }
    
}
