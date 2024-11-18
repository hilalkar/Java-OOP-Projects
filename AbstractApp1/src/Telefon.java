public abstract class Telefon {
    protected String marka;
    protected String model;
    protected int fiyat;

    public Telefon(int fiyat,String marka, String model) {
        this.fiyat = fiyat;
        this.marka=marka;
        this.model=model;
    }

    public abstract  void aramaYap(String numara);
    public abstract void mesajGonder(String numara,String icerik);
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getFiyat(){
        return fiyat;
    }
}
