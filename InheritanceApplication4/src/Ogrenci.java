public class Ogrenci extends Personel{
 private int ogrNo;

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public Ogrenci() {
        setIsim("Henüz girilmedi");
        setSoyisim("Henüz girilmedi");
        ogrNo=0;
        setYas(0);

    }
}
