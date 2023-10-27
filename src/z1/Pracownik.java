package z1;

public class Pracownik {
    private final Pracownik przelozony;
    private final int pensja;

    public Pracownik(Pracownik przelozony) {
        this.przelozony = przelozony;
        this.pensja = 0;
    }
    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }

    public int getPensja() {
        return pensja;
    }
}
