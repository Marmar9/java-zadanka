package z2;

public abstract class ImienneZwierze extends Zwierze {
        private String imie;
        public ImienneZwierze(int wiek, String imie){
            super(wiek);
            this.imie = imie;
        }
        public abstract int getIleNog();

    public String getImie() {
        return imie;
    }
}
