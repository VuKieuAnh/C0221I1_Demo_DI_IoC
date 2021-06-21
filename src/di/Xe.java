package di;

public class Xe {
    private Banhxe banhxe;

    public Banhxe getBanhxe() {
        return banhxe;
    }

    public void setBanhxe(Banhxe banhxe) {
        this.banhxe = banhxe;
    }

    public Xe() {
    }

    public Xe(Banhxe banhxe) {
        this.banhxe = banhxe;
    }
    public void run(){
        banhxe.chay();
    }


}
