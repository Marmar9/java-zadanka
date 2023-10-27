package z3;

public abstract class Postac {
    private int punktyZycia;

    public Postac(int punktyZycia){
        this.punktyZycia = punktyZycia;
    }
    public void setPunktyZycia(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public int getPunktyZycia() {
        return this.punktyZycia;
    }
}
