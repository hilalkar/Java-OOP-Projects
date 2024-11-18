//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     /*   Öğrenci isminde bir sınıf ve bu sınıfın yaş ve boy diye değişkenleri
        olsun. Bu sınıfta yaş ve boy’a atama yapan yapılandırıcı olsun. Main
        kısmından iki adet nesne türetip bu nesnelere değer atayıp ekranda
        gösterelim  */

        // İlk öğrenci nesnesi
        Ogrenci ogrenci1 = new Ogrenci(20, 1.75);
        // İkinci öğrenci nesnesi
        Ogrenci ogrenci2 = new Ogrenci(22, 1.80);

        // Öğrenci bilgilerini ekranda göster
        ogrenci1.bilgiGoster();
        ogrenci2.bilgiGoster();

    }
}