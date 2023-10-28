package z4;

public abstract class PanstwoEuropejskie extends Panstwo{
    public PanstwoEuropejskie(int liczbaLudnosci){
        super(liczbaLudnosci);
    }
    public Kontynent getKontynent(){
        return Kontynent.EUROPA;
    }
}
