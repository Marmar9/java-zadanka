package z4;

import java.util.ArrayList;
import java.util.List;

public abstract class Panstwo {
    private List<Panstwo> sasiedzi;
    private int liczbaLudnosci;
    public Panstwo(int liczbaLudnosci){
        this.liczbaLudnosci = liczbaLudnosci;
        this.sasiedzi = new ArrayList<Panstwo>();

    }

    public List<Panstwo> getSasiedzi() {
        return this.sasiedzi;
    }

    public void dodajSasiada(Panstwo sasiad) {
        this.sasiedzi.add(sasiad);
    }

    public int getLiczbaLudnosci() {
        return this.liczbaLudnosci;
    }
    public void migruj(Panstwo panstwo, int iloscLudzi){
        panstwo.liczbaLudnosci = panstwo.liczbaLudnosci + iloscLudzi;
        this.liczbaLudnosci = this.liczbaLudnosci - iloscLudzi;
    }

    public abstract String getStolica();
    public abstract Kontynent getKontynent();
}
