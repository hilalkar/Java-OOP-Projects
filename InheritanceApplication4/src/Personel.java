public class Personel {
    private String isim;
    private String soyisim;
    private int yas;

    public Personel(){
        isim= "henüz girilmedi ";
        soyisim="henüz girilmedi";
        yas= 0;


    }
    public void Personel(String isim,String soyisim,int yas){
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

