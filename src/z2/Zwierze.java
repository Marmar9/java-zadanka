package z2;

public abstract class Zwierze {
    private int wiek;
    public Zwierze(int wiek){
        this.wiek = wiek;
    }
    public abstract int getIleNog();
    public abstract String dajGlos();
    public int getWiek() {
        return this.wiek;
    }
}
