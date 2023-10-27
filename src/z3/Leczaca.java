package z3;

public abstract class Leczaca extends Postac{
    private int mana;

    public Leczaca(int zycie, int mana){
        super(zycie);
        this.mana = mana;
    }

    public void wylecz(Postac postac) {
        int noweZycie = postac.getPunktyZycia() + 200;
        int nowaMana = this.mana -10;
        this.mana = nowaMana;
        postac.setPunktyZycia(noweZycie);
    }
    public void atakuj(Postac postac){
        int nowePunktyZycia = postac.getPunktyZycia()- 1;
        postac.setPunktyZycia(nowePunktyZycia);
    }
    public int getMana(){
        return this.mana;
    }
}
