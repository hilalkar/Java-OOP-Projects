public class Ogrenci {
    int yas;
    double boy;

    // Yapılandırıcı
    public Ogrenci(int yas, double boy) {
        this.yas = yas;
        this.boy = boy;
    }

    // Öğrenci bilgilerini ekranda gösteren bir metot
    public void bilgiGoster() {
        System.out.println("Yaş: " + yas + ", Boy: " + boy + " metre");
}}
