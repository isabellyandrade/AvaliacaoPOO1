
package quebracabeca;

public class QuebraCabeca {

    private Peca[][] tabuleiro;
    
    public QuebraCabeca(){
        tabuleiro = new Peca[3][3];
    }
    
    public void adicionarPeca(int linha, int coluna, Peca peca){
        
        if(linha >= 0 && linha < 3 && coluna >=0 && coluna < 3){
            tabuleiro[linha][coluna] = peca;
        }
    }
    
    public boolean verificarEncaixe(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j < 2 && tabuleiro[i][j] != null && tabuleiro[i][j+1] != null){
                    if(!tabuleiro[i][j].encaixe(tabuleiro[i][j+1])){
                        System.out.println("Erro ao encaixar na horizontal");
                        return false;
                    }
                }
                if(i < 2 && tabuleiro[i][j] != null && tabuleiro[i+1][j] != null){
                    if(!tabuleiro[i][j].encaixe(tabuleiro[i+1][j])){
                        System.out.println("Erro ao encaixar na horizontal");
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Borda borda1 = new Borda("A");
       Borda borda2 = new Borda("B");
       Borda borda3 = new Borda("C");
       Borda borda4 = new Borda("D");
       Borda borda5 = new Borda("E");
       Borda borda6 = new Borda("F");
       Borda borda7 = new Borda("G");
       Borda borda8 = new Borda("H");
       Borda borda9 = new Borda("I");

       Peca peca1 = new PecaSimples(borda1, borda2, borda3, borda4);
       Peca peca2 = new PecaSimples(borda2, borda3, borda4, borda5);
       Peca peca3 = new PecaSimples(borda3, borda4, borda5, borda6);
       Peca peca4 = new PecaSimples(borda4, borda5, borda6, borda7);
       Peca peca5 = new PecaSimples(borda5, borda6, borda7, borda8);
       Peca peca6 = new PecaSimples(borda6, borda7, borda8, borda9);
       Peca peca7 = new PecaSimples(borda7, borda8, borda9, borda1);
       Peca peca8 = new PecaSimples(borda8, borda9, borda1, borda2);
       Peca peca9 = new PecaSimples(borda9, borda1, borda2, borda3);

       QuebraCabeca quebraCabeca = new QuebraCabeca();
       
       quebraCabeca.adicionarPeca(0, 0, peca1);
       quebraCabeca.adicionarPeca(0, 1, peca2);
       quebraCabeca.adicionarPeca(0, 2, peca3);
       quebraCabeca.adicionarPeca(1, 0, peca4);
       quebraCabeca.adicionarPeca(1, 1, peca5);
       quebraCabeca.adicionarPeca(1, 2, peca6);
       quebraCabeca.adicionarPeca(2, 0, peca7);
       quebraCabeca.adicionarPeca(2, 1, peca8);
       quebraCabeca.adicionarPeca(2, 2, peca9);

       if(quebraCabeca.verificarEncaixe()){
           System.out.println("O quebra cabeca esta montado corretamente");
       }else{
           System.out.println("O quebra cabeca nao esta montado corretamente");           
       }
    }
}
