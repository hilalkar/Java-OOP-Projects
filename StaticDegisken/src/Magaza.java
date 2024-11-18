public class Magaza {
    private static String siparisKod;
    private static String magazaKod;
    private static double indirim;

    // static metotlar sadece static metotlara erişebilir
    //bir sınıfın tüm örneklerinin aynı değeri
    // kullanması gerektiğinde static değişkenler kullanışlıdır.
    // static ile this veya super kuallanılamaz hata verir

    public Magaza(String siparisKod){
        this.siparisKod=siparisKod;
    }
    public void setSiparisKod(String siparisKod){
        this.siparisKod=siparisKod;

    }
    public static String getSiparisKod(){
        return siparisKod;
    }
    public static String getMagazaKod(){
        return magazaKod;
    }
    public static void setMagazaKod(String magazaKod) {
        Magaza.magazaKod = magazaKod;
    }
    public static double getIndirim(){
        return indirim;
    }

    public static void setIndirim(double indirim) {
        Magaza.indirim = indirim;
    }




}
