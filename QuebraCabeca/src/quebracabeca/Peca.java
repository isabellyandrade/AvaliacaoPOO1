
package quebracabeca;

public abstract class Peca {
    private Borda bordaSuperior;
    private Borda bordaInferior;
    private Borda bordaEsquerda;
    private Borda bordaDireita;

    public Peca(Borda bordaSuperior, Borda bordaInferior, Borda bordaEsquerda, Borda bordaDireita){
        this.bordaSuperior = bordaSuperior;
        this.bordaInferior = bordaInferior;
        this.bordaEsquerda = bordaEsquerda;
        this.bordaDireita = bordaDireita;
    }

    public Borda getBordaSuperior() {
        return bordaSuperior;
    }

    public Borda getBordaInferior() {
        return bordaInferior;
    }

    public Borda getBordaEsquerda() {
        return bordaEsquerda;
    }

    public Borda getBordaDireita() {
        return bordaDireita;
    }
    
    public abstract boolean encaixe(Peca outraPeca);
}



