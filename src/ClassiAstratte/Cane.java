package ClassiAstratte;

public class Cane extends Animale{

    private String nome;
    
    public Cane(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String faiVerso() {
        return "abbaiare";
    }

    @Override
    public String mangia() {
        return "carne";
    }  

    @Override
    public String toString() {
        return "Il cane " + getNome() + " sta dormendo " + dormi() + ". Il suo verso è " + faiVerso() + " e si ciba di " + mangia();
    }
    
}