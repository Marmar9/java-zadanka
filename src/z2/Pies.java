package z2;

public class Pies extends ImienneZwierze {
    private String imie;
    public Pies(int wiek, String imie) {
        super(wiek, imie);
    }

    public int getIleNog() {
        return 4;
    }

    public String dajGlos(){
        return "Hau hau";
    }

}
