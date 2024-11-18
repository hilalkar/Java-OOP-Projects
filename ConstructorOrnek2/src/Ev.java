public class Ev {
    int kapiNo;
    String sokakAdi;

    // Parametresiz yapılandırıcı
    public Ev() {
        this.kapiNo = 0;
        this.sokakAdi = "Bilinmiyor";
    }

    // Tek parametreli yapılandırıcı
    public Ev(int kapiNo) {
        this.kapiNo = kapiNo;
        this.sokakAdi = "Bilinmiyor";
    }

    // İki parametreli yapılandırıcı
    public Ev(int kapiNo, String sokakAdi) {
        this.kapiNo = kapiNo;
        this.sokakAdi = sokakAdi;
    }

    // Ev bilgilerini ekranda gösteren bir metot
    public void bilgiGoster() {
        System.out.println("Kapı No: " + kapiNo + ", Sokak Adı: " + sokakAdi);
    }
}

