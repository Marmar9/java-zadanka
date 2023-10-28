package z4;

public abstract class PanstwoAzjatyckie extends Panstwo{
    public PanstwoAzjatyckie(int liczbaLudnosci){
        super(liczbaLudnosci);
    }
    public Kontynent getKontynent(){
        return Kontynent.AZJA;
    }
}
