package z3;

public abstract class Walczaca extends Postac{
    private int sila;
    public Walczaca(int punktyZycia, int sila) {
        super(punktyZycia);
        this.sila = sila;
    }
    public void atakuj(Postac postac){
        int nowePunktyZycia = postac.getPunktyZycia()- sila;
        postac.setPunktyZycia(nowePunktyZycia);
    }
    public int getSila() {
        return this.sila;
    }
}
