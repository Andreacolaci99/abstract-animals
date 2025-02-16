package ClassiAstratte;

public class Delfino extends Animale{

    private String nome;

    public Delfino(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String faiVerso() {
        return "scoppiettare";
    }

    @Override
    public String mangia() {
        return "pesci";
    }  

    @Override
    public String toString() {
        return "Il delfino " + getNome() + " sta dormendo " + dormi() + ". Il suo verso è " + faiVerso() + " e si ciba di " + mangia();
    }
    
}
