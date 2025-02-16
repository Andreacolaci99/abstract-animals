package ClassiAstratte;

public class Passerotto extends Animale{

    private String nome;

    public Passerotto(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String faiVerso() {
        return "cinguettare";
    }

    @Override
    public String mangia() {
        return "semi";
    }  

    @Override
    public String toString() {
        return "Il passerotto " + getNome() + " sta dormendo " + dormi() + ". Il suo verso è " + faiVerso() + " e si ciba di " + mangia();
    }
    
}
