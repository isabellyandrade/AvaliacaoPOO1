
package quebracabeca;

class PecaSimples extends Peca {
    
    public PecaSimples(Borda bordaSuperior, Borda bordaInferior, Borda bordaEsquerda, Borda bordaDireita) {
        super(bordaSuperior, bordaInferior, bordaEsquerda, bordaDireita);
    }

    @Override
    public boolean encaixe(Peca outraPeca) {
        
        return this.getBordaDireita().encaixarCom(outraPeca.getBordaEsquerda()) 
            && this.getBordaInferior().encaixarCom(outraPeca.getBordaSuperior());
    }

}