
package quebracabeca;

public class Borda {
    private String tipoBorda;

    public Borda(String tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    public String getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(String tipoBorda) {
        this.tipoBorda = tipoBorda;
    }
    public boolean encaixarCom(Borda outraBorda) {
            return this.tipoBorda.equals(outraBorda.getTipoBorda());
    }
    
}
